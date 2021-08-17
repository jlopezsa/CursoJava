/**Programa: Ejemplo de casting implicito de parámetros y casting implicito de retorno
 * 
 */
public class EnsayosS7 {
    public static void main(String[] args) {

        int numero1 = 7;
        int numero2 = 10;
        double resultado;
        double resultado2;

        resultado = division(numero1,numero2);
        System.out.println(resultado);

        resultado2 = divisionCastin(numero1, numero2);
        System.out.println(resultado2);


    }
    
    public static double division(double num, double den){
        return num/den;
    }

    public static float divisionCastin(float num, float den){
        return num/den;
    }

}
