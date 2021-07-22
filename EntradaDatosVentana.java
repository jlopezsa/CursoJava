import javax.swing.*;

public class EntradaDatosVentana {
    public static void main(String[] args){
        String mensaje = "Ingrese un número";   
        String strUsuario;                                          // Creando variable para almazenar los datos del usuário                                         
        strUsuario = JOptionPane.showInputDialog(null,mensaje);     // Metodo que: 1) imprime el mensaje en la ventana, y 2) almazena el dato del usuario en strUsuario 
        System.out.println("El dato ingresado es " + strUsuario);   // Imprime en la consola lo que ingresó el usuario.
    }
}