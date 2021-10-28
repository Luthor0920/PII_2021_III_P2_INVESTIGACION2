package hn.edu.ujcv.objetos.banco;

public class SolObservador extends Observador{
    private double valorCambio = 24.25;

    public SolObservador(Sujeto pSujeto){
        this.sujeto = pSujeto;
        this.sujeto.agregar(this);
    }
    @Override
    public void actualizar() {
        System.out.println("HNL: "+(sujeto.getEstado()*valorCambio));
    }
}
