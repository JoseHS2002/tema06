package com.josehs.tema06.Ejercicio6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Principal {
    /*
    public static void main(String[] args) throws ParseException {
        GestionBicicletas tienda = new GestionBicicletas();
        Scanner scanner = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        tienda.anyadirBicicleta(new Bicicleta("ABC123", "Trek", "Mountain", true, sdf.parse("10/01/2023"), 800, 5));
        tienda.anyadirBicicleta(new Bicicleta("XYZ456", "Giant", "Road", false, sdf.parse("12/03/2022"), 500, 3));
        tienda.anyadirBicicleta(new Bicicleta("DEF789", "Cannondale", "Hybrid", true, sdf.parse("01/07/2021"), 700, 2));
        tienda.anyadirBicicleta(new Bicicleta("ASD234", "Scott", "BMX", false, sdf.parse("05/02/2020"), 750, 4));

        int opcion = -1;
        while (opcion != 0) {
            System.out.println("*************************");
            System.out.println("** GESTIÓN DE BICICLETAS **");
            System.out.println("*************************");
            System.out.println("1.- Añadir bicicleta …");
            System.out.println("2.- Vender bicicleta …");
            System.out.println("3.- Consultar bicicleta …");
            System.out.println("4.- Mostrar stock");
            System.out.println("------------------------------------");
            System.out.println("0.- Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce la referencia: ");
                    String ref = scanner.nextLine();
                    Bicicleta bicicletaExistente = tienda.consultarReferencia(ref);
                    if (bicicletaExistente != null) {
                        tienda.anyadirBicicleta(bicicletaExistente);
                        System.out.println("Existencias de la bicicleta " + ref + " incrementadas.");
                    } else {
                        System.out.print("Dime la marca: ");
                        String marca = scanner.nextLine();
                        System.out.print("Dime el modelo: ");
                        String modelo = scanner.nextLine();
                        System.out.print("¿Tiene motor? (true/false): ");
                        boolean tieneMotor = scanner.nextBoolean();
                        System.out.print("Dime la fecha de fabricación (dd/MM/yyyy): ");
                        scanner.nextLine();  // Consumir el salto de línea
                        String fecha = scanner.nextLine();
                        Date fechaFabricacion = sdf.parse(fecha);
                        System.out.print("Dime el precio: ");
                        double precio = scanner.nextDouble();
                        System.out.print("Dime la cantidad: ");
                        int cantidad = scanner.nextInt();

                        Bicicleta nuevaBicicleta = new Bicicleta(ref, marca, modelo, tieneMotor, fechaFabricacion, precio, cantidad);
                        tienda.anyadirBicicleta(nuevaBicicleta);
                        System.out.println("Bicicleta " + ref + " añadida correctamente.");
                    }
                    break;

                case 2:
                    System.out.print("Dime la referencia de la bicicleta a vender: ");
                    String refVender = scanner.nextLine();
                    boolean ventaExitosa = tienda.venderBicicleta(refVender);
                    if (ventaExitosa) {
                        System.out.println("Bicicleta " + refVender + " vendida correctamente.");
                    } else {
                        System.out.println("No hay stock de la bicicleta " + refVender);
                    }
                    break;

                case 3:
                    int opcionConsulta = scanner.nextInt();
                    while (opcionConsulta != 0) {
                        System.out.println("***********************");
                        System.out.println("** CONSULTA BICICLETA **");
                        System.out.println("***********************");
                        System.out.println("1.- Consultar por referencia …");
                        System.out.println("2.- Consultar por marca …");
                        System.out.println("3.- Consultar por modelo …");
                        System.out.println("---------------------------------");
                        System.out.println("0.- Volver al menú principal");
                        System.out.print("Selecciona una opción: ");

                        scanner.nextLine();

                        switch (opcionConsulta) {
                            case 1:
                                System.out.print("Introduce la referencia: ");
                                String refConsulta = scanner.nextLine();
                                Bicicleta bicicletaReferencia = tienda.consultarReferencia(refConsulta);
                                if (bicicletaReferencia != null) {
                                    bicicletaReferencia.mostrarDatos();
                                } else {
                                    System.out.println("No se encontró la bicicleta con esa referencia.");
                                }
                                break;

                            case 2:
                                System.out.print("Introduce la marca: ");
                                String marcaConsulta = scanner.nextLine();
                                List<Bicicleta> bicicletasMarca = tienda.consultarMarca(marcaConsulta);
                                if (bicicletasMarca.isEmpty()) {
                                    System.out.println("No se encontraron bicicletas de esa marca.");
                                } else {
                                    for (Bicicleta bicicleta : bicicletasMarca) {
                                        bicicleta.mostrarDatos();
                                    }
                                }
                                break;

                            case 3:
                                System.out.print("Introduce el modelo: ");
                                String modeloConsulta = scanner.nextLine();
                                List<Bicicleta> bicicletasModelo = tienda.consultarModelo(modeloConsulta);
                                if (bicicletasModelo.isEmpty()) {
                                    System.out.println("No se encontraron bicicletas de ese modelo.");
                                } else {
                                    for (Bicicleta bicicleta : bicicletasModelo) {
                                        bicicleta.mostrarDatos();
                                    }
                                }
                                break;

                            case 0:
                                break;

                            default:
                                System.out.println("Opción no válida.");
                        }
                    }
                    break;

                case 4:

                    tienda.mostrarStock();
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
     */
}
