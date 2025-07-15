/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoDaniel.repository;

/**
 *
 * @author danon
 */
import com.proyectoDaniel.entity.Cafeteria;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CafeteriaRepository extends JpaRepository<Cafeteria, Integer> {
    List<Cafeteria> findByNombreCafeteriaContainingIgnoreCase(String nombre);
    List<Cafeteria> findByMenuContainingIgnoreCase(String menu);
    List<Cafeteria> findByUbicacionContainingIgnoreCase(String ubicacion);
}
