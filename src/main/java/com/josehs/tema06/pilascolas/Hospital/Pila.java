package com.josehs.tema06.pilascolas.Hospital;

public class Pila<T> {
/*
    private static final int INITIAL_SIZE = 10;
    private static final float GROW_FACTOR = 2f;
    private static final T ERROR = null;
    private T[] data;
    private int size;

    public static void main(String[] args) {
        Pila<Integer> pila = new Pila<>(5);
        System.out.println("Pila: ");
        pila.push(1);
        System.out.println(pila.toString());
        pila.push(2);
        System.out.println(pila.toString());
        pila.push(3);
        System.out.println(pila.toString());
        pila.push(4);
        System.out.println(pila.toString());
        pila.push(5);
        System.out.println(pila.toString());
        pila.pop();
        System.out.println(pila.toString());
        pila.pop();
        System.out.println(pila.toString());
        pila.pop();
        System.out.println(pila.toString());
        pila.pop();
        System.out.println(pila.toString());
        pila.pop();
    }

    @SuppressWarnings("unchecked")
    public Pila() {
        this(INITIAL_SIZE);
    }

    @SuppressWarnings("unchecked")
    public Pila(int size) {
        data = (T[]) new Object[size];
        this.size = 0;
    }

    public void push(T e) {
        if (isFull()) {
            expand();
        }
        data[size] = e;
        size++;
    }

    @SuppressWarnings("unchecked")
    private void expand() {
        T[] aux = (T[]) new Object[Math.round(data.length * GROW_FACTOR)];
        for (int i = 0; i < data.length; i++) {
            aux[i] = data[i];
        }
        data = aux;
    }

    public T pop() {
        T e = ERROR;
        if (!isEmpty()) {
            e = data[size - 1];
            size--;
        }
        return e;
    }

    public T top() {
        T e = ERROR;
        if (!isEmpty()) {
            e = data[size - 1];
        }
        return e;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]).append(" ");
        }
        sb.append("]");
        return sb.toString();
    }

 */
}
