package Facade;

public class Minus { 
    public static double minus (double... args){
       double total = 0.0; 
       for(double d : args){
           total -= d;
       }
       return total;
    } 
}
