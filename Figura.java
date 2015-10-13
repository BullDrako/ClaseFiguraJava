/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edgar
 */
abstract class Figura {

    protected Punto origen;
    private static double numFiguras;
    

    public Figura(Punto origen) {

        this.origen = origen;
        Figura.numFiguras++;

    }

    public Punto getOrigen() {
        return origen;
    }

    public void setOrigen(Punto origen) {
        this.origen = origen;
    }

    public void desplazar(double dx, double dy) {

        this.origen.desplazar(dx, dy);
    }
       
    public String toString() {
        return "origen = " + this.origen.toString();
    }
    
    public static double numFiguras(){
    
        return Figura.numFiguras;
    
}
    
    public double distancia(Figura f){
        
        return this.origen.distancia(f.getOrigen());
        
    }
    
    public abstract double area();

    public abstract double perimetro();

    public abstract void escalar(double n);

}
