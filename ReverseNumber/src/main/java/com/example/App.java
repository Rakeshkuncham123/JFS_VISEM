package com.example;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        System.out.println( "Enter the Number :" );
        int num=sc.nextInt();
        String res=reverseNumber(num);
        System.out.println("Reversed Number is :"+res);
    }
    public static String  reverseNumber(int num){
        String s="";
        while(num>0){
            int rem=num%10;
            num=num/10;
            s+=Integer.toString(rem);
        }
        return s;
    }
}
