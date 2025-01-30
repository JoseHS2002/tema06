package com.josehs.tema06.Futbol;

import java.util.Random;

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

    Jugador futbolista1 = new Jugador("Aitana Bonmatí", 32, 82, 87, 80, 82, 95);
    Jugador futbolista2 = new Jugador("Pablo Gavi", 32, 82, 87, 80, 82, 95);
    Jugador futbolista3 = new Jugador("Ana García");
    Jugador futbolista4 = new Jugador("Rubén Prieto");

    public void crearFutbolista() {
        Jugador futbolista1 = new Jugador("Alexia Putellas", 29, 81, 80, 83, 84, 90);
    }

    public void entrenarPase() {
        Random random = new Random();
        float mejora = random.nextFloat();
        estadoForma += mejora;
        int num = random.nextInt(101);
        if (num >= 100-7) {
            mejora = random.nextFloat();
            pase += mejora;
        }
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "portero=" + portero +
                ", defensa=" + defensa +
                ", pase=" + pase +
                ", regate=" + regate +
                ", tiro=" + tiro +
                ", estadoForma=" + estadoForma +
                '}';
    }

    public float getPase() {
        return pase;
    }
    /*
    public float setPase(float pase) {
        this.pase = pase;
    }
*/

}