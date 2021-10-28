package hn.edu.ujcv.objetos.banco;

import hn.edu.ujcv.objetos.banco.Cuenta;

public interface ICuenta {
    Cuenta retirarDinero(Cuenta cuenta, double monto);
    Cuenta depositarDinero(Cuenta cuenta, double monto);
    void mostrarSaldo(Cuenta cuenta);
}
