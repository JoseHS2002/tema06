package com.josehs.tema06.Ejercicio7;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CentroSalud {
    public void anyadirPaciente(String sip, String nombre, Paciente.Genero genero, int edad, LocalDateTime fechaHoraEntrada, String sintomatologia, LocalDateTime fechaHoraAlta) {
        LocalDateTime fechaHora1 = fechaHoraEntrada;
        LocalDateTime fechaHora2 = fechaHoraAlta;
        Paciente nuevoPaciente = new Paciente(sip, nombre, Paciente.Genero genero, edad, fechaHoraEntrada, sintomatologia, fechaHoraAlta);
        pacientes.add(nuevoPaciente);
    }

    public void anyadirPaciente(String sip, String nombre, String genero, int edad, String sintomatologia) {

    }
}
