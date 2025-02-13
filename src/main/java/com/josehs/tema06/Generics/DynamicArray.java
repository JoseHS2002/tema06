package com.josehs.tema06.Generics;

import java.util.Arrays;
import java.util.Random;

public class DynamicArray<T> {

    private static final double ERROR = Double.NEGATIVE_INFINITY;
    private final static int DEFAULT_CAPACITY = 10;
    private final static float GROW_FACTOR = 2f;
    private T[] data;
    private int size;

    public static void main(String[] args) {
        Random random = new Random();
        DynamicArray<Double> dynamicArray = new DynamicArray<>(10);
        for (int i = 0; i < 10; i++) {
            dynamicArray.add(random.nextDouble());
        }
        System.out.println(dynamicArray.toString());
        dynamicArray.add(1.0);
        System.out.println(dynamicArray.toString());
        dynamicArray.remove(1.0);
        System.out.println(dynamicArray.toString());

        System.out.println(dynamicArray.get(3));
        dynamicArray.add(3, 10.0);
        System.out.println(dynamicArray.get(3));
        System.out.println(dynamicArray.size);
    }

    public DynamicArray() {
        this(DEFAULT_CAPACITY);
    }

    public DynamicArray(int capacity) {
        data = (T[]) new Object[capacity];
        size = 0;
    }

    public T get(int index) {
        if (index >= size || index < 0)
            return null;
        return data[index];
    }

    public boolean add(T value) {
        if (isFull())
            expand();
        data[size] = value;
        size++;
        return true;
    }

    public boolean remove(T value) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(value)) {
                for (int j = i; j < size - 1; j++) {
                    data[j] = data[j + 1];
                }
                data[size - 1] = null;
                size--;
                return true;
            }
        }
        return false;
    }

    private void moveToRight(int index) {
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        size++;
    }

    public boolean add(int index, T value) {
        if (index >= size || index < 0)
            return false;
        if (isFull())
            expand();
        moveToRight(index);
        data[index] = value;
        return true;
    }

    private void expand() {
        T[] copy = (T[]) new Object[Math.round(data.length * GROW_FACTOR)];
        for (int i = 0; i < size; i++) {
            copy[i] = data[i];
        }
        data = copy;
    }

    public int size() {
        return size;
    }

    private boolean isFull() {
        return size == data.length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DynamicArray<?> that = (DynamicArray<?>) o;

        if (size != that.size) return false;

        // Comparamos elemento por elemento
        for (int i = 0; i < size; i++) {
            if (!data[i].equals(that.data[i]))
                return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(data);
        result = 31 * result + size;
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (int i = 0; i < size; i++)
            sb.append(data[i]).append(" ");
        sb.append("]");
        return sb.toString();
    }
}
