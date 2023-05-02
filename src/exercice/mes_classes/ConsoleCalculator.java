/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice.mes_classes;

import exercice.Calculator;
import exercice.IBehavioCalculatorImpl;
import exercice.IcalculatorImpl;
import java.util.Scanner;

/**
 *
 * @author fullstack
 */
public class ConsoleCalculator {
    public void ConsoleCalculator(){
        
//       this.affichage();
        
    }
    
    public void affichage(){
        Scanner sc = new Scanner(System.in);
        Arithmetique signe = new Arithmetique();
        IBehavioCalculatorImpl calculatrice = new IBehavioCalculatorImpl();
        double nbr1;
        double nbr2;
        double res;
        String operation = "";

        System.out.print("Saisissez le premier nombre:");
        nbr1 = sc.nextDouble();

        System.out.print("Saisissez le second nombre:");
        nbr2 = sc.nextDouble();

        System.out.print("Saisissez l'opérateur:");
        
        sc.nextLine();
        operation = sc.nextLine(); 
        
        signe.setSigne(operation);
        
        System.out.println("Opération  "+signe.getSigne());

        if ("+".equals(signe.getSigne().toString())) {
            calculatrice.showResultSum(nbr1, nbr2);

        } else if ("-".equals(signe.getSigne().toString())) {

            calculatrice.showResultSubstract(nbr1, nbr2);
        } else if ("*".equals(signe.getSigne().toString())) {

            calculatrice.showResultMultiplication(nbr1, nbr2);
        } else if ("/".equals(signe.getSigne().toString())) {

            calculatrice.showResultDivide(nbr1, nbr2);
        } else {
            System.out.println("Erreur de signe d'opération");
        }
    }
}
