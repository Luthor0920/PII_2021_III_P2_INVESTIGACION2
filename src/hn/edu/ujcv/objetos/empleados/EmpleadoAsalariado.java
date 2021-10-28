package hn.edu.ujcv.objetos.empleados;

public class EmpleadoAsalariado extends Empleado{
    private double Sueldo;

    public EmpleadoAsalariado (String pNombre, String pId,double pSueldo){
        super(pNombre, pId);
        this.Sueldo = pSueldo;
    }
    public double getSueldo() {
        return Sueldo;
    }

    @Override
    public double calcularSueldo() {
        return Sueldo;
    }
}
