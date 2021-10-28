package hn.edu.ujcv.objetos.antivirus;

public abstract class Analisis implements IEstrategia{
    @Override
    public void analizar() {
        iniciar();
        saltarZip();
        detener();
    }
    abstract void iniciar();
    abstract void saltarZip();
    abstract void detener();
}
