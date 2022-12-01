package Modelo;

public class Cuenta
{
    private int numeroCuenta;
    private double saldo;
    private String tipoCuenta;

    public Cuenta(int cuenta, double inicial, String tipo)
    {
        numeroCuenta = cuenta;
        saldo = inicial;
        tipo = tipoCuenta;
    }

    public Cuenta()
    {
        this.numeroCuenta = 0;
        this.saldo = 0;
        this.tipoCuenta = "";
    }

    public Integer getNumCuenta()
    {
        return numeroCuenta;
    }

    public Double getSaldo()
    {
        return saldo;
    }

    public String getTipoCuenta()
    {
        return tipoCuenta;
    }

    public String toString()
    {
        return("-Numero de cuena: " + numeroCuenta + "\n-Saldo Inicial: " + saldo + "\n-TipoCuenta: " + tipoCuenta);
    }
}