/**Programa: Ejemplo de casting implicito de parámetros y casting implicito de retorno
 * 
 */
public class CastingImplicito {
    public static void main(String[] args) {

        int numero1 = 7;
        int numero2 = 10;
        double resultado;
        double resultado2;

        resultado = division(numero1,numero2);                  // Enviando parámetros de tipo INT.
        System.out.println(resultado);

        resultado2 = divisionCastin(numero1, numero2);          // El retorno es almacenado en una variable de tipo DOUBLE. Aqui ocurre un casting porque DOUBLE es de mayor capacidad que FLOAT
        System.out.println(resultado2);         


    }
    
    public static double division(double num, double den){      // Recepción de parametros DOUBLE. Esto es permitido porque DOUBLE es de mayor capacidad que INT
        return num/den;                                         // Retorna un dato tipo DOUBLE
    }

    public static float divisionCastin(float num, float den){   // Función con casting implicito de retorno 
        return num/den;                                         // Retorna una función tipo FLOAT
    }

}
