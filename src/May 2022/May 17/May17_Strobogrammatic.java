import java.util.Scanner;
public class May17_Strobogrammatic {
    public static void main(String[] args) {
        // strobogrammatic number
        // flippable digits - 0,1,6,8,9
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int num=n;

        int len=0;
        // length of a number
        while(num>0){num/=10;len++;}

        num=n;
        // creating array with digits
        int digits[]=new int[len];
        for(int i=0;i<len;i++){
            digits[len-i-1]=num%10;
            num/=10;
        }

        // checking the digits if unflippable ones are present or not
        for(int i=0;i<len;i++){
            if(!(digits[i]==0 || digits[i]==1 || digits[i]==6 || digits[i]==8 ||digits[i]==9)){
                System.out.println("Not a strobochromatic number");return;
            }
        }

        // checking for strobo chromatic number
        boolean condition=true;
        for(int i=0;i<len/2;i++){
            if(digits[i]==0 || digits[i]==1 || digits[i]==8){
                if(digits[i]!=digits[len-i-1]){condition=false;break;}
            }else if(digits[i]==6){
                if(digits[len-i-1]!=9){condition=false;break;}
            }else if(digits[i]==9){
                if(digits[len-i-1]!=6){condition=false;break;}
            }
        }
        if(condition){
            System.out.println(n+" is strobogrammatic number");
        }
    }
}