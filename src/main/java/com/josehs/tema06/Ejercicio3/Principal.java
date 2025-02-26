package com.josehs.tema06.Ejercicio3;


public class Principal {
    public static void main(String[] args) {
        GestionAlumnos gestionAlumnos = new GestionAlumnos();
        gestionAlumnos.iniciar();
    }

    static void mostrarMenu() {
        System.out.println("*********************");
        System.out.println("** GESTIÓN ALUMNOS **");
        System.out.println("*********************");
        System.out.println("1. Nuevo alumno ...");
        System.out.println("2. Baja de alumno ...");
        System.out.println("3. Consultas ...");
        System.out.println("------------------------------");
        System.out.println("0. Salir");
    }

    static void mostrarMenuConsultas() {
        System.out.println("***************");
        System.out.println("** CONSULTAS **");
        System.out.println("***************");
        System.out.println("1. Por grupo ...");
        System.out.println("2. Por edad ...");
        System.out.println("3. Por nia ...");
        System.out.println("4. Por apellidos ...");
        System.out.println("--------------------");
        System.out.println("0. Volver al menú principal");
    }



}
