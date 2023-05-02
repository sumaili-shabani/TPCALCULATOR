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
public interface IBehavioCalculator{
    
    public  void showResultSum(double firt_number, double second_number);
    
    public  void showResultSubstract(double firt_number, double second_number);
    
    public  void showResultMultiplication(double firt_number, double second_number);
    public  void showResultDivide(double firt_number, double second_number);
    
    public  Calculator  prepareCalculator(double firt_number, double second_number);  
    
    
}
