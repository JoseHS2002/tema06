package com.josehs.tema06.pilascolas.Hospital;

import java.time.LocalDateTime;


class Paciente {
    String nombre;
    String SIP;
    LocalDateTime horaIngreso;

    public Paciente(String nombre, String SIP) {
        this.nombre = nombre;
        this.SIP = SIP;
        this.horaIngreso = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", SIP='" + SIP + '\'' +
                ", horaIngreso=" + horaIngreso +
                '}';
    }
}

