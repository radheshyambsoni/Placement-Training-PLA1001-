package May2022.May17;

import java.util.Scanner;

// Stack implementation in Java

class Strobogrammatic_Stack{

    // store elements of stack
    private int arr[];
    // represent top of stack
    private int top;
    // total capacity of the stack
    int capacity;

    // Creating a stack
    Strobogrammatic_Stack(int size){
        // initialize the array
        // initialize the stack variables
        arr=new int[size];
        capacity=size;
        top=-1;
    }

    // push elements to the top of stack
    public void push(int x){
        if(isFull()){
            System.out.println("Stack OverFlow");

            // terminates the program
            System.exit(1);
        }

        // insert element on top of stack
        arr[++top]=x;
    }

    // pop elements from top of stack
    public int pop(){

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
    // public void printStack(){
    //     for(int i=0; i <= top; i++){
    //         System.out.print(arr[i]+", ");
    //     }
    // }

    public void shiftHalfElements(Strobogrammatic_Stack x){
        for(int i=0;i<capacity/2;i++){
            x.push(this.pop());
        }
    }

    public boolean compare(Strobogrammatic_Stack x){
        this.shiftHalfElements(x);
        if(this.getSize()==x.getSize()){
            for(int i=0;i<this.capacity;i++){
                if((this.top==1 || this.top==0 || this.top==8) && (this.top!=x.top)){
                    return false;
                }else if(this.top==6&&x.top!=9){
                    return false;
                }else if(this.top==9&&x.top!=6){
                    return false;
                }
            }
        }else if(this.getSize()>x.getSize()){
            this.pop();
            boolean b=compare(x);
            return b;
        }
        return true;
    }

    public static void main(String[] args){
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

        Strobogrammatic_Stack s1=new Strobogrammatic_Stack(len);
        Strobogrammatic_Stack s2=new Strobogrammatic_Stack(len); //empty stack //second stack for comparison
        for(int i=0;i<len;i++){
            s1.push(digits[i]);
        }

        if(s1.compare(s2)){
            System.out.println(n+" is strobogrammatic number");
        }
    }
}