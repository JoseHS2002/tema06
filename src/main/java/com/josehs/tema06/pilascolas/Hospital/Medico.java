package com.josehs.tema06.pilascolas.Hospital;

public class Medico {
        String nombre;
        int numeroColegiado;

        public Medico(String nombre, int numeroColegiado) {
            this.nombre = nombre;
            this.numeroColegiado = numeroColegiado;
        }

        @Override
        public String toString() {
            return "Medico{" +
                    "nombre='" + nombre + '\'' +
                    ", numeroColegiado=" + numeroColegiado +
                    '}';
        }

}
