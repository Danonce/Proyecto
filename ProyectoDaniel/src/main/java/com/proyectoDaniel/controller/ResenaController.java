/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoDaniel.controller;

/**
 *
 * @author danon
 */
import com.proyectoDaniel.proyecto.model.Resena;
import com.proyectoDaniel.proyecto.repository.ResenaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/resenas")
@CrossOrigin(origins = "*")
public class ResenaController {

    private final ResenaRepository resenaRepository;

    public ResenaController(ResenaRepository resenaRepository) {
        this.resenaRepository = resenaRepository;
    }

    @GetMapping("/cafeteria/{idCafeteria}")
    public List<Resena> obtenerResenasPorCafeteria(@PathVariable Long idCafeteria) {
        return resenaRepository.findByIdcafeteria(idCafeteria);
    }
}

