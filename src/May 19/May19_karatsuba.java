import java.util.Scanner;
public class May19_karatsuba{
    // x*y=ac*10^(n)+(cb+ad)*10^(n/2)+bd
    static long karatsuba(int n1,int n2){
        // n1,n2 - decimal numbers
        
        int len=(int)(Math.max(Math.log10(n1),Math.log10(n2)))+1;
        if(len==1){
            return n1*n2;
        }

        long ac=karatsuba((int)(n1/Math.pow(10,len/2)),(int)(n2/Math.pow(10,len/2)));
        long bd=karatsuba((int)(n1%Math.pow(10,len/2)),(int)(n2%Math.pow(10,len/2)));
        long bcPLUSad=karatsuba((int)(n1/Math.pow(10,len/2))+(int)(n1%Math.pow(10,len/2)),(int)(n2/Math.pow(10,len/2))+(int)(n2%Math.pow(10,len/2)))-ac-bd;

        return ac*(int)Math.pow(10,len-len%2)+bcPLUSad*(int)Math.pow(10, len/2)+bd;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        sc.close();
        
        System.out.println(karatsuba(n1, n2));
    }
}