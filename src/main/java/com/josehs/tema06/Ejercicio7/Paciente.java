package com.josehs.tema06.Ejercicio7;

import java.time.LocalDateTime;

public class Paciente {
    private String sip;
    private String nombre;
    private String sexo;
    private int edad;
    private LocalDateTime fechaHoraEntrada;
    private String sintomatologia;
    private LocalDateTime fechaAlta;
    private double[] preRev = new double[4];

    public Paciente(String sip, String nombre, String sexo, int edad, String sintomatologia) {
        this.sip = sip;
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.fechaHoraEntrada = LocalDateTime.now();
        this.sintomatologia = sintomatologia;
        this.fechaAlta = null;
    }
}
