/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcd01;

/**
 *
 * @author Candy
 */
public class Gcd01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 39;
        int b = 168;
        System.out.println("GCD of two numbers " + a +" and " + b +" is " + findGCD(a,b)); 
        
        while (a != b)
        {
            if (a > b){
                a = a-b;      
            }
            else{
                b = b-a;
            }
        }
        System. out.println("GCD = " + a);
    }
    
    private static int findGCD(int a, int b) { 
        if (b == 0){
            return a;
        }
        else{
            return findGCD(b, a % b);
        }
    }
    
    private static int findGCDwithPrim(int a, int b){
        return 0;
    }
}
