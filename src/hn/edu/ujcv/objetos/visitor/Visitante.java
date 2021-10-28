package hn.edu.ujcv.objetos.visitor;

public class Visitante implements IVisitante{
    private int conteo;
    private int clasificaciones;
    private double total;

    public Visitante(){}

    public Visitante (int pConteo, int pClasificaciones, double pTotal){
        this.conteo = pConteo;
        this.clasificaciones = pClasificaciones;
        this.total = pTotal;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public int getConteo() {
        return conteo;
    }
    public void setConteo(int conteo) {
        this.conteo = conteo;
    }
    public int getClasificaciones() {
        return clasificaciones;
    }
    public void setClasificaciones(int clasificaciones) {
        this.clasificaciones = clasificaciones;
    }
    public void contarElementos(Elemento pElemento){
        pElemento.Aceptar(this);
        if (pElemento.hijo != null)
            contarElementos(pElemento.hijo);
        if (pElemento.siguiente != null)
            contarElementos(pElemento.siguiente);
    }

    @Override
    public void visitar(Elemento pElemento) {
        conteo++;
        total += pElemento.getCosto();
    }

    @Override
    public void visitar(Elementol pElemento) {
        clasificaciones++;
        System.out.println("No conteo");
    }
}
