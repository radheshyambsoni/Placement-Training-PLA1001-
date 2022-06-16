package May2022.May18;

import java.util.Scanner;

public class binaryPalindrome {

    // store elements of stack
    private char arr[];
    // represent top of stack
    private int top;
    // total capacity of the stack
    private int capacity;

    // Creating a stack
    binaryPalindrome(int size){
        // initialize the array
        // initialize the stack variables
        arr=new char[size];
        capacity=size;
        top=-1;
    }

    // push elements to the top of stack
    public void push(char x){
        if(isFull()){
            System.out.println("Stack OverFlow");

            // terminates the program
            System.exit(1);
        }

        // insert element on top of stack
        arr[++top]=x;
    }

    // pop elements from top of stack
    public char pop(){
        // if stack is empty
        // no element to pop
        if(isEmpty()){
            System.out.println("STACK EMPTY");
            // terminates the program
            System.exit(1);
        }

        // pop element from top of stack
        return arr[top--];
    }

    // return size of the stack
    public int getSize(){
        return top+1;
    }

    // check if the stack is empty
    public Boolean isEmpty(){
        return top==-1;
    }

    // check if the stack is full
    public Boolean isFull(){
        return top==capacity-1;
    }

    // display elements of stack
    public void printStack(){
        for(int i=0; i <= top; i++){
            System.out.print(arr[i]+", ");
        }
    }

    public void shiftHalfElements(binaryPalindrome x){
        int n=this.getSize();
        for(int i=0;i<n/2;i++){
            x.push(this.pop());
        }
    }

    public boolean compare(binaryPalindrome x){
        this.shiftHalfElements(x);
        for(int i=0;i<x.getSize();i++){
            if(this.arr[i]!=x.arr[i]){return false;}
        }        
        return true;
    }
    
    static String dec2bin(int n){
        if(n==0){return "0";}
        String ans="";
        while(n>0){
            ans=ans.concat(Integer.toString(n%2));
            n/=2;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        sc.close();

        String ans=dec2bin(n);
        // String ans=Integer.toBinaryString(n);
        // System.out.println(ans);
        // System.out.println(ans.length());
        
        // binary palindrome checking using stack implementation
        binaryPalindrome o1=new binaryPalindrome(ans.length());
        binaryPalindrome o2=new binaryPalindrome(ans.length());

        for(int i=0;i<ans.length();i++){
            o1.push(ans.charAt(i));
        }

        System.out.println(o1.compare(o2));

        // if(o1.compare(o2)){
        //     System.out.println(n+" is a binary palindrome!");
        // }else{
        //     System.out.println(n+" is not a binary palindrome!");
        // }

        // binary palindrome checking
        // boolean b=true;
        // for(int i=0;i<ans.length()/2;i++){
        //     if(ans.charAt(i)!=ans.charAt(ans.length()-i-1)){b=false;break;}
        // }
            
        // if(b){
        //     System.out.println(n+" is a binary palindrome!");
        // }else{
        //     System.out.println(n+" is not a binary palindrome!");
        // }
    }
}
