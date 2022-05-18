import java.util.Scanner;
public class test2 {
    public int reverse(int x) {
        
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int n4=sc.nextInt();
        sc.close();

        int count=0;
        if(n1>=n4){count++;}
        if(n2>=n4){count++;}
        if(n3>=n4){count++;}
        System.out.println(count);
    }
}