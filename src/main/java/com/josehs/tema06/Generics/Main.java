package com.josehs.tema06.Generics;

public class Main {
    public static void main(String[] args) {
        //Implementacion de la pila
        Pila<String> pila = new Pila<>();
        pila.push("A");
        pila.push("B");
        pila.push("C");

        System.out.println("Pila original:");
        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }

        pila.push("A");
        pila.push("B");
        pila.push("C");

        System.out.println("\nPila despues de agregar elementos:");
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

        System.out.println("Vaciar la pila");
        pila.clear();
        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }
        System.out.println("La pila esta vacia");

        //Implementación de la cola
        Cola<Integer> cola = new Cola<>();
        cola.ponerElemento(10);
        cola.ponerElemento(20);
        cola.ponerElemento(30);

        System.out.println("\nCola original:");
        while (!cola.isEmpty()) {
            System.out.println(cola.quitarElemento());
        }

        cola.ponerElemento(10);
        cola.ponerElemento(20);
        cola.ponerElemento(30);

        System.out.println("\nCola despues de agregar elementos:");
        System.out.println("Primero: " + cola.peek());
        System.out.println("Ultimo: " + cola.peekLast());
        System.out.println("Buscar 200: " + cola.search(20));

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

        System.out.println("Vaciar la cola");
        cola.clear();
        while (!cola.isEmpty()) {
            System.out.println(cola.quitarElemento());
        }
        System.out.println("La cola esta vacia");

        //Implementación de array dinamico

        DynamicArray<Double> dynamicArray = new DynamicArray<>();
        dynamicArray.add(1.1);
        dynamicArray.add(2.2);
        dynamicArray.add(3.3);
        System.out.println("DynamicArray tamanyo: ");
        System.out.println(dynamicArray.size());
        dynamicArray.add(4.4);
        dynamicArray.add(5.5);
        System.out.println("Devolver la primera ocurrencia de (4.4)");
        System.out.println(dynamicArray.indexOf(4.4));
        dynamicArray.trimToSize();
        System.out.println("Tamano despues de trimToSize: " + dynamicArray.size());
        dynamicArray.swap(0, 2);
        System.out.println("DynamicArray después de swap: " + dynamicArray.get(0) + ", " + dynamicArray.get(2));
        dynamicArray.clone();
        System.out.println("Clonar el array");
        System.out.println(dynamicArray.size());
        System.out.println("Array clonado");
        dynamicArray.clear();
        System.out.println("Vaciar el array");
        System.out.println(dynamicArray.size());
        System.out.println("El array está vacío");

    }
}
