package com.josehs.tema06.Generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Pila<Object> {
    private List<Object> elementos;

    public Pila() {
        this.elementos = new ArrayList<>();
    }

    public void push(Object elemento) {
        elementos.add(elemento);
    }

    public Object pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return elementos.remove(elementos.size() - 1);
    }

    public Object peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return elementos.get(elementos.size() - 1);
    }

    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    //Vacia la pila
    public void clear() {
        elementos.clear();
    }

    //Crea una copia de la pila
    public Pila<Object> clone() {
        Pila<Object> copia = new Pila<>();
        copia.elementos = new ArrayList<>(this.elementos);
        return copia;
    }

    //Mira los elementos superiores sin extraerlos
    public List<Object> peek(int n) {
        if (n < 1 || n > elementos.size()) {
            throw new IllegalArgumentException("Número de elementos no válido");
        }
        return new ArrayList<>(elementos.subList(elementos.size() - n, elementos.size()));
    }

    //Devuelve la distancia desde la cima hasta la primera ocurrencia de este elemento
    public int search(Object elemento) {
        int index = elementos.lastIndexOf(elemento);
        return index == -1 ? -1 : elementos.size() - index;
    }

    //Invierte el orden de todos los elementos de la pila
    public void reverse() {
        List<Object> reversed = new LinkedList<>();
        for (int i = elementos.size() - 1; i >= 0; i--) {
            reversed.add(elementos.get(i));
        }
        elementos = reversed;
    }

    @Override
    public String toString() {
        return "Pila{" +
                "elementos=" + elementos +
                '}';
    }
    /*
    @Override
    public int hashCode() {
    int result = 1;
        for (int i = 0; i < size; i++) {

        }
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
    }

*/

}
