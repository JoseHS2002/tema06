package com.josehs.tema06.pilascolas;

import java.util.Random;

public class Ejercicio1 {
    public Ejercicio1() {
        Random random = new Random();
        DynamicArray dynamicArray = new DynamicArray(10);
        for (int i = 0; i < 10; i++) {
            dynamicArray.add(random.nextDouble());
        }
    }


}
