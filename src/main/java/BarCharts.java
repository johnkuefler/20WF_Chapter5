/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnk
 */
import java.util.Scanner;  // Needed for keyboard input

/**
 * This program demonstrates a solution to the Bar Chart programming challenge.
 */
public class BarCharts {

    public static void main(String[] args) {
         // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Get the sales for store 1.
        System.out.println("Enter today's sales for store 1: ");
        double sales1 = keyboard.nextDouble();

        // Get the sales for store 2.
        System.out.println("Enter today's sales for store 2: ");
        double sales2 = keyboard.nextDouble();

        // Get the sales for store 3.
        System.out.println("Enter today's sales for store 3: ");
        double sales3 = keyboard.nextDouble();

        // Get the sales for store 4.
        System.out.println("Enter today's sales for store 4: ");
        double sales4 = keyboard.nextDouble();

        // Get the sales for store 5.
        System.out.println("Enter today's sales for store 5: ");
        double sales5 = keyboard.nextDouble();

        // Display the bar chart heading.
        System.out.println("\nSALES BAR CHART");

        // Display the chart for store 1.
        printBarChart(sales1);

        // Display the chart for store 2.
        printBarChart(sales2);

        // Display the chart for store 3.
        printBarChart(sales3);

        // Display the chart for store 4.
        printBarChart(sales4);

        // Display the chart for store 5.
        printBarChart(sales5);

    }

    public static void printBarChart(double numberOfSales) {
        String bar = "";
        int numStars = (int) (numberOfSales / 100);
        for (int i = 0; i < numStars; i++) {
            bar = bar + "*";
        }
        System.out.println(bar);
    }
}
