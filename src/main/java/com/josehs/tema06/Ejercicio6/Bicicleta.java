package com.josehs.tema06.Ejercicio6;

import java.util.ArrayList;
import java.util.Scanner;

public class Bicicleta {
    private String referencia;
    private String marca;
    private String modelo;
    private double peso;
    private double tamanyoRuedas;
    private boolean tieneMotor;
    private String fechaFabricacion;
    private double precio;
    private int existencias;

    public Bicicleta(String referencia, String marca, String modelo, double peso, double tamanyoRuedas, boolean tieneMotor, String fechaFabricacion, double precio, int existencias) {
        this.referencia = referencia;
        this.marca = marca;
        this.modelo = modelo;
        this.peso = peso;
        this.tamanyoRuedas = tamanyoRuedas;
        this.tieneMotor = tieneMotor;
        this.fechaFabricacion = fechaFabricacion;
        this.precio = precio;
        this.existencias = existencias;
    }

    public String getReferencia() {
        return referencia;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public double getPeso() {
        return peso;
    }
    public double getTamanyoRuedas() {
        return tamanyoRuedas;
    }
    public boolean tieneMotor() {
        return tieneMotor;
    }
    public String getFechaFabricacion() {
        return fechaFabricacion;
    }
    public double getPrecio() {
        return precio;
    }
    public int getExistencias() {
        return existencias;
    }

}
