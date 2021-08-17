import java.util.ArrayList;
import java.util.Scanner;
public class Listas {
    public static void main(String[] args) {
        Scanner datoConsola = new Scanner(System.in);
        ArrayList<Integer> lista_enteros = new ArrayList<Integer>();

        int numero;
        String salida;
        do{
        System.out.print("Ingrese numero: ");
        numero = datoConsola.nextInt();
        datoConsola.nextLine();                 // utilizado para limpiar buffer
        lista_enteros.add(numero);
        System.out.print("Desea continuar (s/n):");
        salida = datoConsola.nextLine();
        }while(salida.equals("s"));

        System.out.println(lista_enteros.toString());
        

        datoConsola.close();
    }
}
