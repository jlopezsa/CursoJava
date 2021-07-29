/** Programa: Ejemplo de funciones Caja Negr:
 * 1- Paquete Math
 * 2- Paquete Arrays
*/
import java.util.Arrays;

public class FuncionesCajaNegra {
    public static void main(String[] args) {
        
        
        double potencia;
        potencia = Math.pow(2,4);                       // Finción caja negra del paquete Math
        System.out.println(potencia);

        int valorMaximo = Math.max(56 , 103);           // Finción caja negra del paquete Math
        System.out.println(valorMaximo);
        

        //---------------------------------------------
        
        double vector [] = {3.6, 8.9, 7.2, 1.2, -2.8, 0};
        for(int indice=0;indice<vector.length;indice++){
            System.out.print(vector[indice] + "  ");
        }
        System.out.println("\n");

        System.out.println(Arrays.toString(vector));    // Finción caja negra del paquete Arrays
        Arrays.sort(vector);
        System.out.println(Arrays.toString(vector));

        char vectorLetras [] = {'f', 'e', 'y', 'z'};
        System.out.println(Arrays.toString(vectorLetras));

        System.out.println(Arrays.binarySearch(vectorLetras, 'e'));

    }
    
}
