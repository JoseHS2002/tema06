package com.josehs.tema06.pilascolas.Hospital;

import java.util.ArrayList;
import java.util.List;

class Hospital<T> {
    List<ColaConsulta<T>> consultas;

    public Hospital() {
        consultas = new ArrayList<>();
    }

    public void agregarConsulta(ColaConsulta<T> colaConsulta) {
        consultas.add(colaConsulta);
    }

    public void mostrarEstadoColas() {
        for (int i = 0; i < consultas.size(); i++) {
            System.out.println("Consulta " + (i + 1) + ": " + consultas.get(i));
        }
    }
}

