import java.util.*;

public class EjemplosScanner {
    public static void main(String[] args){
        System.out.println("\t 1");
        Scanner entradaConsola = new Scanner(System.in);
        System.out.println("\t 2");
        System.out.print("Ingrese clave: ");
        System.out.println("\t 3" + entradaConsola.hasNext() + "\r ");
        System.out.println("\t 4");
        while(entradaConsola.hasNext()){
            System.out.print("\r");
        }
        entradaConsola.nextLine();

        entradaConsola.close();
    }
    
}
