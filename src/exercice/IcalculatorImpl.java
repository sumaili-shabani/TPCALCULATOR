/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice;


public class IcalculatorImpl implements Icalculator {

    @Override
    public double Sum(double firt_number, double second_number) {
        return  firt_number + second_number;
    }

    @Override
    public double Substract(double firt_number, double second_number) {
         return  firt_number - second_number; 
    }

    @Override
    public double Multiplication(double firt_number, double second_number) {
         return  firt_number * second_number;
    }

    @Override
    public double Divide(double firt_number, double second_number) {
         return  firt_number / second_number;
    }
    
}
