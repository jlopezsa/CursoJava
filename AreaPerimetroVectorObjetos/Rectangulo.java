/**Clase: Rectangulo
 * Ejemplo de clase utilizando constructores.
 * En el folder AreaRectanulo están los comentários de los métodos.
 * En este archivo están solo los comentários relacionados al constructor.
 */

package AreaPerimetroVectorObjetos;

public class Rectangulo {
    //----- Atributos
    private double base;
    private double altura;
    
    //----- Metodos
    public Rectangulo(double base, double altura){              // Método Constructor, es inicializado tan pronto el objeto es creado. 
                                                                // En este constructor se están inicializando los atributos de la clase.
                                                                // Cuando el objeto es creado desde el main() se deben enviar los arumentos. // (ver método main() en el archivo AreaPerimetroMain.java)  
        this.base = base;
        this.altura = altura;
        //System.out.println("Objeto creado");
    }


    public void setBase(double base){
        if(base>0 && base<20)
            this.base = base;
        else
            System.out.println("Base fuera del rango (0,20)");
    }

    public double getBase(){
        return base;
    }

    public void setAltura(double altura){
        if(altura>0 && altura < 20)
            this.altura = altura;
        else
            System.out.println("Altura fuera del rango (0,20)");
    }

    public double getAltura(){
        return altura;
    }

    public double calculaPerimetro(){
        if((altura>0 && altura < 20) && (base>0 && base<20))
            return 2*(base + altura);
        else
            return 0;
    }
    public double calculaArea(){
        return base * altura;
    }
}
