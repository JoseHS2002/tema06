package com.josehs.tema06.Ejercicio5;

import java.util.Scanner;
import com.josehs.tema06.Ejercicio4.Punto;

public class Principal {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Dime el primer valor de x: ");
        double px1 = scanner.nextFloat();
        System.out.println("Dime el primer valor de y: ");
        double py1 = scanner.nextFloat();
        System.out.println("Dime el primer valor del radio: ");
        double r1 = scanner.nextFloat();
        System.out.println("Dime el segundo valor de x: ");
        double px2 = scanner.nextFloat();
        System.out.println("Dime el segundo valor de y: ");
        double py2 = scanner.nextFloat();
        System.out.println("Dime el segundo valor del radio: ");
        double r2 = scanner.nextFloat();

        System.out.println();

        Circunferencia c1 = new Circunferencia(new Punto(px1, py1), r1);
        Circunferencia c2 = new Circunferencia(0, 0, 3.2);
        Circunferencia c3 = new Circunferencia(px2, py2, r2);

        System.out.println(c1);
        System.out.println("Perímetro: " + c1.perimetro() + " cm");
        System.out.println("Área: " + c1.area() + " cm²");
        System.out.println();

        System.out.println(c2);
        System.out.println("Perímetro: " + c2.perimetro() + " cm");
        System.out.println("Área: " + c2.area() + " cm²");
        System.out.println();

        System.out.println(c3);
        System.out.println("Perímetro: " + c3.perimetro() + " cm");
        System.out.println("Área: " + c3.area() + " cm²");
        System.out.println();

        double distancia = c1.distancia(c2.getCentro());
        System.out.println("Distancia entre el centro de c1 y c2: " + distancia + " cm");
    }
}
