import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal();
        frame.setContentPane(miVentanaPrincipal.getVentanaPrincipal());
        frame.setSize(500, 500);
        frame.setVisible(true);

        /*
        JFrame frame = new JFrame("Hola Mundo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        JButton miBoton1 = new JButton("Mi primer boton");
        JButton miBoton2 = new JButton("Mi segundo boton");
        JButton miBoton3 = new JButton("Mi tercer boton");
        JButton miBoton4 = new JButton("Mi cuarto boton");

        frame.add(miBoton1, BorderLayout.NORTH);
        frame.add(miBoton2, BorderLayout.SOUTH);
        frame.add(miBoton3, BorderLayout.EAST);
        frame.add(miBoton4, BorderLayout.WEST);

        JLabel miLabel = new JLabel("Bienvenido");
        frame.add(miLabel, BorderLayout.CENTER);

        frame.setVisible(true);
         */

    }
}
