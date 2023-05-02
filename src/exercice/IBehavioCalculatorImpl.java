/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice;

public class IBehavioCalculatorImpl implements IBehavioCalculator {

    @Override
    public void showResultSum(double firt_number, double second_number) {
        
        IcalculatorImpl calculatrice = new IcalculatorImpl();
        System.out.println("la somme de "+firt_number+" et "+second_number+" ="+calculatrice.Sum(firt_number, second_number));
    }

    @Override
    public void showResultSubstract(double firt_number, double second_number) {
        IcalculatorImpl calculatrice = new IcalculatorImpl();
        System.out.println("la différance de "+firt_number+" et "+second_number+" ="+calculatrice.Substract(firt_number, second_number));
    }

    @Override
    public void showResultMultiplication(double firt_number, double second_number) {
        IcalculatorImpl calculatrice = new IcalculatorImpl();
        System.out.println("Le produit de "+firt_number+" et "+second_number+" ="+calculatrice.Multiplication(firt_number, second_number));
    }

    @Override
    public void showResultDivide(double firt_number, double second_number) {
        IcalculatorImpl calculatrice = new IcalculatorImpl();
        System.out.println("le quotient de "+firt_number+" et "+second_number+" ="+calculatrice.Divide(firt_number, second_number));
    }

    @Override
    public Calculator prepareCalculator(double firt_number, double second_number) {
        System.out.println("Erreur lors de l'opérateur arithmetique!!!");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
