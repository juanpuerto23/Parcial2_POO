package vista;


import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;

public class DialogoCrearCuenta extends JDialog 
{
        private JLabel lbNumCuenta;
        private static JTextField tfNumCuenta;
        public JButton btnAgregarCuenta;
        private JLabel lbSaldo;
        private static JTextField tfSaldo;
        private JLabel lbTipoCuenta;
        private static JTextField tfTipoCuenta;

        public DialogoCrearCuenta() {
                lbNumCuenta = new JLabel("Numero Cuenta =");
                lbNumCuenta.setBounds(10, 20, 140, 20);

                tfNumCuenta = new JTextField();
                tfNumCuenta.setBounds(150, 20, 100, 25);
                
                tfTipoCuenta = new JTextField();
                tfTipoCuenta.setBounds(150, 120, 100, 25);

                lbTipoCuenta = new JLabel("Tipo Cuenta =");
                lbTipoCuenta.setBounds(10, 120, 140, 20);

                lbSaldo = new JLabel("Saldo Inicial =");
                lbSaldo.setBounds(10, 170, 140, 20);

                tfSaldo = new JTextField();
                tfSaldo.setBounds(150, 170, 100, 25);

                btnAgregarCuenta = new JButton("Agregar");
                btnAgregarCuenta.setBounds(120, 240, 100, 25);
                btnAgregarCuenta.setActionCommand("Aceptar");

                this.setLayout(null);
                this.setTitle("Cuenta");
                this.setSize(300, 300);
                this.setLocationRelativeTo(null);
                this.setResizable(false);
                this.setVisible(true);
                this.add(lbNumCuenta);
                this.add(tfNumCuenta);
                this.add(tfSaldo);
                this.add(lbSaldo);
                this.add(lbTipoCuenta);
                this.add(tfTipoCuenta);
                this.add(btnAgregarCuenta);
        }

        public static String getNumCuenta() {
                return tfNumCuenta.getText();
        }

        public static String getTipoCuenta()
        {
                return tfTipoCuenta.getText();
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