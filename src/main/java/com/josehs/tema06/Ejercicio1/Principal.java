package com.josehs.tema06.Ejercicio1;

public class Principal {
    public static void main(String[] args) {
        Coche coche = new Coche();
        System.out.println(coche);

        for (int i = 2; i <= 9999; i++) {
            coche.generarValoresMatricula();
            System.out.println(coche);
        }

        /*
        Coche coche2 = new Coche("Ford Focus", "Azul", true, "1234-ABC", Coche.TipoCoche.FAMILIAR, 2020, Coche.ModalidadSeguro.TODO_RIESGO);
        System.out.println(coche2);

        Coche coche3 = new Coche("Toyota Yaris", "Rojo", false, "5678-DEF", Coche.TipoCoche.UTILITARIO, 2022, Coche.ModalidadSeguro.A_TERCEROS);
        System.out.println(coche3);

        coche1.setColor("Rojo");
        coche1.setTipoCoche(Coche.TipoCoche.DEPORTIVO);
        coche2.setAnoFabricacion(2021);
        coche2.setModalidadSeguro(Coche.ModalidadSeguro.A_TERCEROS);

        System.out.println("\nCaracterísticas de los coches actualizadas:");
        System.out.println(coche1);
        System.out.println(coche2);
        System.out.println(coche3);

         */
    }
}
