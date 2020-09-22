
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnk
 */
public class Main {
    public static void main(String[] args) {
              
        
        sayHello();
        sayHello();
        sayHello();
        sayHello();
        sayHello();
        sayHello();
        sayHello();
        
        displayValue(100);
        
        int myValue = 50;
        displayValue(myValue);
        
        displayTwoValues(5, 7.1);
        
        double result = subtract(5, 2.4);
        
        int randomNumber = getRandomNumber();
        System.out.println(randomNumber);
        
        System.out.println(getRandomNumber());
    }
    
    public static int getRandomNumber() {
        Random rand = new Random();
        
        return rand.nextInt();
    }
    
    public static double subtract(double number1, double number2) {
        double difference = number1 - number2;
        
        return difference;
    }
    
    public static void displayTwoValues(int value1, double value2) {
        System.out.println("Value 1 is: " + value1);
        System.out.println("Value 2 is: " + value2);
    }

    public static void displayValue(int value){
        System.out.println("Your value is: " + value);
    }
    
    public static void sayHello() {
        String hello = "Hello!!!!!";
        
        System.out.println(hello);
    }
}
