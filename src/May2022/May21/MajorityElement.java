package May2022.May21;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        // Majority Element
        // Take an array as an input and check which element is repeating for more than n/2 times that is an output
        int arr[]={3,3,4,2,4,4,2,4,4};
        HashMap<Integer,Integer> m1=new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            if(m1.containsKey(arr[i])){
                int temp=m1.get(arr[i]);
                m1.put(arr[i], temp+1);
            }else{
                m1.put(arr[i],1);
            }
        }
        for(int i:m1.keySet()){
            if(m1.get(i)>arr.length/2){
                System.out.println("Majority Element: "+i+" & Count:"+m1.get(i));
            }
        }
    }
}