import javax.swing.JOptionPane;
import java.sql.Array;

public class Fundamentos {
    public static void main(String[] args) {

        int edad = 15;
        boolean mayorEdad = false;
        double temperatura = 12.5;
        String mensaje = "Hola Java";
        float temperatura2 = 45.5F;
        long temperatura3 = 121234L;

        System.out.println("La edad es " + edad);
        System.out.println("La persona es mayor de edad: " + mayorEdad);
        System.out.println("La temperatura es " + temperatura);
        System.out.println(mensaje);

        //edad = 20;
        //System.out.println("La edad es " + edad);

        //edad++;
        //System.out.println("La edad es " + edad);

        //Condicional IF, ELSE IF y ELSE
        if (edad <= 13){
            System.out.println("La persona es un niño");
        }
        else if (edad <= 25){
            System.out.println("La persona es adolescente");
        }
        else if (edad <= 60){
            System.out.println("La persona es un adulto");
        }
        else{
            System.out.println("La persona es un adulto mayor");
        }

        //Condicional Switch
        String opcion = "5";
        //String seleccion = JOptionPane.showInputDialog("Introduce la opcion deseada");

        switch (opcion){
            case "1":
                System.out.println("1. Ingresar a la plataforma");
                break;
            case "2":
                System.out.println("2. Añadir un nuevo usuario");
                break;
            case "3":
                System.out.println("3. Salir");
                break;
            default:
                System.out.println("Ingrese una opcion valida");
                break;
        }

        String [] clientes = new String[5];

        clientes[0] = "Cristina";
        clientes[1] = "Martin";
        clientes[2] = "Anabel";
        clientes[3] = "Julian";
        clientes[4] = "Ismael";

        for (int i = 0; i < 5; i++){
            System.out.println(clientes[i]);
        }

        for (String cliente: clientes){
            System.out.println(cliente);
        }

        System.out.println("*******************************");
        String nombreBusqueda = "Cristina";

        for (int i = 0; i < 5; i++){
            if (nombreBusqueda == clientes[i]){
                System.out.println("Usuario " + nombreBusqueda + " encontrado");
            }
        }

        int numero = 20;
        int contador = 15;

        System.out.println("WHILE *************************");
        while (contador < numero){
            System.out.println(contador);
            contador++;
        }

        System.out.println("DO WHILE *************************");
        int numero2 = 20;
        int contador2 = 50;

        do {
            System.out.println(contador2);
            contador2++;
        } while (contador2 < numero2);

        int [][][] cubo = new int[3][2][3];
        contador = 1;

        for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo[0].length; j++) {
                for (int k = 0; k < cubo[0][0].length; k++) {
                    cubo[i][j][k] = contador;
                    contador++;
                    System.out.println(cubo[i][j][k]);
                }
            }
        }

        System.out.println("********************");
        System.out.println(cubo[1][1][1]);

        System.out.println("********************");
    }
}
