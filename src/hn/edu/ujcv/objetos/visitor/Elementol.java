package hn.edu.ujcv.objetos.visitor;

public class Elementol extends Elemento{

    Elementol(Elemento pSiguiente, Elemento pHijo){
        super();
        this.siguiente = pSiguiente;
        this.hijo = pHijo;
    }
    @Override
    public void Aceptar(IVisitante pVisitante){
        pVisitante.visitar(this);
    }
}
