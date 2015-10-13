/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edgar
 */
public class Rectangulo extends Cuadrado {
   
   private double altura; // solo altura porque hereda la base de cuadrado
    
    
    
    public Rectangulo(Punto origen, double ancho, double altura){
        
        super(origen, ancho); //clase padre de la que hereda
        this.altura = altura;
        
    }
    
    public double getAltura(){
        return this.altura;
        
    }
    
    public void setAltura(double altura) {
        this.altura = altura;

    }
    
    public double perimetro(){
        
        return (this.ancho * 2) + (this.altura * 2);
        
    }
    
    public double area(){
        return this.ancho * this.altura;
    }
     
    public void escalar(double n){
        
        super.escalar(n);
        this.altura = this.altura * n;
    }
    
    public String toString() {
        return "Rectangulo{"+ super.toString() + "base=" + this.ancho + " altura" + this.altura +'}';
    }
}
