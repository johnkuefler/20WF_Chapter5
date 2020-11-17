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
public class BarChartsTest {
    
    public BarChartsTest() {
    }

  
    /**
     * Test of calculateChartAsterisks method, of class BarCharts.
     */
    @Test
    public void testCalculateChartAsterisksNoSales() {
        // arrange
        System.out.println("calculateChartAsterisks");
        double numberOfSales = 0.0;
        String expResult = "";
        
        // act 
        String result = BarCharts.calculateChartAsterisks(numberOfSales);
        
        // assert
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalculateChartAsterisks100Sales() {
        // arrange
        System.out.println("calculateChartAsterisks");
        double numberOfSales = 100.0;
        String expResult = "*";
        
        // act 
        String result = BarCharts.calculateChartAsterisks(numberOfSales);
        
        // assert
        assertEquals(expResult, result);
    }
    
     @Test
    public void testCalculateChartAsterisks500Sales() {
        // arrange
        System.out.println("calculateChartAsterisks");
        double numberOfSales = 500.0;
        String expResult = "*****";
        
        // act 
        String result = BarCharts.calculateChartAsterisks(numberOfSales);
        
        // assert
        assertEquals(expResult, result);
    }
    
         @Test
    public void testCalculateChartAsterisks151Sales() {
        // arrange
        System.out.println("calculateChartAsterisks");
        double numberOfSales = 151.0;
        String expResult = "**";
        
        // act 
        String result = BarCharts.calculateChartAsterisks(numberOfSales);
        
        // assert
        assertEquals(expResult, result);
    }
    
    
      public void testCalculateChartAsterisks199Sales() {
        // arrange
        System.out.println("calculateChartAsterisks");
        double numberOfSales = 199.0;
        String expResult = "**";
        
        // act 
        String result = BarCharts.calculateChartAsterisks(numberOfSales);
        
        // assert
        assertEquals(expResult, result);
    }
}
