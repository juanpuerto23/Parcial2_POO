package Ejecutable;

import Modelo.Banco;
import vista.VentanaPrincipal;
import Controlador.controlador;

public class Test
{
    public static void main(String[] args) 
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        Banco miBiblioteca = new Banco();
        controlador miControlador = new controlador(miVentana, miBiblioteca);    
    }
}
