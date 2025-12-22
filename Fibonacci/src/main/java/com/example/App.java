package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int f1=0;
        int f2=1;
        System.out.println(f1);
        System.out.println(f2);
        for(int i=0; i<10; i++){
            int temp=f1;
            f1=f2;
            f2=temp+f1;
            System.out.println(f2);
        }
    }
}
