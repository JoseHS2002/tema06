package com.josehs.tema06.pilascolas.Hospital;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Principal {
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();
    public static void main(String[] args) {

        List<Medico> medicos = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String nombreMedico = "Dr. " + generarNombreAleatorio();
            String numeroColegiado = generarNumeroColegiadoAleatorio();
            medicos.add(new Medico(nombreMedico, numeroColegiado));
        }

        Hospital<Paciente> hospital = new Hospital<>();
        for (int i = 0; i < 5; i++) {
            ColaConsulta<Paciente> colaConsulta = new ColaConsulta<>(medicos.get(i));
            for (int j = 0; j < 5; j++) {
                String nombrePaciente = generarNombreAleatorio();
                String SIP = generarSIPAleatorio();
                colaConsulta.agregarPaciente(new Paciente(nombrePaciente, SIP));
            }
            hospital.agregarConsulta(colaConsulta);
        }

        int opcion;
        do {
            System.out.println("=== HOSPITAL ===");
            System.out.println("1. Añadir paciente");
            System.out.println("2. Atender siguiente paciente");
            System.out.println("3. Mostrar estado de las colas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    hospital.mostrarEstadoColas();
                    System.out.println("Seleccione la consulta a la que añadir el paciente: ");
                    int consultaElegida = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Introduzca el nombre del paciente: ");
                    String nombrePaciente = scanner.nextLine();
                    System.out.println("Introduzca el SIP del paciente: ");
                    String SIP = scanner.nextLine();
                    hospital.consultas.get(consultaElegida).agregarPaciente(new Paciente(nombrePaciente, SIP));
                    System.out.println("Paciente añadido a la cola.");
                    System.out.println("Cola seleccionada: " + hospital.consultas.get(consultaElegida));
                    break;
                case 2:
                    hospital.mostrarEstadoColas();
                    System.out.print("Seleccione la consulta a la que atender: ");
                    int consultaElegida2 = scanner.nextInt() - 1;
                    scanner.nextLine();
                    Paciente pacienteAtendido = hospital.consultas.get(consultaElegida2).atenderSiguientePaciente(paciente);
                    if (pacienteAtendido != null) {
                        System.out.println("Paciente atendido: " + pacienteAtendido);
                    } else {
                        System.out.println("La cola está vacía.");
                    }
                    System.out.println("Cola seleccionada: " + hospital.consultas.get(consultaElegida2));
                    break;
                case 3:
                    hospital.mostrarEstadoColas();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);
    }

    //Genera aleatoriamente los nombres de los medicos y los pacientes
    private static String generarNombreAleatorio() {
        String[] nombres = {"Juan", "María", "Pedro", "Ana", "Luis", "Laura", "Miguel", "Carmen", "Javier", "Isabel"};
        return nombres[random.nextInt(nombres.length)];
    }

    //Genera aleatoriamente los numeros de colegiado de los medicos
    private static String generarNumeroColegiadoAleatorio() {
        return String.format("%06d", random.nextInt(1000000));
    }

    //Genera aleatoriamente los SIP de los pacientes
    private static String generarSIPAleatorio() {
        String[] letras = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        return String.format("%08d%s", random.nextInt(100000000), letras[random.nextInt(letras.length)]);
    }
}


