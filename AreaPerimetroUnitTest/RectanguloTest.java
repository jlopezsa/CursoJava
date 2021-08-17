package AreaPerimetroUnitTest;

import jdk.jfr.Timestamp;

public class RectanguloTest {
    private Rectangulo rectangulo;

    public void testRectanguloCalculaPerimetro(){
        rectangulo = new Rectangulo();
        double resultadoEsperado = 10;
        rectangulo.setBase(2);
        rectangulo.setAltura(3);

        double resultado = rectangulo.calculaPerimetro();

        if(resultado == resultadoEsperado)
            System.out.println("OK test");
        else
            System.out.println("Failure test");
    }

    
}
