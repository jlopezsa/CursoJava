/* Programa: Tipos de variables
 * Declaración de variables y atribución de valores
 */
public class TiposDeDatos {
    public static void main(String[] args){
        int edad;                                   // declarando la variable. Recomendado adicionar un comentario indicando el significado de la variable
        edad = 14;                                  // atribuyendo un valor a la variable. El nombre de la variable debe ser representativa al dato que almacena
        int numeroHijos = 1;                        // declarando variable y atribuyendo valor en la misma línea
        int numero2=34, numero3=67, numero4=189;    // No es frecuente, aunque permitido, declarar varias variables en la misma línea
        
        //float estaturaMetros = 1.83;              // Java indica un error ya que por defecto los números reales son del tipo double
        float estaturaMetros = (float) 1.83;        // Forma correcta para crear variable de tipo floar. Es necesario usar el concepto de typecasting 

        double pi = 3.141516;                       // Declarando y atribuyendo un valor a la variable de tipo double
        
        char unidadMetros = 'm';                    // Variable de tipo char, solo es posible atribuir un caracter 
        char unidadTemperatura = 'C';               // Variable de tipo char, solo es posible atribuir un caracter
        //char varPalabra = "error";                // En la variable tipo char no se pueden atribuir varias letras (cadenas de caracteres)

        String nombre = "Julian Jair Lopez";        // Varible tipo String

                                                    // Otro ejemplo de typecasting
        double precioExacto = 13500.50;             // Variable de tipo double
        int precioAproximado = (int) precioExacto;  // Realizando typecasting para convertir un valor de tipo doule para tipo int
    }
}
