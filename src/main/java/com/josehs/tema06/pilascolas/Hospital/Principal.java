package com.josehs.tema06.pilascolas.Hospital;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hospital hospital = new Hospital();

        while (true) {
            System.out.println("=== HOSPITAL ===");
            System.out.println("1. Añadir paciente");
            System.out.println("2. Atender siguiente paciente");
            System.out.println("3. Mostrar estado de las colas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce el nombre del paciente:");
                    String nombrePaciente = scanner.next();
                    System.out.println("Introduce el SIP del paciente:");
                    String SIPPaciente = scanner.next();
                    hospital.agregarPaciente(new Paciente(nombrePaciente, SIPPaciente));
                    break;
                case 2:
                    hospital.atenderSiguientePaciente();
                    break;
                case 3:
                    hospital.mostrarEstadoColas();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }

}
