package May2022.May19;

import java.util.Scanner;
public class MaxLengthSequence {
    public static void main(String[] args) {
        // given a binary number
        // change exactly 1 bit such that the length of the sequence of continuous 1s is maximum
        // print the maximum length
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        sc.close();

        int i=0,j=0;
        int maxLength=0;
        boolean check=true;
        while(i<s.length()&&j<s.length()){
            if(s.charAt(j)=='1'){
                if(j==s.length()-1){maxLength=Math.max(maxLength,++j-i);}
                else{j++;}
            }
            else if(s.charAt(j)=='0' && check){
                if(j==s.length()-1){Math.max(maxLength,++j-i);break;}
                j++;
                check=false;
            }else if(s.charAt(j)=='0'){
                maxLength=Math.max(maxLength, j-i);
                check=true;
                j=++i;
            }
        }

        System.out.println(maxLength);
    }
}