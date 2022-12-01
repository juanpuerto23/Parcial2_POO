package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;

public class PanelOperaciones extends JPanel
{
 
    public JButton btnAgregarCuenta;
    public JButton btnSalir;
    public JButton btnBorrar;

    public PanelOperaciones()
    {
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        btnBorrar = new JButton("Borrar");
        btnBorrar.setBounds(105, 60, 170, 20);
        btnBorrar.setActionCommand("borrarTexto");

        btnAgregarCuenta = new JButton("Agregar Cuenta");
        btnAgregarCuenta.setBounds(105,20,170,20);
        btnAgregarCuenta.setActionCommand("AgregarCuenta");
        this.add(btnAgregarCuenta);

        btnSalir = new JButton("Salir");
        btnSalir.setBounds(105,80,170,20); 
        btnSalir.setActionCommand("Salir");
        this.add(btnSalir);

        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);

        this.add(btnAgregarCuenta);
        this.add(btnBorrar);
        this.add(btnSalir);
    }

    public void agregarOyentesBotones(ActionListener pAL)
    {
        btnAgregarCuenta.addActionListener(pAL);
        btnSalir.addActionListener(pAL);
    }


}