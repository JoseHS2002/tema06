package com.josehs.tema06.Ejercicio6;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestionBicicletas gestion = new GestionBicicletas();

        gestion.anyadirBicicleta("B123", "Trek", "Emonda SL", 7.5, 28, false, "2022-10-15", 1500, 5);
        gestion.anyadirBicicleta("B456", "Specialized", "Tarmac SL7", 7.2, 28, false, "2023-01-20", 2000, 3);
        gestion.anyadirBicicleta("B789", "Giant", "Defy Advanced", 8.1, 28, false, "2022-08-05", 1200, 8);

        int opcion;
        do {
            gestion.mostrarMenuPrincipal();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    gestion.anyadirBicicleta(scanner);
                    break;
                case 2:
                    gestion.venderBicicleta(scanner);
                    break;
                case 3:
                    gestion.consultarBicicleta(scanner);
                    break;
                case 4:
                    gestion.mostrarStock();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}
