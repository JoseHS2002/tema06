package com.josehs.tema06.pilascolas.Hospital;

class ColaConsulta<T> {
    Medico medico;
    Cola<T> colaPacientes;

    public ColaConsulta(Medico medico) {
        this.medico = medico;
        this.colaPacientes = new Cola<>();
    }

    public void agregarPaciente(T paciente) {
        return colaPacientes.ponerElementos(paciente);
    }

    public void atenderSiguientePaciente(T paciente) {
        return colaPacientes.quitarElementos(paciente);
    }

    @Override
    public String toString() {
        return "ColaConsulta{" +
                "medico=" + medico +
                ", colaPacientes=" + colaPacientes +
                '}';
    }
}

