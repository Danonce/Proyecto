/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoDaniel.entity;

/**
 *
 * @author danon
 */
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cafeteria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCafeteria;

    private String nombreCafeteria;
    private String menu;
    private String ubicacion;
    private String horario;

    // Getters y Setters
    public Integer getIdCafeteria() { return idCafeteria; }
    public void setIdCafeteria(Integer idCafeteria) { this.idCafeteria = idCafeteria; }

    public String getNombreCafeteria() { return nombreCafeteria; }
    public void setNombreCafeteria(String nombreCafeteria) { this.nombreCafeteria = nombreCafeteria; }

    public String getMenu() { return menu; }
    public void setMenu(String menu) { this.menu = menu; }

    public String getUbicacion() { return ubicacion; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }

    public String getHorario() { return horario; }
    public void setHorario(String horario) { this.horario = horario; }
}
