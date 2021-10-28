package hn.edu.ujcv.objetos.guitarra;

public class GuitarraElectroAcustica extends Guitarra{ //Clase ADAPTER
    GuitarraAcustica acustica = new GuitarraAcustica(); //Dependencia SOLID

    @Override
    public void encenderGuitarra() { //Liskov SOLID
        acustica.tocar();

    } //Builder
    @Override
    public void apagarGuitarra() {
        acustica.DejarDeTocar();
    }
}
