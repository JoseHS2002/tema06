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

    //Devuelve el último elemento de la cola sin eliminarlo.
    public T peekLast() {
        if (isEmpty()) {
            return null;
        }
        return elementos.get(elementos.size() - 1);
    }

    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    //Vacía la cola
    public void clear() {
        elementos.clear();
    }

    //Crea una copia de la cola
    public Cola<T> clone() {
        Cola<T> copia = new Cola<>();
        copia.elementos = new LinkedList<>(this.elementos);
        return copia;
    }

    //Devuelve la distancia desde el inicio de la cola a la primera ocurrencia del elemento
    public int search(T elemento) {
        int index = elementos.indexOf(elemento);
        return index == -1 ? -1 : index + 1;
    }

    //Invierte el orden de los elemetos de la cola
    public void reverse() {
        List<T> reversed = new LinkedList<>();
        for (int i = elementos.size() - 1; i >= 0; i--) {
            reversed.add(elementos.get(i));
        }
        elementos = reversed;
    }

    @Override
    public String toString() {
        return "Cola{" +
                "elementos=" + elementos +
                '}';
    }

}

