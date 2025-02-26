package com.josehs.tema06.Ejercicio6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class GestionBicicletas {

    private ArrayList<Bicicleta> bicicletas = new ArrayList<>();

    public void anyadirBicicleta(Scanner scanner) {
        System.out.println("Añadir bicicleta");
        System.out.print("Dime la referencia: ");
        String referencia = scanner.nextLine();

        Bicicleta bicicletaExistente = buscarReferenciaBicicleta(referencia);
        if (bicicletaExistente != null) {
            System.out.println("La referencia ya existe. Incrementando el stock.");
            bicicletaExistente.incrementarStock();
        } else {
            System.out.print("Dime la marca: ");
            String marca = scanner.nextLine();
            System.out.print("Dime el modelo: ");
            String modelo = scanner.nextLine();
            System.out.print("Dime el peso (Kg): ");
            double peso = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Dime el tamaño de las ruedas (pulgadas): ");
            int tamanyoRuedas = scanner.nextInt();
            scanner.nextLine();
            System.out.print("¿Tiene motor? (S/N): ");
            boolean tieneMotor = scanner.nextLine().equalsIgnoreCase("S");
            System.out.print("Dime la fecha de fabricación (AAAA-MM-DD): ");
            LocalDate fechaFabricacion = LocalDate.parse(scanner.nextLine());
            System.out.print("Dime el precio: ");
            double precio = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Dime el número de existencias: ");
            int stock = scanner.nextInt();
            scanner.nextLine();

            Bicicleta nuevaBicicleta = new Bicicleta(referencia, marca, modelo, peso, tamanyoRuedas, tieneMotor, fechaFabricacion, precio, stock);
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
        System.out.print("Dime la referencia de la bicicleta: ");
        String referencia = scanner.nextLine();

        Bicicleta venderBicicleta = buscarReferenciaBicicleta(referencia);
        if (venderBicicleta != null) {
            if (venderBicicleta.getStock() > 0) {
                venderBicicleta.reducirStock();
                System.out.println("Bicicleta " + referencia + " vendida correctamente.");
            } else {
                System.out.println("No hay stock de la bicicleta " + referencia + ".");
            }
        } else {
            System.out.println("No se encontró la bicicleta con la referencia " + referencia + ".");
        }
    }

    public void consultarReferencia(Scanner scanner) {
        System.out.print("Dime la referencia: ");
        String referencia = scanner.nextLine();

        Bicicleta bicicletaEncontrada = buscarReferenciaBicicleta(referencia);
        if (bicicletaEncontrada != null) {
            System.out.println(bicicletaEncontrada);
        } else {
            System.out.println("No se encontró ninguna bicicleta con esa referencia.");
        }
    }

    public void consultarMarca(Scanner scanner) {
        System.out.print("Introduzca la marca: ");
        String marca = scanner.nextLine();

        ArrayList<Bicicleta> bicicletasEncontradas = buscarMarcaBicicleta(marca);
        if (!bicicletasEncontradas.isEmpty()) {
            System.out.println("Bicicletas de la marca " + marca + ":");
            for (Bicicleta bicicleta : bicicletasEncontradas) {
                System.out.println(bicicleta);
            }
        } else {
            System.out.println("No se encontraron bicicletas de la marca " + marca + ".");
        }
    }

    public void consultarPorModelo(Scanner scanner) {
        System.out.print("Dime el modelo: ");
        String modelo = scanner.nextLine();

        ArrayList<Bicicleta> bicicletasEncontradas = buscarModeloBicicleta(modelo);
        if (!bicicletasEncontradas.isEmpty()) {
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

    private Bicicleta buscarReferenciaBicicleta(String referencia) {
        for (Bicicleta bicicleta : bicicletas) {
            if (bicicleta.getReferencia().equals(referencia)) {
                return bicicleta;
            }
        }
        return null;
    }

    private ArrayList<Bicicleta> buscarMarcaBicicleta(String marca) {
        ArrayList<Bicicleta> bicicletasEncontradas = new ArrayList<>();
        for (Bicicleta bicicleta : bicicletas) {
            if (bicicleta.getMarca().equals(marca)) {
                bicicletasEncontradas.add(bicicleta);
            }
        }
        return bicicletasEncontradas;
    }

    private ArrayList<Bicicleta> buscarModeloBicicleta(String modelo) {
        ArrayList<Bicicleta> bicicletasEncontradas = new ArrayList<>();
        for (Bicicleta bicicleta : bicicletas) {
            if (bicicleta.getModelo().equals(modelo)) {
                bicicletasEncontradas.add(bicicleta);
            }
        }
        return bicicletasEncontradas;
    }
}