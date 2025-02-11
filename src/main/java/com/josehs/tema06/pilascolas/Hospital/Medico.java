package com.josehs.tema06.pilascolas.Hospital;

class Medico {
    String nombre;
    String numeroColegiado;

    public Medico(String nombre, String numeroColegiado) {
        this.nombre = nombre;
        this.numeroColegiado = numeroColegiado;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "nombre='" + nombre + '\'' +
                ", numeroColegiado='" + numeroColegiado + '\'' +
                '}';
    }
}

