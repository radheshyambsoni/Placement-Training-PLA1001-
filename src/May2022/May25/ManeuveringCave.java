package May2022.May25;

import java.util.Scanner;

// Important for prod based MNCs
public class ManeuveringCave {
    static int calculatePaths(int m,int n){
        if(m==1 || n==1){return 1;}
        return calculatePaths(m-1, n)+calculatePaths(m, n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        sc.close();
        
        // System.out.println(calculatePaths(m, n));

        // Iterative but O(n^2)
        // int arr[][]=new int[m][n];
        // if(m!=n){
        //     for(int i=0;i<n;i++){arr[0][i]=1;}
        //     for(int i=0;i<m;i++){arr[i][0]=1;}
        // }else{
        //     for(int i=0;i<m;i++){arr[0][i]=1;arr[i][0]=1;}
        // }

        // for(int i=1;i<m;i++){
        //     for(int j=1;j<n;j++){
        //         arr[i][j]=arr[i-1][j]+arr[i][j-1];
        //     }
        // }
        // System.out.println(arr[m-1][n-1]);

        int arr[][]=new int[m][n];
        if(m!=n){
            for(int i=0;i<n;i++){arr[0][i]=1;}
            for(int i=0;i<m;i++){arr[i][0]=1;}
        }else{
            for(int i=0;i<m;i++){arr[0][i]=1;arr[i][0]=1;}
        }
        for(int i=1;i<m;i++){
            if(i==1){}
        }
    }
}