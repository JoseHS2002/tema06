package com.josehs.tema06.Ejercicio6;

import java.util.*;

public class GestionBicicletas {
    Map<String, Bicicleta> bicicletas;

    public GestionBicicletas() {
        bicicletas = new GestionBicicletas();
    }

    public void anyadirBicicleta(Bicicleta bicicleta) {
        if (bicicletas.containsKey(bicicleta.getReferencia())) {
            bicicletas.get(bicicleta.getReferencia());
        } else {
            bicicletas.put(bicicleta.getReferencia(), bicicleta);
        }

    }


    public boolean venderBicicleta(String referencia) {
        if (bicicletas.containsKey(referencia)) {
            return bicicletas.get(referencia).mostrarDatos();
        }
        return false;

    }


    public Bicicleta consultarReferencia(String referencia) {
        return bicicletas.get(referencia);
    }

    public List<Bicicleta> consultarModelo(String modelo) {
        return bicicletas.get(modelo);
    }

    public List<Bicicleta> consultarMarca(String marca) {
        return bicicletas.get(marca);
    }

    public void mostrarStock() {
        for (Bicicleta bicicleta : bicicletas.values()) {
            System.out.println("Referencia: " + bicicleta.getReferencia() + " | Cantidad: " + bicicleta.getCantidad());
        }
    }


}
