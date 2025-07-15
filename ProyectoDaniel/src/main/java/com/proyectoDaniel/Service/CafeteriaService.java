/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoDaniel.Service;

/**
 *
 * @author danon
 */
import com.proyectoDaniel.entity.Cafeteria;
import com.proyectoDaniel.repository.CafeteriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CafeteriaService {

    @Autowired
    private CafeteriaRepository repository;

    public List<Cafeteria> buscarPorNombre(String nombre) {
        return repository.findByNombreCafeteriaContainingIgnoreCase(nombre);
    }

    public List<Cafeteria> buscarPorMenu(String menu) {
        return repository.findByMenuContainingIgnoreCase(menu);
    }

    public List<Cafeteria> buscarPorUbicacion(String ubicacion) {
        return repository.findByUbicacionContainingIgnoreCase(ubicacion);
    }

    public List<Cafeteria> listarTodas() {
        return repository.findAll();
    }
    public Cafeteria obtenerPorId(Integer id) {
        return repository.findById(id).orElse(null);
    }
}

