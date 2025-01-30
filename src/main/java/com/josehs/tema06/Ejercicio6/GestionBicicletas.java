package com.josehs.tema06.Ejercicio6;

import java.util.Scanner;

public class GestionBicicletas {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
            System.out.println("\n*************************");
            System.out.println("** GESTIÓN DE BICICLETAS **");
            System.out.println("*************************");
            System.out.println("1.- Añadir bicicleta …");
            System.out.println("2.- Vender bicicleta ...");
            System.out.println("3.- Consultar bicicleta …");
            System.out.println("4.- Mostrar stock");
            System.out.println("------------------------------------");
            System.out.println("0.- Salir.");
    }

    private static void anadirBicicleta() {
        System.out.print("Dime la referencia: ");
        String referencia = scanner.nextLine();

        System.out.print("Dime la marca: ");
        String marca = scanner.nextLine();
        System.out.print("Dime el modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Dime el peso en Kg: ");
        double peso = scanner.nextDouble();
        System.out.print("Dime el tamaño de las ruedas en pulgadas: ");
        double tamanyoRuedas = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Dime la fecha de fabricación (dd/mm/aaaa): ");
        String fechaFabricacion = scanner.nextLine();
        System.out.print("Dime el precio: ");
        double precio = scanner.nextDouble();
        System.out.print("Dime el número de existencias: ");
        int existencias = scanner.nextInt();

    }

    private static void venderBicicleta() {
        System.out.print("Introduce la referencia de la bicicleta a vender: ");
        String referencia = scanner.nextLine();

    }

    private static void consultarBicicleta() {
            System.out.println("\n***********************");
            System.out.println("** CONSULTA BICICLETA **");
            System.out.println("***********************");
            System.out.println("1.- Consultar por referencia …");
            System.out.println("2.- Consultar por marca …");
            System.out.println("3.- Consultar por modelo …");
            System.out.println("---------------------------------");
            System.out.println("0.- Volver al menú principal.");

    }

    private static void consultarPorReferencia() {
        System.out.print("Introduce la referencia: ");
        String referencia = scanner.nextLine();
    }

    private static void consultarPorMarca() {
        System.out.print("Introduce la marca: ");
        String marca = scanner.nextLine();
    }

    private static void consultarPorModelo() {
        System.out.print("Introduce el modelo: ");
        String modelo = scanner.nextLine();
    }

    private static void mostrarStock() {
        System.out.println("\n******** STOCK DE BICICLETAS ********");

    }
}
