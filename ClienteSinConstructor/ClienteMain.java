/**Programa: Clase sin constructores */

package ClienteSinConstructor;

public class ClienteMain {
    public static void main(String[] args) {
        
        Cliente persona = new Cliente();

        // Imprimiendo para saber cuales son los valores por defecto
        System.out.println("La persona " + persona.getNombre() +
                        " de edad "+ persona.getEdad() + " anhos, " +
                        "es mayor de edad? " + persona.isMayorEdad());

        // Creando un nuevo objeto de tipo Cliente
        Cliente personaNueva = new Cliente();
        personaNueva.setNombre("Mario");    // Enviando nuevo valor al atrubuto nombre
        personaNueva.setEdad(19);           // Enviando nuevo valor al atrubuto edad
        personaNueva.consultaMayor();       // invocando el método consultaMayor para calcular si la persona es mayor de edad
        System.out.println("La persona " + personaNueva.getNombre() +                           // imprimiendo mensaje en consola
                                        " de edad "+ personaNueva.getEdad() + " anhos, " +
                                        "es mayor de edad? " + personaNueva.isMayorEdad());
    }
    
}
