package com.josehs.tema06.pilascolas.Hospital;

import com.josehs.tema06.pilascolas.Cola;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Hospital {
        List<Cola> consultas;

        public Hospital() {
            consultas = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                Medico medico = new Medico("Dr. " + generarNombreAleatorio(), generarNumeroColegiado());
                Cola consulta = new Cola();
                for (int j = 0; j < 5; j++) {
                    //generar pacientes
                }
                consultas.add(consulta);
            }
        }

        public void mostrarEstadoColas() {
            for (int i = 0; i < consultas.size(); i++) {
                System.out.println("Consulta " + (i + 1) + ": " + consultas.get(i));
            }
        }

        public void agregarPaciente(Paciente paciente) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Seleccione la consulta (1-5):");
            mostrarEstadoColas();

        }

        public void atenderSiguientePaciente() {
            System.out.println("Seleccione la consulta (1-5):");
            mostrarEstadoColas();
        }

        private static String generarNombreAleatorio() {
            String[] nombres = {"Ana", "Pedro", "Laura", "Javier", "Maria", "Luis", "Marta", "David", "Sara", "Miguel"};
            Random random = new Random();
            return nombres[random.nextInt(nombres.length)];
        }

        private static int generarNumeroColegiado() {
            Random random = new Random();
            return random.nextInt(900000) + 100000;
        }

        private static String generarSIP() {
            Random random = new Random();
            String numero = String.format("%08d", random.nextInt(100000000));
            String[] letras = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
            return numero + letras[random.nextInt(letras.length)];
        }

}
