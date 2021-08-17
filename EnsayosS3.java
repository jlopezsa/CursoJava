import java.util.Scanner;

import javax.swing.JOptionPane;


public class EnsayosS3 {
    public static void main(String[] args){
        
        /*Scanner entrada = new Scanner(System.in);
        String textoUsuario;
        int anhoActual;

        System.out.print("Digite su nombre: ");
        textoUsuario = entrada.nextLine();
        System.out.println("Su nombre es: " + textoUsuario);

        System.out.print("Ingrese anho actual: ");
        anhoActual = entrada.nextInt();
        System.out.println("El anho actual es: " + anhoActual );
        System.out.println("En dos anho mas sera: " + (2+anhoActual));

        entrada.close();*/

        //------------------------------------------------------------
        String mensaje = "Ingrese un numero";
        String datoVentana;
        int datoInt;

        datoVentana = JOptionPane.showInputDialog(null, mensaje);
        System.out.println("El dato ingresado es: " + datoVentana);

        datoInt = Integer.parseInt(datoVentana);

        System.out.println("El doble de su dato es: " + 2*datoInt);

    }
}
