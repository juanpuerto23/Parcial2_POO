package vista;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.Color;

public class DialogoCrearCuenta extends JDialog 
{
        private JLabel lbNumCuenta;
        private static JTextField tfNumCuenta;
        public JButton btnAgregarCuenta;
        private JLabel lbSaldo;
        private static JTextField tfSaldo;

        public DialogoCrearCuenta() {
                lbNumCuenta = new JLabel("Numero Cuenta =");
                lbNumCuenta.setBounds(10, 20, 140, 20);

                tfNumCuenta = new JTextField();
                tfNumCuenta.setBounds(150, 20, 100, 25);

                lbSaldo = new JLabel("Saldo Inicial =");
                lbSaldo.setBounds(10, 170, 140, 20);

                tfSaldo = new JTextField();
                tfSaldo.setBounds(150, 170, 100, 25);

                btnAgregarCuenta = new JButton("Agregar");
                btnAgregarCuenta.setBounds(120, 240, 100, 25);
                btnAgregarCuenta.setActionCommand("AgregarCuenta");

                this.setLayout(null);
                this.getContentPane().setBackground(Color.decode("#eac435"));
                this.setTitle("Agregar Cuenta");
                this.setSize(300, 300);
                this.setLocationRelativeTo(null);
                this.setResizable(false);
                this.setVisible(true);
                this.add(lbNumCuenta);
                this.add(tfNumCuenta);
                this.add(btnAgregarCuenta);
        }

        

        public static String getNumCuenta() {
                return tfNumCuenta.getText();
        }

        public static String getTfSaldo() {
                return tfSaldo.getText();
        }

        public void agregarOyenteBoton(ActionListener al) {
                btnAgregarCuenta.addActionListener(al);
        }

        public void cerrarDialogoAgregarJugador() {
                this.dispose();
        }
}