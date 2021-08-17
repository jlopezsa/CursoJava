import java.util.Scanner;

public class MetodosEstructura {
    public static void main(String[] args) {
        
        Scanner datoConsola = new Scanner(System.in);
        double datoUsuario1;
        double datoUsuario2; 
        double resultado;

        System.out.print("Digite el primer operador: ");
        datoUsuario1 = datoConsola.nextDouble();
        System.out.print("Digite el segundo operador: ");
        datoUsuario2 = datoConsola.nextDouble();

        resultado = sumaDosElementos(datoUsuario1,datoUsuario2); // hola como especial del libro
     

        System.out.print("La suma de los dos elementos es: " + resultado);
        datoConsola.close();
    }

    public static double sumaDosElementos(double operador1, double operador2){
        double resultado;
        resultado = operador1 + operador2;
        return resultado;
    } 
}