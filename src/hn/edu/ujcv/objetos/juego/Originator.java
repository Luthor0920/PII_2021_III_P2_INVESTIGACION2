package hn.edu.ujcv.objetos.juego;

public class Originator {
    private Juego estado;

    public void setEstado(Juego pEstado){
        this.estado = pEstado;
    }

    public Juego getEstado() {
        return estado;
    }
    public Memento guardar(){
        return new Memento(estado);
    }
    public void restaurar(Memento m){
        this.estado = m.getEstado();
    }
}
