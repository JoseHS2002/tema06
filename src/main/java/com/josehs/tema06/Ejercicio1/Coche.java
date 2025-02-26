package com.josehs.tema06.Ejercicio1;

public class Coche {
    private String modelo;
    private String color;
    private boolean pinturaMetalizada;
    private String matricula;
    private TipoCoche tipoCoche;
    private int anyoFabricacion;
    private ModalidadSeguro modalidadSeguro;

    /**
     * Hacemos un enumerado para elegir el tipo de coche.
     */
    public enum TipoCoche {
        MINI, UTILITARIO, FAMILIAR, DEPORTIVO
    }

    /**
     * Hacemos un enumerado para elegir la modalidad de seguro del coche
     */
    public enum ModalidadSeguro {
        A_TERCEROS, TODO_RIESGO
    }

    /**
     * Definimos los valores de los atributos del coche
     */
    public Coche() {
        this.modelo = "Renault Clio";
        this.color = "Gris";
        this.pinturaMetalizada = false;
        this.matricula = "9876-GHI";
        this.tipoCoche = TipoCoche.UTILITARIO;
        this.anyoFabricacion = 2019;
        this.modalidadSeguro = ModalidadSeguro.A_TERCEROS;
    }

    /**
     *
     * @param modelo
     * @param color
     * @param pinturaMetalizada
     * @param matricula
     * @param tipoCoche
     * @param anoFabricacion
     * @param modalidadSeguro
     */
    public Coche(String modelo, String color, boolean pinturaMetalizada, String matricula, TipoCoche tipoCoche, int anoFabricacion, ModalidadSeguro modalidadSeguro) {
        this.modelo = modelo;
        this.color = color;
        this.pinturaMetalizada = pinturaMetalizada;
        this.matricula = matricula;
        this.tipoCoche = tipoCoche;
        this.anyoFabricacion = anyoFabricacion;
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

    public int getAnyoFabricacion() {
        return anyoFabricacion;
    }

    public void setAnyoFabricacion(int anoFabricacion) {
        this.anyoFabricacion = anoFabricacion;
    }

    public ModalidadSeguro getModalidadSeguro() {
        return modalidadSeguro;
    }

    public void setModalidadSeguro(ModalidadSeguro modalidadSeguro) {
        this.modalidadSeguro = modalidadSeguro;
    }

    /**
     * Genera los valores de la matricula
     */
    public void generarValoresMatricula() {
        String numero = String.format("%04d", Integer.parseInt(this.matricula.substring(0, 4)) + 1);
        String letras = this.matricula.substring(4);
        char[] letrasArray = letras.toCharArray();

        for (int i = letrasArray.length - 1; i >= 0; i--) {
            if (letrasArray[i] < 'Z') {
                letrasArray[i]++;
                break;
            } else {
                letrasArray[i] = 'A';
                if (i == 0) {
                    // Si se llega a la primera letra y es 'Z', se reinicia la matrícula
                    this.matricula = "0001AAA";
                }
            }
        }

        this.matricula = numero + new String(letrasArray);
    }

    @Override
    public String toString() {
        return "Coche{" +
                "modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", pinturaMetalizada=" + pinturaMetalizada +
                ", matricula='" + matricula + '\'' +
                ", tipoCoche=" + tipoCoche +
                ", anoFabricacion=" + anyoFabricacion +
                ", modalidadSeguro=" + modalidadSeguro +
                '}';
    }
}
