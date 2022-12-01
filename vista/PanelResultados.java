package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel
{
    private JTextArea taResultado;
    private JScrollPane spResultado;
   
    public PanelResultados()
    {
        
        this.setLayout(null);
        this.setBackground(Color.WHITE);

       
        taResultado = new JTextArea();
        spResultado = new JScrollPane(taResultado);
        spResultado.setBounds(10,20,360,150);
        this.add(spResultado);

       
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }

    
    public void mostrarResultado(String msj)
    {
       
        taResultado.append(msj);
    }

    public void borrarTa()
    {
        taResultado.setText("");
    }


    public static void mostrarResultados(String string) {
    }
}