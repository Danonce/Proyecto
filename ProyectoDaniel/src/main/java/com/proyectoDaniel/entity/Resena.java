/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoDaniel.entity;

/**
 *
 * @author danon
 */
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "resenas")
@Data
public class Resena {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idresena;

    private Long idcafeteria;
    private String nombre;
    private String correo;
    private String comentario;
    private int calificacion;
}
