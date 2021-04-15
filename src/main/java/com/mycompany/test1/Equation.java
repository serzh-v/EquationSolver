/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test1;

/**
 *
 * @author Dell
 */
public class Equation {
    private double a, b, c;
    private Discriminant D;
    private double x1;
    private double x2;
    private int rootsQuantity;
    
    /**
     * внутренний класс, есть неявная связь между объектом внутреннего класса
     * и объектом хозяина
     */
    private class Discriminant {
        private double d = b * b - 4 * a * c;
        
        public double getD() {
            return d;
        }
    }
    
    public Equation (double a, double b, double c) throws InvalidEquationException {
        if (a == 0) throw new InvalidEquationException();
        this.a = a;
        this.b = b;
        this.c = c;
        this.D = this.new Discriminant();
    }
    
    /**
     * метод, присваивающий ранее созданным полям значения равные
     * количеству корней уравнения и значения самих корней
     */
    public void solve(){
        if (D.getD() < 0.0) {
            rootsQuantity = 0;
        }
        else if (D.getD() == 0.0){
            rootsQuantity = 1;
            x1 = -b / (2 * a); 
        }
        else {
            rootsQuantity = 2;
            x1 = (-b - Math.sqrt(D.getD())) / (2 * a);
            x2 = (-b + Math.sqrt(D.getD())) / (2 * a);
        }
    }
    
    /**
     * далее описываются методы, возвращаюшие значения полей   
     */
    public int getRootsQuantity(){
        return rootsQuantity;
    }
    
    public double getX1(){
        return x1;
    }
    
    public double getX2(){
        return x2;
    }
    
}
