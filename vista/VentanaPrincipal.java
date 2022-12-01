package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
    
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelResultados miPanelResultados;
    public DialogoCrearCuenta miCuenta;

    
    
    public VentanaPrincipal()
    {
        
        this.setLayout(null);

        
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10,10,380,190);
        this.add(miPanelEntradaDatos);

        
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10,220,380,120);
        this.add(miPanelOperaciones);

        
        miPanelResultados = new PanelResultados();
        miPanelResultados.setBounds(10,350,380,190);
        this.add(miPanelResultados);

        
        this.setTitle("Parcial 2 POO");
        this.setSize(400,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }
    
    public void crearDialogoAgregarLibro()
    {
        miCuenta = new DialogoCrearCuenta();
    }
}
