package com.josehs.tema06.pilascolas;

public class PilaString {
    private static final int INITIAL_SIZE = 10;
    private String[] data;
    private int size;
    public PilaString() {this(INITIAL_SIZE);}
    public PilaString(int initialSize) {
        data = new String[size];
        this.size = 0;
    }
}
