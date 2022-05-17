import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        sc.close();

        if(Integer.parseInt(s1)>Integer.parseInt(s2)){
            System.out.println("Age: "+(100+Integer.parseInt(s2)-Integer.parseInt(s1)));
        }else{
            System.out.println("Age: "+(Integer.parseInt(s2)-Integer.parseInt(s1)));
        }
    }
}