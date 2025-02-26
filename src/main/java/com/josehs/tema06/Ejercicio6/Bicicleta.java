package com.josehs.tema06.Ejercicio6;

import java.time.LocalDate;

public class Bicicleta {
    private String referencia;
    private String marca;
    private String modelo;
    private double peso;
    private int tamanyoRuedas;
    private boolean tieneMotor;
    private LocalDate fechaFabricacion;
    private double precio;
    private int stock;

    /**
     *
     * @param referencia
     * @param marca
     * @param modelo
     * @param peso
     * @param tamayoRuedas
     * @param tieneMotor
     * @param fechaFabricacion
     * @param precio
     * @param stock
     */
    public Bicicleta(String referencia, String marca, String modelo, double peso, int tamayoRuedas, boolean tieneMotor, LocalDate fechaFabricacion, double precio, int stock) {
        this.referencia = referencia;
        this.marca = marca;
        this.modelo = modelo;
        this.peso = peso;
        this.tamanyoRuedas = tamanyoRuedas;
        this.tieneMotor = tieneMotor;
        this.fechaFabricacion = fechaFabricacion;
        this.precio = precio;
        this.stock = stock;
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

    public int getTamanyoRuedas() {
        return tamanyoRuedas;
    }

    public boolean isTieneMotor() {
        return tieneMotor;
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void incrementarStock() {
        stock++;
    }

    public void disminuirStock() {
        stock--;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "referencia='" + referencia + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", tamanyoRuedas=" + tamanyoRuedas +
                ", tieneMotor=" + tieneMotor +
                ", fechaFabricacion=" + fechaFabricacion +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }
}