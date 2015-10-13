/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edgar
 */
public class Punto {

    private double x;
    private double y;

    public Punto(double x, double y) {

        this.x = x;
        this.y = y;

    }

    public double getX() {
        return this.x;

    }

    public void setX(int x) {
        this.x = x;

    }

    public double getY() {
        return this.y;

    }

    public void setY(int y) {

        this.y = y;

    }

    public double distancia(Punto p) {

        double dx = p.getX() - this.x; // o double dx = this.x - p.getX()
        double dy = p.getY() - this.y; // o double dy = this.y - p.getY()
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

    public void desplazar(double dx, double dy) {

        this.x = this.x + dx;
        this.y = this.y + dy;

        //    o    public void desplazar(int x, int y) {
//
//        this.x = this.x + x;
//        this.y = this.y + y;
    }

    @Override
    public String toString() {
        return "Punto{" + "x=" + x + ", y=" + y + '}';
    }
}
//
//  
//    }
// distancia, modulo

