/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author johnk
 */
public class RetailCalculatorTest {
    
    public RetailCalculatorTest() {
    }


    /**
     * Test of calculateRetail method, of class RetailCalculator.
     */
    @Test
    public void testCalculateRetail() {
        // arrange
        System.out.println("calculateRetail");
        double wholeSaleCost = 10;
        double markupPercentage = 0.5;
        double expResult = 15;
        
        // act
        double result = RetailCalculator.calculateRetail(wholeSaleCost, markupPercentage);
       
        // assert
        assertEquals(expResult, result);
    }
    
        @Test
    public void testCalculateRetailNegativeMarkup() {
        // arrange
        System.out.println("calculateRetail");
        double wholeSaleCost = 10;
        double markupPercentage = -0.5;
        double expResult = 5;
        
        // act
        double result = RetailCalculator.calculateRetail(wholeSaleCost, markupPercentage);
       
        // assert
        assertEquals(expResult, result);
    }
    
    public void testCalculateRetailNegativeWholeSale() {
        // arrange
        System.out.println("calculateRetail");
        double wholeSaleCost = -10;
        double markupPercentage = 0.5;
        double expResult = 0;
        
        // act
        double result = RetailCalculator.calculateRetail(wholeSaleCost, markupPercentage);
       
        // assert
        assertEquals(expResult, result);
    }
}
