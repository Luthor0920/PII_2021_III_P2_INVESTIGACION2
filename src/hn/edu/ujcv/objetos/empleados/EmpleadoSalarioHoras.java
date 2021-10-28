package hn.edu.ujcv.objetos.empleados;

public class EmpleadoSalarioHoras extends EmpleadoAsalariado{
    private double PrecioHora;
    private double Horas;
    public EmpleadoSalarioHoras(String pNombre, String pId, double pSueldo, double pPrecioHora, double pHoras) {
        super(pNombre, pId, pSueldo);
        this.PrecioHora = pPrecioHora;
        this.Horas      = pHoras;
    }
    public double getPrecioHora() {
        return PrecioHora;
    }
    public double getHoras() {
        return Horas;
    }
}
