package May2022.May19;

public class SwapNibbles {
    public static void main(String[] args) {
        int n=128;
        String s=Integer.toBinaryString(n);
        while(s.length()!=8){s="0".concat(s);}
        String ans=s.substring(4).concat(s.substring(0,4));
        n=Integer.parseInt(ans);
        ans=Integer.toString(n);
        n=0;
        for(int i=0;i<ans.length();i++){
            n+=Integer.parseInt(ans.substring(i,i+1))*Math.pow(2, ans.length()-1-i);
        }System.out.println(n);
        
        // 1. using Hexadecimal no. and bitwise operators
        // 2. using block swap
    }
}