package May2022.May18;

import java.util.Scanner;

public class EuclideanGCD {
    static int EuclidGCD(int m,int n){
        int r=-1;
        int a=Math.max(m, n);
        int b=Math.min(m, n);

        while(b!=0){
            r=a%b;
            a=b;
            b=r;
        }
        
        return a;
    }

    // Time complexity of Euclidean GCD is O(log(min(a,b)) base 2)
    static int EuclideanGCD_recursive(int m,int n){
        if(n==0){
            return m;
        }
        return EuclideanGCD_recursive(n, m%n);
    }
    public static void main(String[] args) {
        // Euclidean GCD
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        sc.close();

        // int gcd=EuclidGCD(m, n);
        int gcd=EuclideanGCD_recursive(Math.max(m,n),Math.min(m,n));
        System.out.println("GCD of "+m+" & "+n+" is "+gcd);
    }
}
