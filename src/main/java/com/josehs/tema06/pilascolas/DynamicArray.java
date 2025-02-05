package com.josehs.tema06.pilascolas;

import java.util.Arrays;
import java.util.Random;

public class DynamicArray {

    private static final double ERROR = Double.NEGATIVE_INFINITY;

    private final static int DEFAULT_CAPACITY = 10;

    private final static float GROW_FACTOR = 2f;

    private double[] data;

    private int size;

    public static void main(String[] args) {
        Random random = new Random();
        DynamicArray dynamicArray = new DynamicArray(10);
        for (int i = 0; i < 10; i++) {
            dynamicArray.add(random.nextDouble());
        }
        System.out.println(dynamicArray.toString());
        dynamicArray.add(1);
        System.out.println(dynamicArray.toString());
        dynamicArray.remove(1);
        System.out.println(dynamicArray.toString());

        System.out.println(dynamicArray.get(3));
        dynamicArray.add(3, 10);
        System.out.println(dynamicArray.get(3));
        System.out.println(dynamicArray.size);
    }

    public DynamicArray() {
        this(DEFAULT_CAPACITY);
    }

    public DynamicArray(int capacity) {
        data = new double[capacity];
        size = 0;
    }

    public double get(int index) {
        if (index >= size || index < 0 )
            return ERROR;
        return data[index];
    }

    public boolean add(double value) {
        if (isFull())
            expand();
        data[size] = value;
        size++;
        return true;
    }

    public boolean remove(double value) {
        if (isFull())
            expand();
        data[size] = value;
        size--;
        return true;
    }

    private void moveToRight(int index) {
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        size++;
    }

    public boolean add(int index, double value) {
        if (index >= size || index < 0)
            return false;
        if (isFull())
            expand();
        moveToRight(index);
        data[index] = value;
        return true;
    }

    private void expand() {
        double[] copy = new double[Math.round(data.length * GROW_FACTOR)];
        for (int i = 0; i < size; i++) {
            copy[i] = data[i];
        }
        data = copy;
    }

    public int size() {return size;}

    private boolean isFull() {
        return size == data.length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DynamicArray that = (DynamicArray) o;

        if (size != that.size) return false;

        // Sólo tenemos en cuenta los elementos del array que están en posiciones válidas
        for (int i = 0; i < size; i++) {
            if (data[i] != that.data[i])
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
