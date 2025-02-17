package com.josehs.tema06.Generics;

import java.util.Arrays;



public class DynamicArray<T> {
    private Object[] elementos;
    private int size;
    private int capacity;

    public DynamicArray() {
        this.capacity = 10;
        this.elementos = new Object[capacity];
        this.size = 0;
    }

    public void add(T elemento) {
        ensureCapacity();
        elementos[size++] = elemento;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Indice fuera de rango");
        }
        return (T) elementos[index];
    }

    public int size() {
        return size;
    }

    //Reduce la capacidad interna del array al tamaño actual
    public void trimToSize() {
        if (size < capacity) {
            elementos = Arrays.copyOf(elementos, size);
            capacity = size;
        }
    }

    //Inetercambia los elementos en las posiciones especificadas
    public boolean swap(int index1, int index2) {
        if (index1 < 0 || index1 >= size || index2 < 0 || index2 >= size) {
            return false;
        }
        T temp = (T) elementos[index1];
        elementos[index1] = elementos[index2];
        elementos[index2] = temp;
        return true;
    }

    //vaciar el array
    public void clear() {
        Arrays.fill(elementos, 0, size, null);
        size = 0;
    }

    //Crear una copia del array
    public DynamicArray<T> clone() {
        DynamicArray<T> copia = new DynamicArray<>();
        copia.elementos = Arrays.copyOf(this.elementos, this.capacity);
        copia.size = this.size;
        copia.capacity = this.capacity;
        return copia;
    }

    //Devuelve el indice de la primera ocurrencia del elemento
    public int indexOf(T elemento) {
        for (int i = 0; i < size; i++) {
            if (elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    private void ensureCapacity() {
        if (size >= capacity) {
            capacity = capacity * 2;
            elementos = Arrays.copyOf(elementos, capacity);
        }
    }
}

