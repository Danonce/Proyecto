/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoDaniel.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.proyectoDaniel.Service.UsuarioService;
import com.proyectoDaniel.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;


import java.util.Optional;
/**
 *
 * @author danon
 */
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/registro")
    public Usuario registrar(@RequestBody Usuario usuario) {
        return usuarioService.registrarUsuario(usuario);
    }

    @PutMapping("/perfil/{id}")
    public Usuario actualizarPerfil(@PathVariable Long id, @RequestBody Usuario usuario) {
        usuario.setIdUsuario(id);
        return usuarioService.actualizarPerfil(usuario);
    }

    @GetMapping("/{correo}")
    public Optional<Usuario> obtenerPorCorreo(@PathVariable String correo) {
        return usuarioService.obtenerPorCorreo(correo);
    }
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> loginData) {
        String correo = loginData.get("correo");
        String contrasena = loginData.get("contrasena");

        Usuario usuario = usuarioService.obtenerPorCorreo(correo).orElse(null);

        if (usuario != null && usuario.getContrasena().equals(contrasena)) {
            Map<String, Object> response = new HashMap<>();
            response.put("idUsuario", usuario.getIdUsuario());
            response.put("nombreUsuario", usuario.getNombreUsuario());
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenciales inválidas");
        }
    }
}

