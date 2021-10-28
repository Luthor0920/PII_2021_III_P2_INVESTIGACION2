package hn.edu.ujcv.objetos.banco;

public class Cuenta {
    private long IdCuenta;
    private String Usuario;
    private double saldoInicial;

    public Cuenta (long pIdCuenta, String pUsuario, double pSaldoInicial){
        this.IdCuenta = pIdCuenta;
        this.Usuario =pUsuario;
        this.saldoInicial = pSaldoInicial;
    }
    public long getIdCuenta() {
        return IdCuenta;
    }
    public void setIdCuenta(long idCuenta) {
        this.IdCuenta = idCuenta;
    }
    public String getUsuario() {
        return Usuario;
    }
    public void setUsuario(String usuario) {
        this.Usuario = usuario;
    }
    public double getSaldoInicial() {
        return saldoInicial;
    }
    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }
}
