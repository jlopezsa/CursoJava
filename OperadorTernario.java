/**Programa: Ejemplo de como usar el operador ternario  x = (condicion)?valor1:valor2 
 * Objetivos:
 * 1- El usuario ingresa un número entero. Si el número es menor que 10 Y menor que 20, se imprime en consola el número 2. Si no, se imprime 4
*/
import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args){
        Scanner datoConsola = new Scanner(System.in);
        int numeroUsuario;
        numeroUsuario = datoConsola.nextInt();
        
        int valorFinal; 
                                                                
                                                                    // Operador ternario
        valorFinal = (numeroUsuario<10 && numeroUsuario<20)?2:4;    // Si numeroUsuario<10 es verdadero Y numeroUsuario<20 es verdadero, entonces valor final es 2. Si no, entonces es 4 
        System.out.println("Valor final: " + valorFinal);           // Imprime el resultado de la variable "valorFinal"

        datoConsola.close();
    }
}