package com.josehs.tema06;

public class Semaforo {
    public enum Color {
        ROJO, VERDE, AMARILLO
    }

    private static final int TICKS_TRANSICION_AMARILLO = 3;
    private static int contadorID = 0;
    private final int id;
    private Color color;
    private final int ticksTransicion;
    private int ticks;

    public Semaforo(Color color, int ticksTransicion) {
        this.id = ++contadorID;
        this.color = color;
        this.ticksTransicion = ticksTransicion;
        ticks = 0;
    }

    public boolean tick() {
        ticks++;
        boolean cambio = false;
        if (color == Color.AMARILLO) {
            if (ticks == TICKS_TRANSICION_AMARILLO) {
                siguiente();
                cambio = true;
            }
        } else {
            if (ticks == ticksTransicion) {
                siguiente();
                cambio = true;
            }
        }
        return cambio;
    }

    private void siguiente() {
        int indiceSiguiente = (color.ordinal() + 1) % Color.values().length;
        color = Color.values()[indiceSiguiente];
        ticks = 0;
    }

    @Override
    public String toString() {
        return "Semaforo{" +
                "id=" + id +
                "color=" + color +
                '}';
    }
}
