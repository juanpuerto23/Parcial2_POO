package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    private JLabel lbCuenta;
    public JComboBox cbCuenta;
    
    public PanelEntradaDatos()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Crear y agregar etiqueta empleados
        lbCuenta = new JLabel("Cuentas: ", JLabel.RIGHT);
        lbCuenta.setBounds(0,90,100,20);
        this.add(lbCuenta);

        //Crear y agregar combo lista Empleados
        cbCuenta = new JComboBox();
        cbCuenta.setBounds(100,90,260,20);
        this.add(cbCuenta);

        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }

    public String getCuenta()
    {
        return (String) cbCuenta.getSelectedItem();  
    }

    public int getIndexCuenta()
    {
        return cbCuenta.getSelectedIndex();
    }

    public static void borrarTf() 
    {
        JOptionPane.showMessageDialog(null, "Los datos serán borrados...", "Banco de Colombia",
        JOptionPane.WARNING_MESSAGE);
    }
}