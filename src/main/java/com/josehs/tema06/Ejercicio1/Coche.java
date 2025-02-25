package com.josehs.tema06.Ejercicio1;

public class Coche {
    private String modelo;
    private String color;
    private boolean pinturaMetalizada;
    private String matricula;
    private TipoCoche tipoCoche;
    private int anyoFabricacion;
    private ModalidadSeguro modalidadSeguro;

    public enum TipoCoche {
        MINI, UTILITARIO, FAMILIAR, DEPORTIVO
    }

    public enum ModalidadSeguro {
        A_TERCEROS, A_TODO_RIESGO
    }

    public Coche() {
        this.modelo = "Modelo Base";
        this.color = "Rojo";
        this.pinturaMetalizada = true;
        this.matricula = "0001AAA"; // Inicializa la matrícula
        this.tipoCoche = TipoCoche.FAMILIAR;
        this.anyoFabricacion = 2023;
        this.modalidadSeguro = ModalidadSeguro.A_TODO_RIESGO;
    }

    public Coche(String modelo, String color, boolean pinturaMetalizada, String matricula, TipoCoche tipoCoche, int añoFabricacion, ModalidadSeguro modalidadSeguro) {
        this.modelo = modelo;
        this.color = color;
        this.pinturaMetalizada = pinturaMetalizada;
        this.matricula = matricula;
        this.tipoCoche = tipoCoche;
        this.anyoFabricacion = añoFabricacion;
        this.modalidadSeguro = modalidadSeguro;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isPinturaMetalizada() {
        return pinturaMetalizada;
    }

    public void setPinturaMetalizada(boolean pinturaMetalizada) {
        this.pinturaMetalizada = pinturaMetalizada;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public TipoCoche getTipoCoche() {
        return tipoCoche;
    }

    public void setTipoCoche(TipoCoche tipoCoche) {
        this.tipoCoche = tipoCoche;
    }

    public int getAñoFabricacion() {
        return anyoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.anyoFabricacion = añoFabricacion;
    }

    public ModalidadSeguro getModalidadSeguro() {
        return modalidadSeguro;
    }

    public void setModalidadSeguro(ModalidadSeguro modalidadSeguro) {
        this.modalidadSeguro = modalidadSeguro;
    }

    // toString
    @Override
    public String toString() {
        return "Coche{" +
                "modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", pinturaMetalizada=" + pinturaMetalizada +
                ", matricula='" + matricula + '\'' +
                ", tipoCoche=" + tipoCoche +
                ", añoFabricacion=" + anyoFabricacion +
                ", modalidadSeguro=" + modalidadSeguro +
                '}';
    }
}
