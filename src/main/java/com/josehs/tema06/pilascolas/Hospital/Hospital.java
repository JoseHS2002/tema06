package com.josehs.tema06.pilascolas.Hospital;

import com.josehs.tema06.pilascolas.Hospital.Cola;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Hospital<T> {
    public Scanner scanner = new Scanner(System.in);
    public Random random = new Random();
    List<ColaConsulta<T>> consultas;

    public Hospital() {
        consultas = new ArrayList<>();
    }

    public void mostrarEstadoColas() {
        for (int i = 0; i < consultas.size(); i++) {
            System.out.println("Consulta " + (i + 1) + ": " + consultas.get(i));
        }
    }
}

