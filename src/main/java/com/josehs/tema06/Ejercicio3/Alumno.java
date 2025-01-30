package com.josehs.tema06.Ejercicio3;

import java.util.Date;
import java.time.LocalDate;
import java.time.Period;

public class Alumno {
    int nia;
    String nombre;
    String apellidos;
    Date fechaNacimiento;
    String grupo;

    public Alumno(int nia, String nombre, String apellidos, Date fechaNacimiento, String grupo) {
        this.nia = nia;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.grupo = grupo;
    }

    public String toString() {
        return ", Nombre: " + nombre + ", Apellidos: " + apellidos +
                ", Fecha de Nacimiento: " + fechaNacimiento + ", Grupo: " + grupo;
    }

    public static int calcularEdad(LocalDate fechaNacimiento) {
        LocalDate hoy = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, hoy);
        return periodo.getYears();
    }

}
