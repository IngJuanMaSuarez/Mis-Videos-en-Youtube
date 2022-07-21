import javax.swing.*;
import java.awt.event.*;

public class VentanaSecundaria extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JButton btnAtaqueMiPokemon;
    private JButton btnAtaqueOtroPokemon;
    private JLabel lblVidaRestanteMiPokemon;
    private JLabel lblVidaRestanteOtroPokemon;

    public VentanaSecundaria() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        Pokemon miPokemon = new Pokemon(10, 100);
        Pokemon otroPokemon = new Pokemon(10, 100);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        btnAtaqueMiPokemon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                miPokemon.atacar(otroPokemon);
                lblVidaRestanteOtroPokemon.setText(String.valueOf(otroPokemon.getVida()));
                if (miPokemon.getVida() <= 0) {
                    JOptionPane.showMessageDialog(null, "PERDISTE");
                }
            }
        });
        btnAtaqueOtroPokemon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                otroPokemon.atacar(miPokemon);
                lblVidaRestanteMiPokemon.setText(String.valueOf(miPokemon.getVida()));
                if (otroPokemon.getVida() <= 0) {
                    JOptionPane.showMessageDialog(null, "GANASTE");
                }
            }
        });
    }

    private void onOK() {
        // add your code here
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }
}
