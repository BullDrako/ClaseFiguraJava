/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edgar
 */
public class ClaseFigura {

    public static void main(String[] args) {
        Punto origen;

        origen = ClaseFigura.testPunto();
        ClaseFigura.testCirculo(origen);
        ClaseFigura.testCuadrado(origen);
        ClaseFigura.testRectangulo(origen);
        ClaseFigura.testTriangulo(origen);

    }

    public static  Punto testPunto() {
        Punto p1 = new Punto(3, 1);

        System.out.println(p1);
        p1.desplazar(4, 0);
        System.out.println(p1);
        
         System.out.println("Punto String"+p1.toString());

        return p1;
    }

    public static void testCirculo(Punto origen) {
        Circulo c = new Circulo(origen, 3);
        Circulo c1 = new Circulo(origen, 4);

        System.out.println(c1);//imprime circulo
        
        System.out.println("Circulo Perimetro "+c1.perimetro());
        System.out.println("Circulo Area "+c1.area());
//        System.out.println("Circulo Escalar"+c1.escalar());
        System.out.println("Circulo String "+c1.toString());
        
        System.out.println("Hay " + Figura.numFiguras() + " figuras.");  //imprime 2.0 porque hay 2 figuras y porque es double,
        //si fuese int imprimiria 2 sin el 0.
    }

    public static void testCuadrado(Punto origen) {

        Cuadrado cuad1 = new Cuadrado(origen, 2);
       

        System.out.println(cuad1); //imprime cuadrado
        System.out.println("Cuadrado Perimetro "+cuad1.perimetro());
        System.out.println("Cuadrado Area "+cuad1.area());
//      System.out.println("Cuadrado Escalar "+cuad1.escalar(n));
        System.out.println("Cuadrado String "+cuad1);

    }

    public static void testRectangulo(Punto origen) {

        Rectangulo r1 = new Rectangulo(origen, 6, 4);

        System.out.println(r1); //imprime Rectangulo
        System.out.println("Rectangulo Perimetro "+r1.perimetro());
        System.out.println("Rectangulo Area "+r1.area());
//      System.out.println("Rectangulo Escalar "+r1.escalar(n));
        System.out.println("Rectangulo String "+r1.toString());
    }
    
    public static void testTriangulo(Punto origen) {
        
        Triangulo t1 = new Triangulo (origen, 2 , 3);
        
        System.out.println(t1); //imprime Triangulo
        System.out.println("Triangulo Perimetro "+t1.perimetro());
        System.out.println("Triangulo Area "+t1.area());
//        System.out.println("triangulo Area "+t1.escalar(n));
        System.out.println("Triangulo String "+t1.toString());
    }
}
