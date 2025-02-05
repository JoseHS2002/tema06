package com.josehs.tema06.pilascolas;

import com.josehs.tema06.pilascolas.Pila;

public class Ejercicio3 {
    public static void main(String[] args) {
    
        String codigo = "public class texto{public class void main(String[ args){}}";

        if (esValido(codigo)) {
            System.out.println("El código fuente es válido.");
            System.out.println(codigo);
        } else {
            System.out.println("El código fuente es inválido.");
            System.out.println(codigo);
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
                    if (pila.pop() != '(') {
                        return false;
                    }
                    break;
                case '}':
                    if (pila.pop() != '{') {
                        return false;
                    }
                    break;
                case ']':
                    if (pila.pop() != '[') {
                        return false;
                    }
                    break;
            }
        }

        return pila.isEmpty();
    }

}
