package May2022.May24;

import java.util.Scanner;

// Topic - Strings
public class Manacher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        sc.close();
        char str[]=s.toCharArray();
        String temp="";
        if(s.length()%2==0){
            for(int i=0;i<str.length-1;i++){
                temp+=str[i];
                temp+="#";
            }
            temp+=str[str.length-1];
        }else{temp=s.substring(0);}

        Mancher(temp,(temp.length()/2)+1);
    }
    static void Mancher(String s,int i){
        // if(s.charAt(i)){}
    }
}