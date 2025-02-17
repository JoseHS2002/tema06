package com.josehs.tema06.Generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Pila<T> {
    private List<T> elementos;

    public Pila() {
        this.elementos = new ArrayList<>();
    }

    public void push(T elemento) {
        elementos.add(elemento);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return elementos.remove(elementos.size() - 1);
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return elementos.get(elementos.size() - 1);
    }

    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    public void clear() {
        elementos.clear();
    }

    public Pila<T> clone() {
        Pila<T> copia = new Pila<>();
        copia.elementos = new ArrayList<>(this.elementos);
        return copia;
    }

    public List<T> peek(int n) {
        if (n < 1 || n > elementos.size()) {
            throw new IllegalArgumentException("Número de elementos a ver no válido");
        }
        return new ArrayList<>(elementos.subList(elementos.size() - n, elementos.size()));
    }

    public int search(T elemento) {
        int index = elementos.lastIndexOf(elemento);
        return index == -1 ? -1 : elementos.size() - index;
    }

    public void reverse() {
        Collections.reverse(elementos);
    }
}
