/**Programa: Estructura de repetición FOR y FOREACH
 * Objetivo:
 * Conocer las partes de la estructura FOR:
 *      - Valor inicial
 *      - Condición
 *      - Modificador de la condición (paso o incremento)
 */
public class EstructuraRepeticionFor {
    public static void main(String[] args) {

        
        System.out.println("Ejemplo FOR para repetición");  
        for(int contador=0;contador<10;contador++){             // Usando un FOR para implementar un contador. 
            System.out.println("Contador está en: "+contador);  // Todo lo que ponga dentro de los corchetes {} se repetirá mientras la condición contador<10 sea verdadera
            // ...
            // ...
        }
        


        
        System.out.println("Ejemplo FOR para Arrays");
        int vector [] = {2,5,6,7,-2,3,-9,0,4,-2};
        for(int indice=0;indice<10;indice++){                   // Ejemplo de como usar un FOR para recorrer un vector
            System.out.println("Vector["+ indice +"] = " + vector[indice]);
            // ...
            // ...
        }
        

        
        System.out.println("Ejemplo FOREACH para Arrays");
        int vector2 [] = {2,5,6,7,-2,3,-9,0,4,-2};
        for (int i : vector2) {                                  // Ejemplo de estructura FOREACH para imprimir un vector en consola
            System.out.println(i);
        }
        
        System.out.println("... Fin Programa ...");
    }
    
}
