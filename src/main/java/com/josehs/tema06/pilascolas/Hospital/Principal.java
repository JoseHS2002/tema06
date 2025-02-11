package com.josehs.tema06.pilascolas.Hospital;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Principal {
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();
    public static void main(String[] args) {
        
        List<Medico> medicos = new ArrayList<>();
        
        Hospital<Paciente> hospital = new Hospital<>();

        int opcion;
        do {
            System.out.println("=== HOSPITAL ===");
            System.out.println("1. Añadir paciente");
            System.out.println("2. Atender siguiente paciente");
            System.out.println("3. Mostrar estado de las colas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    hospital.mostrarEstadoColas();
                    System.out.print("Seleccione la consulta a la que añadir el paciente: ");

                    System.out.print("Introduzca el nombre del paciente: ");

                    System.out.print("Introduzca el SIP del paciente: ");
                    break;
                case 2:
                    hospital.mostrarEstadoColas();
                    System.out.print("Seleccione la consulta a la que atender: ");

                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcion != 4);
    }

}

