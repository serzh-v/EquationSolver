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
public class Main {
    public static void main (String[] args){
        Equation equation = null;
        try {
            equation = new Equation(1,2,1);
        }
        catch (InvalidEquationException e) {
            System.out.println("Уравненине не квадратное");
            System.exit(0);
        }
        equation.solve();
        if (equation.getRootsQuantity() == 0){
           System.out.println("Корней нет");
        } 
        else if (equation.getRootsQuantity() == 1){
           System.out.println("Корень 1: " + equation.getX1());
        }
        else {
           System.out.println("Корня 2: " + equation.getX1() + " и " + equation.getX2());
        }
    }
}
