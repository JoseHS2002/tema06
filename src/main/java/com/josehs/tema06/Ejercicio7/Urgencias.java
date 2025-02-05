package com.josehs.tema06.Ejercicio7;

import java.util.Scanner;

public class Urgencias {
    /*
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("********************");
        System.out.println("**   URGENCIAS   **");
        System.out.println("********************");
        System.out.println("1. Nuevo paciente ...");
        System.out.println("2. Atender paciente ...");
        System.out.println("3. Consultas ...");
        System.out.println("4. Alta medica ...");
        System.out.println("---------------------");
        System.out.println("0. Salir");

        System.out.print("Dime el numero de filas de la matriz: ");
        int filas = keyboard.nextInt();
        int columnas = 14;
        double[][] matriz = new double[filas][columnas];
        System.out.println("Dime los valores de la matriz:");
        matriz[0][14] = {"Sip", "Nombre", "Sexo", "Fecha de entrada", "Hora de entrada", "Edad", "Sintomatologia", "Temp", "ppm", "TenSis", "TenDias", "Fecha de alta", "Hora de alta", "Motivo del alta"};
        for (int i = 1; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Dime el valor para la celda [" + i + "][" + j + "]: ");
                matriz[i][j] = keyboard.nextDouble();
            }
        }
        System.out.println("\nMatriz ingresada:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print((matriz[i][j]) + " ");
            }
            System.out.println();
        }
        keyboard.close();

    }
     */
}

/*
import java.time.LocalDateTime;

public class Paciente {
    private String sip;
    private String nombre;
    private String sexo;
    private int edad;
    private LocalDateTime fechaHoraEntrada;
    private String sintomatologia;
    private LocalDateTime fechaAlta;
    private double[] preRev = new double[4]; // [temperatura, pulsaciones, sistólica, diastólica]

    public Paciente(String sip, String nombre, String sexo, int edad, String sintomatologia) {
        this.sip = sip;
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.fechaHoraEntrada = LocalDateTime.now();
        this.sintomatologia = sintomatologia;
        this.fechaAlta = null; // Paciente no dado de alta
    }

    // Getters y Setters
    public String getSip() {
        return sip;
    }

    public void setPreRev(double temperatura, double pulsaciones, double sistolica, double diastolica) {
        this.preRev[0] = temperatura;
        this.preRev[1] = pulsaciones;
        this.preRev[2] = sistolica;
        this.preRev[3] = diastolica;
    }

    public void darAlta(LocalDateTime fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public boolean estaAtendido() {
        return fechaAlta == null;
    }

    // Método para mostrar información del paciente
    public String mostrarInfo() {
        return "SIP: " + sip + ", Nombre: " + nombre + ", Sexo: " + sexo +
               ", Edad: " + edad + ", Fecha y Hora de Entrada: " + fechaHoraEntrada +
               ", Sintomatología: " + sintomatologia + ", Fecha de Alta: " + fechaAlta;
    }
}
 */

/*
import java.util.ArrayList;
import java.util.List;

public class CentroSalud {
    private List<Paciente> pacientes;
    private static final int MAX_PACIENTES = 40;

    public CentroSalud() {
        pacientes = new ArrayList<>();
    }

    public boolean registrarPaciente(Paciente paciente) {
        if (pacientes.size() < MAX_PACIENTES) {
            pacientes.add(paciente);
            return true;
        }
        return false; // No se puede registrar más pacientes
    }

    public Paciente atenderPaciente(String sip) {
        for (Paciente p : pacientes) {
            if (p.getSip().equals(sip) && p.estaAtendido()) {
                return p;
            }
        }
        return null; // No se encontró paciente
    }

    public void darAlta(String sip) {
        for (Paciente p : pacientes) {
            if (p.getSip().equals(sip) && p.estaAtendido()) {
                p.darAlta(LocalDateTime.now());
                break;
            }
        }
    }

    public List<Paciente> obtenerPacientesAtendidos() {
        List<Paciente> atendidos = new ArrayList<>();
        for (Paciente p : pacientes) {
            if (!p.estaAtendido()) {
                atendidos.add(p);
            }
        }
        return atendidos;
    }

    // Otros métodos para consultas y estadísticas...
}
 */

/*
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        CentroSalud centroSalud = new CentroSalud();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("********************");
            System.out.println("** URGENCIAS **");
            System.out.println("********************");
            System.out.println("1. Nuevo paciente …");
            System.out.println("2. Atender paciente …");
            System.out.println("3. Consultas …");
            System.out.println("4. Alta médica …");
            System.out.println("-----------------------------");
            System.out.println("0. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    // Nuevo paciente
                    System.out.println("Ingrese SIP:");
                    String sip = scanner.nextLine();
                    System.out.println("Ingrese Nombre:");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese Sexo:");
                    String sexo = scanner.nextLine();
                    System.out.println("Ingrese Edad:");
                    int edad = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer
                    System.out.println("Ingrese Sintomatología:");
                    String sintomatologia = scanner.nextLine();

                    Paciente paciente = new Paciente(sip, nombre, sexo, edad, sintomatologia);
                    if (centroSalud.registrarPaciente(paciente)) {
                        System.out.println("Paciente registrado con éxito.");
                    } else {
                        System.out.println("No se puede registrar más pacientes.");
                    }
                    break;

                case 2:
                    // Atender paciente
                    System.out.println("Ingrese SIP del paciente a atender:");
                    String sipAtender = scanner.nextLine();
                    Paciente pacienteAtendido = centroSalud.atenderPaciente(sipAtender);
                    if (pacienteAtendido != null) {
                        System.out.println("Atendiendo a: " + pacienteAtendido.mostrarInfo());
                        System.out.println("Ingrese temperatura:");
                        double temperatura = scanner.nextDouble();
                        System.out.println("Ingrese pulsaciones:");
                        double pulsaciones = scanner.nextDouble();
                        System.out.println("Ingrese tensión sistólica:");
                        double sistolica = scanner.nextDouble();
                        System.out.println("Ingrese tensión diastólica:");
                        double diastolica = scanner.nextDouble();
                        pacienteAtendido.setPreRev(temperatura, pulsaciones, sistolica, diastolica);
                        System.out.println("Paciente atendido con éxito.");
                    } else {
                        System.out.println("Paciente no encontrado o ya atendido.");
                    }
                    break;

                case 3:
                    // Consultas (submenú)
                    mostrarSubmenuConsultas(scanner, centroSalud);
                    break;

                case 4:
                    // Alta médica
                    System.out.println("Ingrese SIP del paciente para dar de alta:");
                    String sipAlta = scanner.nextLine();
                    centroSalud.darAlta(sipAlta);
                    System.out.println("Alta médica registrada.");
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 0);
        scanner.close();
    }

    private static void mostrarSubmenuConsultas(Scanner scanner, CentroSalud centroSalud) {
        // Implementar las diferentes consultas aquí.
        System.out.println("***************");
        System.out.println("** CONSULTAS **");
        System.out.println("***************");
        System.out.println("1. Por Sip …");
        System.out.println("2. Por fechas …");
        System.out.println("3. Estadísticas");
        System.out.println("4. Mostrar histórico mensual");
        System.out.println("--------------------------------");
        System.out.println("0. Volver al menú principal");

        // Aquí puedes implementar el manejo de las opciones del submenú.
    }
}
 */

/*
public List<Paciente> obtenerHistoricoMensual() {
    List<Paciente> historico = new ArrayList<>();
    for (Paciente p : pacientes) {
        if (!p.estaAtendido()) {
            historico.add(p);
        }
    }
    return historico;
}
 */

/*
private static void mostrarSubmenuConsultas(Scanner scanner, CentroSalud centroSalud) {
    int opcion;
    do {
        System.out.println("***************");
        System.out.println("** CONSULTAS **");
        System.out.println("***************");
        System.out.println("1. Por Sip …");
        System.out.println("2. Por fechas …");
        System.out.println("3. Estadísticas");
        System.out.println("4. Mostrar histórico mensual");
        System.out.println("--------------------------------");
        System.out.println("0. Volver al menú principal");
        opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        switch (opcion) {
            case 1:
                // Implementar consulta por SIP (no incluido en este ejemplo)
                break;
            case 2:
                // Implementar consulta por fechas (no incluido en este ejemplo)
                break;
            case 3:
                // Implementar estadísticas (no incluido en este ejemplo)
                break;
            case 4:
                // Mostrar histórico mensual
                mostrarHistoricoMensual(centroSalud);
                break;
            case 0:
                System.out.println("Volviendo al menú principal...");
                break;
            default:
                System.out.println("Opción no válida. Inténtalo de nuevo.");
        }
    } while (opcion != 0);
}

private static void mostrarHistoricoMensual(CentroSalud centroSalud) {
    List<Paciente> historico = centroSalud.obtenerHistoricoMensual();

    // Imprimir cabecera de la matriz
    System.out.printf("%-10s %-20s %-10s %-5s %-25s %-20s%n", "SIP", "Nombre", "Sexo", "Edad", "Fecha y Hora de Entrada", "Fecha de Alta");
    System.out.println("--------------------------------------------------------------------------------------------------");

    // Imprimir los datos de los pacientes atendidos
    for (Paciente p : historico) {
        System.out.printf("%-10s %-20s %-10s %-5d %-25s %-20s%n",
                          p.getSip(),
                          p.nombre,
                          p.sexo,
                          p.edad,
                          p.fechaHoraEntrada,
                          p.fechaAlta != null ? p.fechaAlta.toString() : "No dado de alta");
    }
}
 */