package vista;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Modelo.Banco;
import Modelo.Cuenta;

import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Color;

public class DialogoRetirar extends JDialog {
        private JLabel lbCuentas;
        public JComboBox<Cuenta> cbCuentas;
        private JLabel lbCantidadRetirar;
        private JTextField tfCantidadRetirar;
        public JButton btnRetirar;

        public DialogoRetirar() {
                lbCuentas = new JLabel("Cuentas =");
                lbCuentas.setFont(new Font("Serif", Font.PLAIN, 18));
                lbCuentas.setForeground(Color.BLACK);
                lbCuentas.setBounds(230, 95, 480, 30);

                cbCuentas = new JComboBox<>();
                cbCuentas.setFont(new Font("Arial", Font.PLAIN, 18));
                cbCuentas.setForeground(Color.BLACK);
                cbCuentas.setBounds(330, 95, 190, 30);

                lbCantidadRetirar = new JLabel("Cantidad: ");
                lbCantidadRetirar.setBounds(10, 20, 140, 20);

                tfCantidadRetirar = new JTextField();
                tfCantidadRetirar.setBounds(150, 20, 100, 25);

                btnRetirar = new JButton("Retirar");
                btnRetirar.setBounds(120, 180, 100, 25);
                btnRetirar.setActionCommand("retirar");

                this.setLayout(null);
                this.setTitle("Retirar Sueldo");
                this.setSize(300, 300);
                this.setLocationRelativeTo(null);
                this.setResizable(false);
                this.setVisible(true);
                this.add(lbCantidadRetirar);
                this.add(tfCantidadRetirar);
                this.add(btnRetirar);
        }

        public String getCantidadRetirar() {
                return tfCantidadRetirar.getText();
        }

        public void agregarOyenteBoton(ActionListener al) {
                btnRetirar.addActionListener(al);
        }

        public void cerrarDialogoRetirar() {
                this.dispose();
        }
}