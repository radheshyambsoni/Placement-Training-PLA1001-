package May2022.May24;

public class WeightedSubstring {
    public static void main(String[] args) {
        String P="Hello";
        int Q[]={9,8,7,6,5};
        int k=24;
        weightedSubstr(P, Q, k);
    }

    static void weightedSubstr(String P, int[] Q, int k) {
        if(k<=0){System.out.println("Not possible for limit less than or equal to zero");return;}
        for(int i=0;i<P.length();i++){
            String temp="";
            int wt=0;
            for(int j=i;j<P.length();j++){
                wt+=Q[j];
                if(wt<=k){
                    temp+=P.charAt(j);
                    System.out.print(temp+" ");
                }else{break;}
            }System.out.println();
        }
    }
}
