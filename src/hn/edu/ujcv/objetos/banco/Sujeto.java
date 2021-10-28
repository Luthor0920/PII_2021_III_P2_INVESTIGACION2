package hn.edu.ujcv.objetos.banco;
import java.util.ArrayList;
import java.util.List;

public class Sujeto {
    private ArrayList<Observador> observadores = new ArrayList<>();
    private int estado;

    public int getEstado(){
        return estado;
    }
    public void setEstado(int estado) {
        this.estado = estado;
        notificarTodosObservadores();
    }
    public void agregar(Observador observador){
        observadores.add(observador);
    }
    public void notificarTodosObservadores(){
        for (Observador observador: observadores) {
            observador.actualizar();
        }
    }
}
