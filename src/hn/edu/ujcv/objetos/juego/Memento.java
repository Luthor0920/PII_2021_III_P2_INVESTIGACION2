package hn.edu.ujcv.objetos.juego;

public class Memento {
    private Juego estado;

    public Memento(Juego pEstado){
        this.estado = pEstado;
    }
    public Juego getEstado() {
        return estado;
    }
}
