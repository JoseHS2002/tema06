package com.josehs.tema06.Ejercicio3;

import java.util.Date;
import java.util.Scanner;

public class GestionAlumnos {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println();
    }

    private static void mostrarMenu() {
        System.out.println("*********************");
        System.out.println("** GESTIÓN ALUMNOS **");
        System.out.println("*********************");
        System.out.println("1. Nuevo alumno …");
        System.out.println("2. Baja de alumno …");
        System.out.println("3. Consultas …");
        System.out.println("------------------------------");
        System.out.println("0. Salir.");
        System.out.print("Seleccione una opción: ");
    }

    private static void nuevoAlumno() {
        System.out.print("Dime el NIA: ");
        int nia = scanner.nextInt();

        System.out.print("Dime el nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Dime los apellidos: ");
        String apellidos = scanner.nextLine();
        System.out.print("Dime la fecha de nacimiento (dd/mm/yyyy): ");
        String fecha = scanner.nextLine();
        Date fechaNacimiento = new Date();

        System.out.print("Dime el grupo: ");
        String grupo = scanner.nextLine();
        System.out.print("Dime el teléfono de contacto: ");
        String telefono = scanner.nextLine();

        System.out.println("Alumno agregado con éxito.");
    }

    private static void bajaAlumno() {
        System.out.print("Dime el NIA del alumno a eliminar: ");
        int nia = scanner.nextInt();

    }

    private static void consultas() {

        System.out.println("***************");
        System.out.println("** CONSULTAS **");
        System.out.println("***************");
        System.out.println("1. Por grupo …");
        System.out.println("2. Por edad …");
        System.out.println("3. Por NIA …");
        System.out.println("4. Por apellidos …");
        System.out.println("--------------------");
        System.out.println("0. Volver al menú principal.");
        System.out.print("Seleccione una opción: ");
    }
}
