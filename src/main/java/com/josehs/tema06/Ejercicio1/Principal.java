package com.josehs.tema06.Ejercicio1;

public class Principal {
    int contador = 0;
    int numeroI;
    int numeroF = 9998;
        for (numeroI = 0001; numeroI >= numeroF; numeroI++) {
        for (char letra1 = 'A'; letra1 <= 'Z'; letra1++) {
            for (char letra2 = 'A'; letra2 <= 'Z'; letra2++) {
                for (char letra3 = 'A'; letra3 <= 'Z'; letra3++) {
                    String matricula = String.format("%04d", numeroI) + letra1 + letra2 + letra3;
                    Coche coche = new Coche("Modelo " + (contador + 1), "Color " + (contador + 1), true, matricula, Coche.TipoCoche.FAMILIAR, 2022, Coche.ModalidadSeguro.A_TODO_RIESGO);
                    System.out.println("Coche " + (contador + 1) + ": " + coche);
                    contador++;
                }
            }
        }
    }
}
