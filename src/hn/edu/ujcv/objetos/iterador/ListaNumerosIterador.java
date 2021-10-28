package hn.edu.ujcv.objetos.iterador;

public class ListaNumerosIterador implements Iterador{ //Prototype
    private int numeros[];
    private int posicion;

    public ListaNumerosIterador(int pNumeros[]){
        this.numeros = pNumeros;
        this.posicion = 0;
    }
    @Override
    public Object siguiente(){ //Prototype
        return numeros[posicion++];
    }
    @Override
    public boolean tieneSiguiente(){
        if (posicion < numeros.length && numeros[posicion] != 0){
            return true;
        }else{
            return false;
        }
    }
}
