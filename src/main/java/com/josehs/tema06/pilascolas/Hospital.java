package com.josehs.tema06.pilascolas;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hospital {
    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("=== HOSPITAL ===");
            System.out.println("1. Añadir paciente");
            System.out.println("2. Atender siguiente paciente");
            System.out.println("3. Mostrar estado de las colas");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");

            opcion = new java.util.Scanner(System.in).nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el número de la consulta: ");
                    int consultaElegida = new java.util.Scanner(System.in).nextInt() - 1;
                    System.out.print("Ingrese el nombre del paciente: ");
                    String nombrePaciente = new java.util.Scanner(System.in).next();
                    System.out.print("Ingrese el SIP del paciente: ");
                    String SIP = new java.util.Scanner(System.in).next();
                    break;
                case 2:
                    System.out.print("Ingrese el número de la consulta: ");
                    int consultaElegida2 = new java.util.Scanner(System.in).nextInt() - 1;
                    break;
                case 3:

                case 4:
                    // Salir
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);
    }
}
