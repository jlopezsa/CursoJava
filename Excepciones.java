/** Prorama para excepciones
 * Aprender a usar la estructura try/catch/finally
 */

import java.util.Scanner;                       // importando el paquete de la clase Scanner
public class Excepciones {
    public static void main(String[] args) {
        Scanner entradaUsuario = new Scanner(System.in);
        int denominador;
        int numerador;
        double resultado;
        System.out.println("División entre dos números");
        System.out.print("Ingrese numerador: ");
        numerador = entradaUsuario.nextInt();
        System.out.print("Ingrese denominador: ");
        denominador = entradaUsuario.nextInt();
        try{
            resultado = (double)numerador/denominador;    
        }catch(ArithmeticException excepcion){
            System.out.println("ERROR: division " + excepcion.getMessage());    // enviamos el mensaje de error
            resultado = 0;
        }finally{
            //System.out.println("resultado es: " + resultado);
        }
        System.out.println("El resultado de la division es: " + resultado);
        entradaUsuario.nextLine();  // Limpiamos Buffer de teclado
        System.out.print("Digite cualquier tecla para finalizar:");
        entradaUsuario.nextLine();
    }
}
