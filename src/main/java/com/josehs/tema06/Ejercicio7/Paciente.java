package com.josehs.tema06.Ejercicio7;

import java.time.LocalDateTime;

public class Paciente {
    private final String sip;
    private final String nombre;
    private final Genero genero;
    private int edad;
    private LocalDateTime fechaHoraEntrada;
    private String sintomatologia;
    private LocalDateTime fechaHoraAlta;

    public Paciente(String sip, String nombre, String sexo, int edad, String sintomatologia) {
        this.sip = sip;
        this.nombre = nombre;
        this.genero = Genero.Mujer;
        this.edad = edad;
        this.fechaHoraEntrada = LocalDateTime.now();
        this.sintomatologia = sintomatologia;
        this.fechaHoraAlta = LocalDateTime.now();
    }

    public String getSip() {
        return sip;
    }

    public String getNombre() {
        return nombre;
    }

    public enum Genero {
        Hombre, Mujer, No_Binario
    }

    public int getEdad() {
        return edad;
    }

    public LocalDateTime getFechaHoraEntrada() {
        return fechaHoraEntrada;
    }

    public String getSintomatologia() {
        return sintomatologia;
    }

    public LocalDateTime getFechaHoraAlta() {
        return fechaHoraAlta;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "sip=" + sip +
                ", nombre=" + nombre +
                ", genero=" + genero +
                ", edad=" + edad +
                ", fechaHoraEntrada=" + fechaHoraEntrada +
                ", tieneMotor=" + sintomatologia +
                ", fechaHoraAlta=" + fechaHoraAlta +
                '}';
    }
}
