package com.josehs.tema06.Generics;

import java.util.ArrayList;
import java.util.List;

class Cola<T> {
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
