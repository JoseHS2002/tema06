package com.josehs.tema06.Ejercicio3;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class GestionAlumnos {

    private List<Alumno> alumnos;

    public GestionAlumnos() {
        alumnos = new ArrayList<>();
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        registrarAlumnosPrueba();

        do {
            Principal.mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    nuevoAlumno(scanner);
                    break;
                case 2:
                    bajaAlumno(scanner);
                    break;
                case 3:
                    consultas(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, elige una opción válida.");
            }
        } while (opcion != 0);
    }

    private void nuevoAlumno(Scanner scanner) {
        System.out.println("Nuevo Alumno");
        System.out.print("NIA: ");
        int nia = scanner.nextInt();
        scanner.nextLine();

        if (existeAlumno(nia)) {
            System.out.println("Error: Ya existe un alumno con ese NIA.");
            return;
        }

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Apellidos: ");
        String apellidos = scanner.nextLine();

        System.out.print("Fecha de nacimiento (AAAA-MM-DD): ");
        LocalDate fechaNacimiento = LocalDate.parse(scanner.nextLine());

        System.out.print("Grupo: ");
        String grupo = scanner.nextLine();

        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();

        Alumno nuevoAlumno = new Alumno(nia, nombre, apellidos, fechaNacimiento, grupo, telefono);
        alumnos.add(nuevoAlumno);

        System.out.println("Alumno registrado correctamente.");
    }

    private void bajaAlumno(Scanner scanner) {
        System.out.println("Baja de Alumno");
        System.out.print("NIA del alumno a eliminar: ");
        int nia = scanner.nextInt();
        scanner.nextLine();

        Alumno alumnoEliminar = buscarAlumnoPorNia(nia);

        if (alumnoEliminar != null) {
            System.out.println("¿Está seguro de que desea eliminar a " + alumnoEliminar.getNombre() + " " + alumnoEliminar.getApellidos() + "? (S/N)");
            String confirmacion = scanner.nextLine();

            if (confirmacion.equalsIgnoreCase("S")) {
                alumnos.remove(alumnoEliminar);
                System.out.println("Alumno eliminado correctamente.");
            } else {
                System.out.println("Eliminación cancelada.");
            }
        } else {
            System.out.println("No se encontró ningún alumno con ese NIA.");
        }
    }

    private void consultas(Scanner scanner) {
        int opcionConsulta;

        do {
            Principal.mostrarMenuConsultas();
            opcionConsulta = scanner.nextInt();
            scanner.nextLine();

            switch (opcionConsulta) {
            }
        } while (opcionConsulta != 0);
    }

    private void consultarPorGrupo(Scanner scanner) {
        System.out.print("Grupo: ");
        String grupo = scanner.nextLine();

        System.out.println("Alumnos del grupo " + grupo + ":");
        for (Alumno alumno : alumnos) {
            if (alumno.getGrupo().equalsIgnoreCase(grupo)) {
                System.out.println(alumno);
            }
        }
    }

    private void consultarPorEdad(Scanner scanner) {
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Alumnos con " + edad + " años:");
        for (Alumno alumno : alumnos) {
            if (calcularEdad(alumno.getFechaNacimiento()) == edad) {
                System.out.println(alumno);
            }
        }
    }

    private void consultarPorNia(Scanner scanner) {
        System.out.print("NIA: ");
        int nia = scanner.nextInt();
        scanner.nextLine();

        Alumno alumno = buscarAlumnoPorNia(nia);

        if (alumno != null) {
            System.out.println(alumno);
        } else {
            System.out.println("No se encontró ningún alumno con ese NIA.");
        }
    }

    private void consultarPorApellidos(Scanner scanner) {
        System.out.print("Parte de los apellidos: ");
        String parteApellidos = scanner.nextLine();

        System.out.println("Alumnos cuyos apellidos empiezan por " + parteApellidos + ":");
        for (Alumno alumno : alumnos) {
            if (alumno.getApellidos().startsWith(parteApellidos)) {
                System.out.println(alumno);
            }
        }
    }

    private Alumno buscarAlumnoPorNia(int nia) {
        for (Alumno alumno : alumnos) {
            if (alumno.getNia() == nia) {
                return alumno;
            }
        }
        return null;
    }

    private boolean existeAlumno(int nia) {
        return buscarAlumnoPorNia(nia) != null;
    }

    private int calcularEdad(LocalDate fechaNacimiento) {
        LocalDate ahora = LocalDate.now();
        return Period.between(fechaNacimiento, ahora).getYears();
    }

    private void registrarAlumnosPrueba() {
        Random random = new Random();
        String[] nombres = {"Juan", "Ana", "Pedro", "María", "Luis", "Laura", "Javier", "Isabel"};
        String[] apellidos = {"García", "Rodríguez", "González", "Fernández", "López", "Martínez", "Sánchez", "Pérez"};
        String[] grupos = {"A", "B", "C", "D"};

        for (int i = 0; i < 5; i++) {
            int nia = random.nextInt(1000000);
            String nombre = nombres[random.nextInt(nombres.length)];
            String apellido = apellidos[random.nextInt(apellidos.length)];
            LocalDate fechaNacimiento = LocalDate.of(1995 + random.nextInt(10), random.nextInt(12) + 1, random.nextInt(28) + 1);
            String grupo = grupos[random.nextInt(grupos.length)];
            String telefono = String.valueOf(random.nextInt(900000000) + 600000000);

            alumnos.add(new Alumno(nia, nombre, apellido, fechaNacimiento, grupo, telefono));
        }
    }
}
