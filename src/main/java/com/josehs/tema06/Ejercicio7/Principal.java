package com.josehs.tema06.Ejercicio7;

import java.util.Scanner;

public class Principal {
    public static Scanner scanner = new Scanner(System.in);
    public static CentroSalud centroSalud;
    public static void main(String[] args) {
        CentroSalud centroSalud = new CentroSalud();

        int opcion;

        do {
            System.out.println("********************");
            System.out.println("** URGENCIAS **");
            System.out.println("********************");
            System.out.println("1. Nuevo paciente …");
            System.out.println("2. Atender paciente …");
            System.out.println("3. Consultas …");
            System.out.println("4. Alta médica …");
            System.out.println("-----------------------------");
            System.out.println("0. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese SIP:");
                    String sip = scanner.nextLine();
                    System.out.println(sip);
                    System.out.println("Ingrese Nombre:");
                    String nombre = scanner.nextLine();
                    System.out.println(nombre);
                    System.out.println("Ingrese Genero:");
                    String genero = scanner.nextLine();
                    System.out.println(genero);
                    System.out.println("Ingrese Edad:");
                    int edad = scanner.nextInt();
                    System.out.println(edad);
                    System.out.println("Ingrese Sintomatología:");
                    String sintomatologia = scanner.nextLine();
                    System.out.println(sintomatologia);
                    scanner.nextLine();
                    break;
                centroSalud.anyadirPaciente(sip, nombre, genero, edad, sintomatologia);
                case 2:
                    System.out.println("Ingrese SIP del paciente a atender:");

                    break;

                case 3:
                    mostrarSubmenuConsultas();
                    break;

                case 4:
                    System.out.println("Ingrese SIP del paciente para dar de alta:");

                    System.out.println("Alta médica registrada.");
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion invalida. Intentalo de nuevo.");
            }
        } while (opcion != 0);
        scanner.close();
    }

    private static void mostrarSubmenuConsultas() {
        int opcion;
        do {
            System.out.println("***************");
            System.out.println("** CONSULTAS **");
            System.out.println("***************");
            System.out.println("1. Por Sip …");
            System.out.println("2. Por fechas …");
            System.out.println("3. Estadísticas");
            System.out.println("4. Mostrar histórico mensual");
            System.out.println("--------------------------------");
            System.out.println("0. Volver al menú principal");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el SIP del paciente hospitalizado");
                    break;

                case 2:
                    System.out.println("Ingrese la fecha de ingreso");

                    System.out.println("Ingrese la fecha de alta");

                    break;
                case 3:
                    System.out.println("sintomatologia");
                    break;
                case 4:
                    System.out.println("historial");
                    break;
                case 0:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opcion invalida. Intentalo de nuevo");
            }
        } while (opcion != 0);
    }
}
