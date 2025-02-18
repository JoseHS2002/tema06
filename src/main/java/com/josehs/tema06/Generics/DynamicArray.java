package com.josehs.tema06.Generics;

import java.util.Arrays;

public class DynamicArray<T> {
    private Object[] elementos;
    private int size;
    private int capacidad;

    public DynamicArray() {
        capacidad = 10;
        elementos = new Object[capacidad];
        size = 0;
    }

    public void add(T elemento) {
        if (size == capacidad) {
            capacidad *= 2;
            elementos = Arrays.copyOf(elementos, capacidad);
        }
        elementos[size++] = elemento;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return (T) elementos[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        System.arraycopy(elementos, index + 1, elementos, index, size - index - 1);
        size--;
    }

    public int size() {
        return size;
    }

    //Vacia el array
    public void clear() {
        elementos = new Object[capacidad];
        size = 0;
    }

    //Crea una copia del array
    public DynamicArray<T> clone() {
        DynamicArray<T> copia = new DynamicArray<>();
        copia.elementos = Arrays.copyOf(this.elementos, this.capacidad);
        copia.size = this.size;
        return copia;
    }

    //devuelve el indice de la primera ocurrencia del elemento
    public int indexOf(T elemento) {
        for (int i = 0; i < size; i++) {
            if (elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    //Reduce la capacidad interna al tamanyo original
    public void trimToSize() {
        if (size < capacidad) {
            elementos = Arrays.copyOf(elementos, size);
            capacidad = size;
        }
    }

    //Intercambia los elementos en las posiciones especificadas
    public boolean swap(int index1, int index2) {
        if (index1 < 0 || index1 >= size || index2 < 0 || index2 >= size) {
            return false;
        }
        Object temp = elementos[index1];
        elementos[index1] = elementos[index2];
        elementos[index2] = temp;
        return true;
    }

    @Override
    public String toString() {
        return "DynamicArray{" +
                "elementos=" + Arrays.toString(elementos) +
                ", tamaño=" + size +
                ", capacidad=" + capacidad +
                '}';
    }

}

