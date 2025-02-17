package com.josehs.tema06.Generics;

public class Main {
    public static void main(String[] args) {
        //Implementacion de la pila
        Pila<String> pila = new Pila<>();
        pila.push("1");
        pila.push("2");
        pila.push("3");

        System.out.println("Pila original:");
        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }

        pila.push("A");
        pila.push("B");
        pila.push("C");

        System.out.println("\nPila después de agregar elementos:");
        System.out.println("Elemento superior: " + pila.peek());
        System.out.println("Buscar 'Elemento B': " + pila.search("B"));
        System.out.println("Ver los 2 elementos superiores: " + pila.peek(2));

        Pila<String> pilaClonada = pila.clone();
        System.out.println("\nPila clonada:");
        while (!pilaClonada.isEmpty()) {
            System.out.println(pilaClonada.pop());
        }

        pila.reverse();
        System.out.println("\nPila invertida:");
        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }
        //Implementación de la cola
        Cola<Integer> cola = new Cola<>();
        cola.ponerElemento(10);
        cola.ponerElemento(20);
        cola.ponerElemento(30);

        System.out.println("\nCola original:");
        while (!cola.isEmpty()) {
            System.out.println(cola.quitarElemento());
        }

        cola.ponerElemento(100);
        cola.ponerElemento(200);
        cola.ponerElemento(300);

        System.out.println("\nCola despues de agregar elementos:");
        System.out.println("Primero: " + cola.peek());
        System.out.println("Ultimo: " + cola.peekLast());
        System.out.println("Buscar 200: " + cola.search(200));

        Cola<Integer> colaClonada = cola.clone();
        System.out.println("\nCola clonada:");
        while (!colaClonada.isEmpty()) {
            System.out.println(colaClonada.quitarElemento());
        }

        cola.reverse();
        System.out.println("\nCola invertida:");
        while (!cola.isEmpty()) {
            System.out.println(cola.quitarElemento());
        }
        //Implementación de array Dinamico
        DynamicArray<Double> dynamicArray = new DynamicArray<>();
        dynamicArray.add(1.1);
        dynamicArray.add(2.2);
        dynamicArray.add(3.3);

        System.out.println("\nDynamicArray original:");
        for (int i = 0; i < dynamicArray.size(); i++) {
            System.out.println(dynamicArray.get(i));
        }

        dynamicArray.add(4.4);
        dynamicArray.add(5.5);

        System.out.println("\nDynamicArray despues de agregar elementos:");
        System.out.println("Indice de 4.4: " + dynamicArray.indexOf(4.4));
        dynamicArray.trimToSize();
        System.out.println("Tamano despues de trimToSize: " + dynamicArray.size());

        dynamicArray.swap(1, 3);
        System.out.println("\nDynamicArray despues de swap:");
        for (int i = 0; i < dynamicArray.size(); i++) {
            System.out.println(dynamicArray.get(i));
        }

        dynamicArray.clear();
        System.out.println("\nDynamicArray despues de clear:");
        System.out.println("Tamano: " + dynamicArray.size());
    }
}
