package hn.edu.ujcv;

import hn.edu.ujcv.objetos.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("SINGLETON");
        Logger logger = Logger.getInstance();
        logger.log("Mensaje");

        System.out.println("\nADAPTER");
        Guitarra gElectrica = new GuitarraElectroAcustica();
        gElectrica.encenderGuitarra();
        gElectrica.apagarGuitarra();

        Guitarra gAcustica = new GuitarraElectroAcustica();
        gAcustica.encenderGuitarra();
        gAcustica.apagarGuitarra();

        System.out.println("\nITERADOR");
        ListaNumeros lista1 = new ListaNumeros();
        Iterador iterador;
        lista1.agregar(16);
        lista1.agregar(85);
        lista1.agregar(75);
        lista1.agregar(98);

        iterador = lista1.iterador();
        while (iterador.tieneSiguiente()){
            //Accede al elemento
            int numero = (int) iterador.siguiente(); //Se realiza un cast
            //Hacer algo con el elemento
            System.out.println(numero);
        }

    }
}
