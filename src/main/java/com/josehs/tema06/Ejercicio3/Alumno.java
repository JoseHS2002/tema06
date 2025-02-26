package com.josehs.tema06.Ejercicio3;

import java.time.LocalDate;

public class Alumno {
    private int nia;
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private String grupo;
    private String telefono;

    /**
     *
     * @param nia
     * @param nombre
     * @param apellidos
     * @param fechaNacimiento
     * @param grupo
     * @param telefono
     */
    public Alumno(int nia, String nombre, String apellidos, LocalDate fechaNacimiento, String grupo, String telefono) {
        this.nia = nia;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.grupo = grupo;
        this.telefono = telefono;
    }

    public int getNia() {
        return nia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getGrupo() {
        return grupo;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "NIA: " + nia +
                ", Nombre: " + nombre +
                ", Apellidos: " + apellidos +
                ", Fecha de nacimiento: " + fechaNacimiento +
                ", Grupo: " + grupo +
                ", Teléfono: " + telefono;
    }
}
