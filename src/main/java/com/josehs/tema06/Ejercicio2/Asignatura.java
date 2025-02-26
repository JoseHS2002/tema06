package com.josehs.tema06.Ejercicio2;

public class Asignatura {

    private String nombre;
    private int codigo;
    private int curso;

    public Asignatura(String nombre, int codigo, int curso) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getCurso() {
        return curso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Asignatura that = (Asignatura) o;
        return codigo == that.codigo;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "nombre='" + nombre + '\'' +
                ", codigo=" + codigo +
                ", curso='" + curso + '\'' +
                '}';
    }

}