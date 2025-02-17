package com.josehs.tema06.Generics;

import java.util.List;
import java.util.LinkedList;


public class Cola<T> {
    private List<T> elementos;

    public Cola() {
        this.elementos = new LinkedList<>();
    }

    public void ponerElemento(T elemento) {
        elementos.add(elemento);
    }

    public T quitarElemento() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return elementos.remove(0);
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return elementos.get(0);
    }

    public T peekLast() {
        if (isEmpty()) {
            return null;
        }
        return elementos.get(elementos.size() - 1);
    }

    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    public void clear() {
        elementos.clear();
    }

    public Cola<T> clone() {
        Cola<T> copia = new Cola<>();
        copia.elementos = new LinkedList<>(this.elementos);
        return copia;
    }

    public int search(T elemento) {
        int index = elementos.indexOf(elemento);
        return index == -1 ? -1 : index + 1;
    }

    public void reverse() {
        List<T> reversed = new LinkedList<>();
        for (int i = elementos.size() - 1; i >= 0; i--) {
            reversed.add(elementos.get(i));
        }
        elementos = reversed;
    }
}


/*
public class Cola<T> {
    private List<T> elementos;

    public Cola() {
        elementos = new ArrayList<>();
    }

    public void ponerElementos(T elemento) {
        elementos.add(elemento);
    }

    public T quitarElementos() {
        if (elementos.isEmpty()) {
            return null;
        }
        return elementos.remove(0);
    }

    public boolean estaVacio() {
        return elementos.isEmpty();
    }

    @Override
    public String toString() {
        return "Cola{" +
                "elementos=" + elementos +
                '}';
    }
}
 */
