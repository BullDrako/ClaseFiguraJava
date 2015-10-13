/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edgar
 */
public class Cuadrado extends Figura {
    
    protected double ancho;
    
    public Cuadrado(Punto origen, double ancho){
        super(origen); //clase padre de la que hereda
        this.ancho = ancho;
        
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
        
    
    public double perimetro(){
        
        return this.ancho * 4;
        
    }
    
    public double area(){
        return this.ancho * this.ancho;
    }
    
    public void escalar(double n){
        
        this.ancho = this.ancho * n;
    }
    
    public String toString() {
        return "Cuadrado{" + super.toString() + "ancho=" + ancho +'}';
    }
}
