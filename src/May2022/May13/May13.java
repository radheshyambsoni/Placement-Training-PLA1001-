package May2022.May13;

import java.util.Scanner;

public class May13 {
    public static void main(String[] args) {
        // Is Java platform independent or not -> it is
        // Java creates a linker class file whichdoes not depend on configuration of the system.
        // The file is created before compilation
        // for example in cpp int is 2 bytes and 4 

        System.out.println("Welcome to Java");

        // User input
        Scanner sc=new Scanner(System.in);
        // int a=sc.nextInt();
        // System.out.println(a);

        // float f=sc.nextFloat();
        // System.out.println(f);

        // String s0=sc.next();
        // System.out.println(s0);
        // String s1=sc.nextLine();
        // System.out.println(s1);
        
        // taking single character as input
        char ch=sc.next().charAt(0);
        System.out.println(ch);
        char ch1=(char)(ch-32);
        System.out.println(ch1);
        
        sc.close();
        System.out.print("test");
        System.out.println("test");
        System.out.println("test");
    }
}

// HW: difference between programmer and coder?
//  