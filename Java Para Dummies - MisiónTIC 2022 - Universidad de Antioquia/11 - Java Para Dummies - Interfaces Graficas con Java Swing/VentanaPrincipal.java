import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal {
    private JPanel ventanaPrincipal;
    private JButton buttonVentanaEmergente;
    private JTextField nombreUsuarioTextField;
    private JButton bienvenidaUsuarioButton;
    private JLabel mensajeBienvenidaUsuarioLabel;
    private JTextField txtUsuario;
    private JPasswordField txtPassword;
    private JButton btnIngresar;
    private JCheckBox chkVerPassword;

    public VentanaPrincipal() {
        buttonVentanaEmergente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hola Mundo");
            }
        });
        bienvenidaUsuarioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombreusuario = nombreUsuarioTextField.getText();
                String mensajeBienvenida = "Bienvenido " + nombreusuario + "! :)";
                mensajeBienvenidaUsuarioLabel.setText(mensajeBienvenida);
            }
        });
        btnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = txtUsuario.getText();
                String password = String.valueOf(txtPassword.getPassword());
                 if (usuario.equals("JuanMa") && password.equals("123")){
                     JOptionPane.showMessageDialog(null, "Usuario autenticado");
                     VentanaSecundaria dialog = new VentanaSecundaria();
                     dialog.setSize(500, 500);
                     dialog.setVisible(true);
                 } else {
                     JOptionPane.showMessageDialog(null, "Error en usuario y clave");
                 }
            }
        });
        chkVerPassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (chkVerPassword.isSelected()){
                    txtPassword.setEchoChar((char) 0);
                } else {
                    txtPassword.setEchoChar('*');
                }
            }
        });
    }

    public JPanel getVentanaPrincipal() {
        return ventanaPrincipal;
    }

}
