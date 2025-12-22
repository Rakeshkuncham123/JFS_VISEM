package com.example;

/**
 * Hello world!
 *
 */
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        System.out.println( "Enter the Number" );
        int num=sc.nextInt();
        if(isPrime(num)){
            System.out.println("The Number "+num+" is a PrimeNumber");
        }else{
            System.out.println("The Number "+num+" is not a PrimeNumber");

        }
        
    }
    public static boolean isPrime(int num){
        if(num<=1) return false;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0) return false;
        }
        return true;
    }
}
