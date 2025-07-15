/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoDaniel.controller;

/**
 *
 * @author danon
 */
import com.proyectoDaniel.Service.CafeteriaService;
import com.proyectoDaniel.entity.Cafeteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cafeterias")
@CrossOrigin(origins = "*")
public class CafeteriaController {

    @Autowired
    private CafeteriaService service;

    @GetMapping("/todas")
    public List<Cafeteria> listarTodas() {
        return service.listarTodas();
    }

    @GetMapping("/buscar")
    public List<Cafeteria> buscar(
            @RequestParam(required = false) String nombre,
            @RequestParam(required = false) String menu,
            @RequestParam(required = false) String ubicacion) {
        
        if (nombre != null && !nombre.isEmpty()) {
            return service.buscarPorNombre(nombre);
        }
        if (menu != null && !menu.isEmpty()) {
            return service.buscarPorMenu(menu);
        }
        if (ubicacion != null && !ubicacion.isEmpty()) {
            return service.buscarPorUbicacion(ubicacion);
        }
        return service.listarTodas();
    }
}
