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
        System.out.println("Enter the string to check palindrome");
        String name=sc.nextLine();
        if(isPalindrome(name)){
            System.out.println("the given String "+name+" is a Palindrome");
        }else{
            System.out.println("the given String "+name+" is not a Palindrome");

        }
        
    }
    public static boolean isPalindrome(String name){
        name = name.toLowerCase();
        int i=0;
        int j=name.length()-1;
        while(i<j){
            if(name.charAt(i)!=name.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
