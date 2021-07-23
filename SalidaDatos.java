/**Programa: Salida de datos por consola
 * Son mostrados en consola varios mensajes de texto.
 * Tambien se presenta formas de editar los mensajes usando "secuencias de escape"
 * Y se pasan variables para imprimirlas en consola
 */
public class SalidaDatos {
    public static void main(String[] args) {
        int anho = 2021;                // Declaración de variable int y atribucion de valor Entero.
        float notaAprovar = 2.999f;     // Declaración de variable float y atribucion de valor Real. La letra f es adicionada al final del número para indicar que es un numero real tipo float
        double numeroEuler = 2.718281;  // Declaración de variable double y atribucion de valor Real.
        String mensaje = "aproximadamente";
        
        System.out.println("Bienvenidos tripulantes al Ciclo-2");   // ejemplo de como imprimir mensaje de texto en la consola.
        System.out.println("del programa MisioTIC-2022");           

        System.out.print("El lenguaje de proramacion presentado es JAVA.\nTambien seran vistos los temas de \"SQL\" y \"MVC\" \n"); // Ejemplo de como usar secuencias de escape \n y \"

        System.out.println("En el "+ anho + " seran realizados Retos para evaluar.\nLa nota aprovatoria es de " + notaAprovar + " " + mensaje ); // Ejemplo de como enviar datos almazenados en variables a la consola de comandos
        System.out.println("Ejemplo de como imprimir en consola un valor double: " + numeroEuler);

    }
}
