package Controlador;

import Modelo.Banco;
import Modelo.Cuenta;
import vista.VentanaPrincipal;
import vista.DialogoCrearCuenta;
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
        this.venPrin.miPanelOperaciones.btnAgregarCuenta.addActionListener(this);
        this.venPrin.miPanelOperaciones.btnBorrar.addActionListener(this);
        this.venPrin.miPanelOperaciones.btnSalir.addActionListener(this);
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        this.venPrin.miPanelResultados.mostrarResultado("Funciona :D");
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        String comando = ae.getActionCommand();

        if(comando.equals("AgregarCuenta"))
        {
            venPrin.crearDialogoAgregarLibro();
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

        if(comando.equals("Salir"))
        {
            System.exit(0);
        }
    }
}