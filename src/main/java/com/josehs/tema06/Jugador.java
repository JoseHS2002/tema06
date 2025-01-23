package com.josehs.tema06;

public class Jugador {
    private String nombre;
    private float portero;
    private float defensa;
    private float pase;
    private float regate;
    private float tiro;
    private float estadoForma;

    public Jugador(String nombre, float portero, float defensa, float pase, float regate, float tiro, float estadoForma) {
        this.nombre = nombre;
        this.portero = portero;
        this.defensa = defensa;
        this.pase = pase;
        this.regate = regate;
        this.tiro = tiro;
        this.estadoForma = estadoForma;
    }

    public Jugador(String nombre){
        this(nombre, 50, 50, 50, 50, 50, 50);
    }
}