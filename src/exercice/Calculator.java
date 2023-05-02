/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice;

/**
 *
 * @author fullstack
 */
public class Calculator {
    
    double firtNumber;
    double secondNumber;
    
    Calculator(){
        System.out.println("je suis le constructeur!!!");
    }
    public Calculator(double firt_number, double second_number){
        this.firtNumber = firt_number;
        this.secondNumber = second_number;
    }

    
    //accesseurs
    public double getfirtNumber(){
        return this.firtNumber;
    }
    
    public double getsecondNumber(){
        return this.secondNumber;
    }
    
    //mutateurs
    public void setfirtNumber(double firt_number){
        this.firtNumber = firt_number;
    }
    
    public void setsecondNumber(double second_number){
        this.secondNumber = second_number;
    }
    
    
    
}
