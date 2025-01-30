package com.josehs.tema06.Ejercicio2;

public class Ejercicio2 {
    public static void main(String[] args) {
        Asignatura asignatura = new Asignatura("Programación", 1017, 1);
        System.out.println("Nombre: " + asignatura.getNombre());
        System.out.println("Codigo: " + asignatura.getCodigo());
        System.out.println("Curso: " + asignatura.getCurso());
    }
}

class Asignatura {
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
}
