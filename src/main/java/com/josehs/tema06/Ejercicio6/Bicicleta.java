package com.josehs.tema06.Ejercicio6;

import java.util.Date;

public class Bicicleta {
    private String referencia;
    private String marca;
    private String modelo;
    private boolean tieneMotor;
    private Date fechaFabricacion;
    private double precio;
    private int cantidad;

    public Bicicleta(String referencia, String marca, String modelo,
                     boolean tieneMotor, Date fechaFabricacion, double precio, int cantidad) {
        this.referencia = referencia;
        this.marca = marca;
        this.modelo = modelo;
        this.tieneMotor = tieneMotor;
        this.fechaFabricacion = fechaFabricacion;
        this.precio = precio;
        this.cantidad = cantidad;
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

    public boolean tieneMotor() {
        return tieneMotor;
    }

    public Date getFechaFabricacion() {
        return fechaFabricacion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void mostrarDatos() {
        System.out.println("Referencia: " + referencia);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Motor: " + (tieneMotor ? "Sí" : "No"));
        System.out.println("Fecha de fabricación: " + fechaFabricacion);
        System.out.println("Precio: " + precio + " €");
        System.out.println("Cantidad: " + cantidad);

    }

}
