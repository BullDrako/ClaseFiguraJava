/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edgar
 */
public class Circulo extends Figura {

    private double radio;

    public Circulo(Punto origen, double radio) {
        super(origen); //clase padre de la que hereda
        this.radio = radio;

    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
       
        return Math.PI * Math.pow(this.radio,2);
    
    }

    @Override
    public double perimetro() {
       
        return 2 * Math.PI * this.radio;
    
    }

    @Override
    public void escalar(double n) {
     
        this.radio = this.radio * n;
        
    }

    @Override
    public String toString() {
        return "Circulo{" + super.toString() + ", radio=" + this.radio + '}';
    }

    

    

}
