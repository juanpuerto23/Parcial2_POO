package Modelo;

import vista.PanelResultados;
import java.util.ArrayList;

public class Banco
{
    private ArrayList<Cuenta> cuentasBanco;

    public Banco(ArrayList<Cuenta> cuentasBanco)
    {
        this.cuentasBanco = cuentasBanco;
    }

    public Banco()
    {
        this.cuentasBanco =  new ArrayList<>();
    }

    public ArrayList<Cuenta> getCuentasBanco() 
    {
        return cuentasBanco;
    }

    public void setCuentasBanco(ArrayList<Cuenta> cuentasBanco) 
    {
        this.cuentasBanco = cuentasBanco;
    }

    public void addCuenta (Cuenta cuenta)
    {
        cuentasBanco.add(cuenta);
    }

    public void imprimirCuentas()
    {
        for(int i = 0; i < cuentasBanco.size(); i++)
        {
            PanelResultados.mostrarResultados(cuentasBanco.get(i).toString());
        }
    }

}