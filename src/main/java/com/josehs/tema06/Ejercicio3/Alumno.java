package com.josehs.tema06.Ejercicio3;

import java.util.Scanner;

public class Alumno {
    int nia;
    String nombre;
    String apellidos;
    String fechaNacimiento;
    String grupo;
    int telefono;

    public Alumno(int nia, String nombre, String apellidos, String fechaNacimiento, String grupo, int telefono) {
        this.nia = nia;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.grupo = grupo;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Apellidos: " + apellidos + ", Fecha de Nacimiento: " + fechaNacimiento + ", Grupo: " + grupo;
    }

    public int getNia() {
        return "NIA: " + nia;
    }

    public int getTelefono() {
        return "Telefono: " + telefono;
    }
}

private static void mostrarMenu() {
    System.out.println("*********************");
    System.out.println("** GESTIÓN ALUMNOS **");
    System.out.println("*********************");
    System.out.println("1. Nuevo alumno …");
    System.out.println("2. Baja de alumno …");
    System.out.println("3. Consultas …");
    System.out.println("------------------------------");
    System.out.println("0. Salir");
}

private static void nuevoAlumno(Scanner scanner) {
    System.out.print("Ingrese el NIA: ");
    int nia = scanner.nextInt();

    System.out.print("Ingrese el nombre: ");
    String nombre = scanner.nextLine();
    System.out.print("Ingrese los apellidos: ");
    String apellidos = scanner.nextLine();
    System.out.print("Ingrese la fecha de nacimiento (dd/mm/aaaa): ");
    String fechaNacimiento = scanner.nextLine();
    System.out.print("Ingrese el grupo: ");
    String grupo = scanner.nextLine();
    System.out.print("Ingrese el teléfono de contacto: ");
    int telefono = scanner.nextInt();

    Alumno nuevoAlumno = new Alumno(nia, nombre, apellidos, fechaNacimiento, grupo, telefono);
    System.out.println("¡Alumno añadido con éxito!");
}

private static void bajaAlumno(Scanner scanner) {
    System.out.print("Ingrese el NIA del alumno a eliminar: ");
    int nia = scanner.nextInt();

    System.out.print("¿Está seguro de que desea eliminar al alumno? (s/n): ");

}

