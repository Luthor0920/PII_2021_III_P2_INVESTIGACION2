package hn.edu.ujcv.objetos.empleados;

public abstract class Empleado {
    private String Nombre;
    private String Id;

    public Empleado(){
    }
    public Empleado (String pNombre, String pId){
        this.Nombre = pNombre;
        this.Id     = pId;
    }
    public String getId() {
        return Id;
    }
    public String getNombre() {
        return Nombre;
    }
    public abstract double calcularSueldo();
}
