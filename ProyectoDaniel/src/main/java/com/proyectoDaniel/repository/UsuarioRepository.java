/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoDaniel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.proyectoDaniel.entity.Usuario;

/**
 *
 * @author danon
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByCorreo(String correo);
}
