/* Programa: Tipos de variables
 * Declaración de variables y atribución de valores
 * Conversión de valores:
 *      Entre datos primitivos
 *      De Strin para datos primitivos
 * El programa solo tiene como objetivo mostrar la forma de declarar diferente tipos de variables y atribuir sus valores.
 * Tambíen se muestra como realizar cambio tipos de datos (typasting y parse)
 */
public class TiposDeDatos {
    public static void main(String[] args){
        int edad;                                   // declarando la variable. Recomendado adicionar un comentario indicando el significado de la variable
        edad = 14;                                  // atribuyendo un valor a la variable. El nombre de la variable debe ser representativa al dato que almacena
        int numeroHijos = 1;                        // declarando variable y atribuyendo valor en la misma línea
        int numero2=34, numero3=67, numero4=189;    // No es frecuente, aunque permitido, declarar varias variables en la misma línea
        
        //float estaturaMetros = 1.83;              // Java indica un error ya que por defecto los números reales son del tipo double
        float estaturaMetros =  (float)1.83;        // Forma correcta para crear variable de tipo floar. Es necesario usar el concepto de typecasting 

        double pi = 3.141516;                       // Declarando y atribuyendo un valor a la variable de tipo double
        
        char unidadMetros = 'm';                    // Variable de tipo char, solo es posible atribuir un caracter 
        char unidadTemperatura = 'C';               // Variable de tipo char, solo es posible atribuir un caracter
        //char varPalabra = "error";                // En la variable tipo char no se pueden atribuir varias letras (cadenas de caracteres)

        String nombre = "Julian Jair Lopez";        // Varible tipo String

        int arrayNotas [];                          // Declarando variable tipo array
        arrayNotas = new int[3];                    // Indicando el tamaño del array

                                                    // Otro ejemplo de typecasting
        double precioExacto = 13500.50;             // Variable de tipo double
        int precioAproximado = (int) precioExacto;  // Realizando typecasting para convertir un valor de tipo doule para tipo int

        // cambiando String para dato primitivo tipo int usando parseInt();
        String datoString;                          // declarando variable String
        datoString = "25";                          // Atribuyendo valor a variable String
        int datoInt = Integer.parseInt(datoString); // Convirtiendo de String para int

        // cambiando String para dato primitivo tipo double usando parseDouble();
        String datoStringReal;                      // declarando variable String
        datoStringReal = "2.32";                    // Atribuyendo valor a variable String
        double datoReal = Double.parseDouble(datoStringReal); // Convirtiendo de String para int
    }
}
