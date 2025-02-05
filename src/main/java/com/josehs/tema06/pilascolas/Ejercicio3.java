package com.josehs.tema06.pilascolas;

import java.util.Scanner;
import com.josehs.tema06.pilascolas.Pila;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el código fuente:");
        String codigo = scanner.nextLine();

        if (esValido(codigo)) {
            System.out.println("El código fuente es válido.");
        } else {
            System.out.println("El código fuente es inválido.");
        }
    }

    public static boolean esValido(String codigo) {
        Pila pila = new Pila(5);

        for (char caracter : codigo.toCharArray()) {
            switch (caracter) {
                case '(':
                case '{':
                case '[':
                    pila.push(caracter);
                    break;
                case ')':
                    if (pila.isEmpty() || pila.pop() != '(') {
                        return false;
                    }
                    break;
                case '}':
                    if (pila.isEmpty() || pila.pop() != '{') {
                        return false;
                    }
                    break;
                case ']':
                    if (pila.isEmpty() || pila.pop() != '[') {
                        return false;
                    }
                    break;
            }
        }

        return pila.isEmpty();
    }

}
