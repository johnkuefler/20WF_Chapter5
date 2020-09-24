
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnk
 */
public class DrywallEstimator {
    public static void main(String[] args) {
        
        // get length and width from the user
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a length and a width of structure");
        double length = keyboard.nextDouble();
        double width = keyboard.nextDouble();
        
        // calculate sq footage (length * width)
        double squareFootage = calculateSqFootage(length, width);
        
        // calculate drywall cost for sq footage
        double drywallCost = calculateDrywallCost(squareFootage);
        
        // calculate tax for the drywall cost
        double totalWithTax = calculateCostWithTax(drywallCost);
        
        // display total cost to user
        System.out.println("The total cost with tax is: " + totalWithTax);
    }
    
    public static double calculateSqFootage(double length, double width) {
        return length * width;
    }
    
    public static double calculateDrywallCost(double sqFootage) {
        // since drywall is $16 for 48 sq foot, we know it is $0.33 for 1 sq foot.
        
        final double DRYWALL_COST_PER_SQ_FOOT = 0.33;
        
        return DRYWALL_COST_PER_SQ_FOOT * sqFootage;
    }
    
    public static double calculateCostWithTax(double cost) {
        final double TAX_RATE = 0.095;
        
        return cost + (cost * TAX_RATE);
    }
}
