package hn.edu.ujcv.objetos.iterador;

public class ListaNumeros {
    private int numeros[];
    private int posicion;

    public ListaNumeros(){
        numeros = new int[10];
        posicion = 0;
    }
    public void agregar(int x){
        numeros[posicion++] = x;
    }
    public ListaNumerosIterador iterador(){
        return new ListaNumerosIterador(numeros);
    }
}
