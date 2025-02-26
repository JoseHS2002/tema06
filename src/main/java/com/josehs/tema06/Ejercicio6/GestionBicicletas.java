package com.josehs.tema06.Ejercicio6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class GestionBicicletas {

    private ArrayList<Bicicleta> bicicletas = new ArrayList<>();

    public void mostrarMenuPrincipal() {
        System.out.println("*************************");
        System.out.println("** GESTIÓN DE BICICLETAS **");
        System.out.println("*************************");
        System.out.println("1.- Añadir bicicleta ...");
        System.out.println("2.- Vender bicicleta ...");
        System.out.println("3.- Consultar bicicleta ...");
        System.out.println("4.- Mostrar stock");
        System.out.println("------------------------------------");
        System.out.println("0.- Salir");
    }

    public void anyadirBicicleta(Scanner scanner) {
        System.out.println("Añadir bicicleta");
        System.out.print("Introduzca la referencia: ");
        String referencia = scanner.nextLine();

        Bicicleta bicicletaExistente = buscarBicicletaPorReferencia(referencia);
        if (bicicletaExistente != null) {
            System.out.println("La referencia ya existe. Incrementando el stock.");
            bicicletaExistente.incrementarStock();
        } else {
            System.out.print("Introduzca la marca: ");
            String marca = scanner.nextLine();
            System.out.print("Introduzca el modelo: ");
            String modelo = scanner.nextLine();
            System.out.print("Introduzca el peso (Kg): ");
            double peso = scanner.nextDouble();
            scanner.nextLine(); // Consumir el salto de línea
            System.out.print("Introduzca el tamaño de las ruedas (pulgadas): ");
            int tamañoRuedas = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
            System.out.print("¿Tiene motor? (S/N): ");
            boolean tieneMotor = scanner.nextLine().equalsIgnoreCase("S");
            System.out.print("Introduzca la fecha de fabricación (AAAA-MM-DD): ");
            LocalDate fechaFabricacion = LocalDate.parse(scanner.nextLine());
            System.out.print("Introduzca el precio: ");
            double precio = scanner.nextDouble();
            scanner.nextLine(); // Consumir el salto de línea
            System.out.print("Introduzca el número de existencias: ");
            int stock = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            Bicicleta nuevaBicicleta = new Bicicleta(referencia, marca, modelo, peso, tamañoRuedas, tieneMotor, fechaFabricacion, precio, stock);
            bicicletas.add(nuevaBicicleta);
            System.out.println("Bicicleta añadida correctamente.");
        }
    }

    public void anyadirBicicleta(String referencia, String marca, String modelo, double peso, int tamanyoRuedas, boolean tieneMotor, String fechaFabricacion, double precio, int stock) {
        LocalDate fecha = LocalDate.parse(fechaFabricacion);
        Bicicleta nuevaBicicleta = new Bicicleta(referencia, marca, modelo, peso, tamanyoRuedas, tieneMotor, fecha, precio, stock);
        bicicletas.add(nuevaBicicleta);
    }

    public void venderBicicleta(Scanner scanner) {
        System.out.println("Vender bicicleta");
        System.out.print("Introduzca la referencia de la bicicleta: ");
        String referencia = scanner.nextLine();

        Bicicleta bicicletaAVender = buscarBicicletaPorReferencia(referencia);
        if (bicicletaAVender != null) {
            if (bicicletaAVender.getStock() > 0) {
                bicicletaAVender.disminuirStock();
                System.out.println("Bicicleta " + referencia + " vendida correctamente.");
            } else {
                System.out.println("No hay stock de la bicicleta " + referencia + ".");
            }
        } else {
            System.out.println("No se encontró la bicicleta con la referencia " + referencia + ".");
        }
    }

    public void consultarBicicleta(Scanner scanner) {
        System.out.println("***********************");
        System.out.println("** CONSULTA BICICLETA **");
        System.out.println("***********************");
        System.out.println("1.- Consultar por referencia ...");
        System.out.println("2.- Consultar por marca ...");
        System.out.println("3.- Consultar por modelo ...");
        System.out.println("---------------------------------");
        System.out.println("0.- Volver al menú principal");

        int opcionConsulta;
        do {
            opcionConsulta = scanner.nextInt();
            scanner.nextLine();

            switch (opcionConsulta) {
                case 1:
                    consultarPorReferencia(scanner);
                    break;
                case 2:
                    consultarPorMarca(scanner);
                    break;
                case 3:
                    consultarPorModelo(scanner);
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal.");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcionConsulta != 0);
    }

    public void consultarPorReferencia(Scanner scanner) {
        System.out.print("Introduzca la referencia: ");
        String referencia = scanner.nextLine();

        Bicicleta bicicletaEncontrada = buscarBicicletaPorReferencia(referencia);
        if (bicicletaEncontrada != null) {
            System.out.println(bicicletaEncontrada);
        } else {
            System.out.println("No se encontró ninguna bicicleta con esa referencia.");
        }
    }

    public void consultarPorMarca(Scanner scanner) {
        System.out.print("Introduzca la marca: ");
        String marca = scanner.nextLine();

        ArrayList<Bicicleta> bicicletasEncontradas = buscarBicicletasPorMarca(marca);
        if (bicicletasEncontradas.size() > 0) {
            System.out.println("Bicicletas de la marca " + marca + ":");
            for (Bicicleta bicicleta : bicicletasEncontradas) {
                System.out.println(bicicleta);
            }
        } else {
            System.out.println("No se encontraron bicicletas de la marca " + marca + ".");
        }
    }

    public void consultarPorModelo(Scanner scanner) {
        System.out.print("Introduzca el modelo: ");
        String modelo = scanner.nextLine();

        ArrayList<Bicicleta> bicicletasEncontradas = buscarBicicletasPorModelo(modelo);
        if (bicicletasEncontradas.size() > 0) {
            System.out.println("Bicicletas del modelo " + modelo + ":");
            for (Bicicleta bicicleta : bicicletasEncontradas) {
                System.out.println(bicicleta);
            }
        } else {
            System.out.println("No se encontraron bicicletas del modelo " + modelo + ".");
        }
    }

    public void mostrarStock() {
        System.out.println("Stock de bicicletas:");
        if (bicicletas.isEmpty()) {
            System.out.println("No hay bicicletas en el stock.");
        } else {
            for (Bicicleta bicicleta : bicicletas) {
                System.out.println(bicicleta.getReferencia() + ": " + bicicleta.getStock() + " unidades");
            }
        }
    }

    private Bicicleta buscarBicicletaPorReferencia(String referencia) {
        for (Bicicleta bicicleta : bicicletas) {
            if (bicicleta.getReferencia().equals(referencia)) {
                return bicicleta;
            }
        }
        return null;
    }

    private ArrayList<Bicicleta> buscarBicicletasPorMarca(String marca) {
        ArrayList<Bicicleta> bicicletasEncontradas = new ArrayList<>();
        for (Bicicleta bicicleta : bicicletas) {
            if (bicicleta.getMarca().equals(marca)) {
                bicicletasEncontradas.add(bicicleta);
            }
        }
        return bicicletasEncontradas;
    }

    private ArrayList<Bicicleta> buscarBicicletasPorModelo(String modelo) {
        ArrayList<Bicicleta> bicicletasEncontradas = new ArrayList<>();
        for (Bicicleta bicicleta : bicicletas) {
            if (bicicleta.getModelo().equals(modelo)) {
                bicicletasEncontradas.add(bicicleta);
            }
        }
        return bicicletasEncontradas;
    }
}