/**Clase: Rectangulo
 */
package AreaPerimetro;

public class Rectangulo {                                       // Nombre de la clase
    //----- Atributos
    private double base;                                        // Atributos privados de tipo double
    private double altura;
    
    //----- Metodos
    public void setBase(double base){                           // Método tipo SET utilizado para atribuir valores al atributo base
        if(base>0 && base<20)                                   // Lógica para aceptar únicamente valores reales de 0 a 20, como fué solicitado en los requisitos del problema
            this.base = base;                                   // Se utiliza la palabra THIS yá que el argumento recibido base tiene el mismo nombre del atributo base
        else
            System.out.println("Base fuera del rango (0,20)");
    }

    public double getBase(){                                    // Metodo tipo GET utilizado para capturar, visualizar, el valor del atributo base desde el método main()
        return base;                                            // Retorna el atributo
    }

    public void setAltura(double altura){                       // Método tipo SET utilizado para atribuir valores al atributo altura
        if(altura>0 && altura < 20)
            this.altura = altura;
        else
            System.out.println("Altura fuera del rango (0,20)");
    }

    public double getAltura(){                                  // Metodo tipo GET utilizado para capturar, visualizar, el valor del atributo altura desde el método main()
        return altura;
    }

    public double calculaPerimetro(){                           // Método que calcula el perímetro del rectánulo
        if((altura>0 && altura < 20) && (base>0 && base<20))    // Lógica utilizada para calcular el perímetro si los valores de base y altura son permitidos
            return 2*(base + altura);
        else
            return 0;
    }
    public double calculaArea(){                                // Método utilizado para calcular la área
        return base * altura;
    }
}
