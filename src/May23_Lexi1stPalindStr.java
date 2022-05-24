import java.util.HashMap;
import java.util.Scanner;

public class May23_Lexi1stPalindStr{
    static char oddFreqChar;
    public static boolean canMakePalind(HashMap<Character,Integer> m1){
        int count=0;
        for(char c:m1.keySet()){
            if(m1.get(c)%2!=0){
                oddFreqChar=c;
                count++;
            }
            if(count>1){return false;}
        }

        return true;
    }
    public static String Lexico1stPalindStr(String s){
        HashMap<Character,Integer> m1=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!m1.containsKey(s.charAt(i))){
                m1.put(s.charAt(i), 1);
            }else{
                m1.put(s.charAt(i),m1.get(s.charAt(i))+1);
            }
        }

        if(!canMakePalind(m1)){
            return "No palindromic string";
        }

        String ansL="";
        String ansR="";

        for(Character c:m1.keySet()){
            for(int i=0;i<m1.get(c)/2;i++){
                ansL+=c;
                ansR=c+ansR;
            }
        }
        
        return ansL+oddFreqChar+ansR;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        sc.close();

        System.out.println(Lexico1stPalindStr(s));
    }
}