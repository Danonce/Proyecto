/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoDaniel.Service;

import com.proyectoDaniel.entity.Usuario;
import com.proyectoDaniel.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

/**
 *
 * @author danon
 */
@Service
public class UsuarioService{

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario registrarUsuario(Usuario usuario) {
        usuario.setAdministrador(false); // por defecto
        return usuarioRepository.save(usuario);
    }

    public Optional<Usuario> obtenerPorCorreo(String correo) {
        return Optional.ofNullable(usuarioRepository.findByCorreo(correo));
    }

    public Usuario actualizarPerfil(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
}