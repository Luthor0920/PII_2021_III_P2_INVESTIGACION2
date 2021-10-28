package hn.edu.ujcv.objetos.visitor;

public class Elemento implements IElemento{
    private double Costo;
    private String Nombre;

    public Elemento siguiente;
    public Elemento hijo;

    public Elemento(){}

    public Elemento(double pCosto, String pNombre, Elemento pSiguiente, Elemento pHijo){
        this.Costo = pCosto;
        this.Nombre = pNombre;
        this.siguiente = pSiguiente;
        this.hijo = pHijo;
    }

    public double getCosto() {
        return Costo;
    }
    public void setCosto(double costo) {
        this.Costo = costo;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public Elemento getHijo() {
        return hijo;
    }
    public void setHijo(Elemento hijo) {
        this.hijo = hijo;
    }
    public Elemento getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(Elemento siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public void Aceptar(IVisitante pVisitante) {
        pVisitante.visitar(this);
    }
}
