package Controlador;

import Modelo.Banco;
import Modelo.Cuenta;
import vista.VentanaPrincipal;
import vista.DialogoCrearCuenta;
import vista.DialogoRetirar;
import vista.DialogoDepositar;
import vista.PanelEntradaDatos;
import vista.PanelResultados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class controlador implements ActionListener
{

    private VentanaPrincipal venPrin;
    private Banco Banco;

    public controlador(VentanaPrincipal pVenPrin, Banco pBanco)
    {
        this.venPrin = pVenPrin;
        this.Banco = pBanco;
        this.venPrin.miPanelOperaciones.btnRetirar.addActionListener(this);
        this.venPrin.miPanelOperaciones.btnDepositar.addActionListener(this);
        this.venPrin.miPanelOperaciones.btnAgregarCuenta.addActionListener(this);
        this.venPrin.miPanelOperaciones.btnBorrar.addActionListener(this);
        this.venPrin.miPanelOperaciones.btnSalir.addActionListener(this);
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        this.venPrin.miPanelResultados.mostrarResultado("Programa Inicializado Correctamente.");
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        String comando = ae.getActionCommand();

        if(comando.equals("AgregarCuenta"))
        {
            venPrin.crearDialogoAgregarCuenta();
            this.venPrin.miCuenta.agregarOyenteBoton(this);
        }

        if(comando.equals("Aceptar"))
        {
            Integer Saldo = Integer.parseInt(DialogoCrearCuenta.getTfSaldo());
            String TipoCuenta = DialogoCrearCuenta.getTipoCuenta();
            Integer NumCuenta = Integer.parseInt(DialogoCrearCuenta.getNumCuenta());
            Banco.addCuenta(new Cuenta(Saldo, NumCuenta, TipoCuenta));
            PanelResultados.mostrarResultados("Se ha creado una nueva cuenta!\n");
        }

        if(comando.equals("depositar"))
        {
            venPrin.crearDialogoAgregarDeposito();
            this.venPrin.miDeposito.agregarOyenteBoton(this);
            PanelResultados.mostrarResultados("Se ha hecho un deposito de:\n" + DialogoDepositar.getCantidadDepositar());
        }

        if(comando.equals("retirar"))
        {
            venPrin.crearDialogoAgregarRetiro();
            this.venPrin.miRetiro.agregarOyenteBoton(this);
        }

        if(comando.equals("depositarCuenta"))
        {
            Integer Deposito = Integer.valueOf(DialogoDepositar.getCantidadDepositar());
            Integer Saldo = Integer.parseInt(DialogoCrearCuenta.getTfSaldo());
            Saldo = Saldo + Deposito;
            PanelResultados.mostrarResultados("Se han depositado $" + DialogoDepositar.getCantidadDepositar() + " pesos.");
        }

        if(comando.equals("Salir"))
        {
            System.exit(0);
        }

        if (comando.equals("borrarTexto")) {
            vista.PanelEntradaDatos.borrarTf();
            this.venPrin.miPanelResultados.borrarTa();
        }
    }
}