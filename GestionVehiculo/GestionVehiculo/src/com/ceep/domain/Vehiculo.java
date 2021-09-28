/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ceep.domain;

/**
 *
 * @author Alumno mañana
 */
public class Vehiculo {
//DEFINICION DE ATRIBUTOS
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private double tarifa;
    private boolean disponible;

    //GET
    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public double getTarifa() {
        return tarifa;
    }

    public boolean isDisponible() {
        return disponible;
    }
    
    //SET
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    public void getAtributos(){
        System.out.println("\n- Matricula: "+matricula +"\n- Marca: "+ marca + "\n- Modelo: "+ modelo+"\n- Color: "+color+"\n- Tarifa: "+tarifa+"\n- Disponible: "+disponible);
    }
    
    //CONSTRUCTOR

    public Vehiculo(String matricula, String marca, String modelo, String color, double tarifa, boolean disponible) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = disponible;
    }
    
}
