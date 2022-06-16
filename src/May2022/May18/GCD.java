package May2022.May18;

import java.util.Scanner;

public class GCD{
    // Naive approach to find GCD
    static int gcd(int m,int n){
        int gcd=1;
        for(int i=1;i<=Math.min(m,n);i++){
            if(m%i==0 && n%i==0){
                gcd=i;
            }
        }

        return gcd;
    }
    public static void main(String[] args) {
        // GCD
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        sc.close();
        System.out.println(gcd(m,n));
    }
}