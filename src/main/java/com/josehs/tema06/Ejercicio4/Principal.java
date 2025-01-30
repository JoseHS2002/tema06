package com.josehs.tema06.Ejercicio4;

import java.util.Scanner;

public class Principal {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Dime el primer valor de x: ");
        double x1 = scanner.nextFloat();
        System.out.println("Dime el primer valor de y: ");
        double y1 = scanner.nextFloat();
        System.out.println("Dime el segundo valor de x: ");
        double x2 = scanner.nextFloat();
        System.out.println("Dime el segundo valor de y: ");
        double y2 = scanner.nextFloat();

        Punto punto1 = new Punto(x1, y1);
        Punto punto2 = new Punto(x2, y2);
        Punto punto3 = new Punto();

        System.out.println("Coordenadas de los puntos:");
        System.out.println("Punto 1: " + punto1);
        System.out.println("Punto 2: " + punto2);
        System.out.println("Punto 3: " + punto3);
        
        double distancia = punto1.distancia(punto2);
        System.out.println("La distancia entre " + punto1 + " y " + punto2 + " es: " + distancia);
    }
}
