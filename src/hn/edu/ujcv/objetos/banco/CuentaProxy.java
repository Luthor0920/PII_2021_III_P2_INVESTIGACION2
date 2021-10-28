package hn.edu.ujcv.objetos.banco;

public class CuentaProxy implements ICuenta {
    private CuentaBanco cuentaReal;
    @Override
    public Cuenta retirarDinero(Cuenta cuenta, double monto) {
        if (cuentaReal == null) {
            cuentaReal = new CuentaBanco();
            return cuentaReal.retirarDinero(cuenta, monto);
        }else{
            return cuentaReal.retirarDinero(cuenta, monto);
        }
    }

    @Override
    public Cuenta depositarDinero(Cuenta cuenta, double monto) {
        if (cuentaReal == null) {
            cuentaReal = new CuentaBanco();
            return cuentaReal.depositarDinero(cuenta, monto);
        }else{
            return cuentaReal.depositarDinero(cuenta, monto);
        }
    }

    @Override
    public void mostrarSaldo(Cuenta cuenta) {
        if (cuentaReal == null) {
            cuentaReal = new CuentaBanco();
            cuentaReal.mostrarSaldo(cuenta);
        }else{
            cuentaReal.mostrarSaldo(cuenta);
        }
    }
}
