/**Programa: Ejemplo de como crear un función e invocarla
 * Objetivos:
 * 1 - Aprender a construir una función y sus partes
 * 2 - Dominar los tipos de funciones. 
 *      - Las que no tienen retorno ni parametros de entrada            (ejemplo: menuOpciones())
 *      - Las que tienen retorno y parametros de entrada                (ejemplo: sumaNumeros(double opA, double opB))
 *      - Las que no tienen retorno pero tienen parametros de entrada   (ejemplo: valorMedioNumeros(double opA, double opB))
 */
public class FuncionesTiposDeFunciones {
    public static void main(String[] args) {

        menuOpciones();                                     //Invocando la función menuOpciones(). Es una función sin valor de retorno y no recibe arumentos (parámetros de entrada)

        double operador1 = 9.78;                            // Declaración de variables y atribución de un valor.
        double operador2 = 11.23;                           // Declaración de variables y atribución de un valor.
        double resultadoSuma;                               // Declaración de variable que recibirá el resultado de una función

        resultadoSuma = sumaNumeros(operador1,operador2);   // Dos pasos son ejecutados: 
                                                            // 1) se invoca la función sumaNumeros y se envian los arumentos (parámetros de entrada), y 
                                                            // 2) el valor de retorno de sumaNumeros se atribuye a la variable resultadoSuma
        System.out.println("\nLa suma entre " + operador1 +" y "+operador2+" es "+ resultadoSuma); // Simplemente se imprimen un mensaje con las variables

        valorMedioNumeros(operador1,operador2);             // Invocación de la función valorMedioNumeros(). Se envian los parámetros a la función.
                                                            // La función valorMedioNumeros() no retorna ningun valor.

        System.out.println("... Fin programa ...");
        
    }

    // Firma de la función. Función SIN retorno y SIN parametros. 
    public static void menuOpciones(){  
        // Esta función tiene como objetivo imprimir un mensaje en consola.
        // NOTA: el tipo de retorno es VOID porque no se retorna ningun valor.
        //
        System.out.println("Bienvenido al menu de opciones (operacion entre dos numeros: 9.78 y 11.23)");
        System.out.println("1 - Suma de dos numeros");
        System.out.println("2 - Valor medio de dos números");
    }

    // Firma de la función. Función CON retorno y CON parametros.
    public static double sumaNumeros(double opA, double opB){
        // Esta función tiene como objetivo sumar dos números.
        // NOTA: el tipo de retorno es DOUBLE porque se retorna una variable DOUBLE.
        //
        double resultado;
        resultado = opA + opB;
        return resultado;
    }

    // Firma de la función. Función SIN retorno y CON parametros.
    public static void valorMedioNumeros(double opA, double opB){
        // Esta función tiene como objetivo calcular el valor médio entre dos números.
        // NOTA: el tipo de retorno es VOID porque no se retorna ningun valor. El resultado se imprime en consola dentro de esta misma función
        //
        double valorMedio;
        valorMedio = (opA+opB)/2;
        System.out.println("El valor medio entre " + opA +" y "+opB+" es "+valorMedio);
    }
}
