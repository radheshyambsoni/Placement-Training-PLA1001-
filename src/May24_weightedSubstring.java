public class May24_weightedSubstring {
    public static void main(String[] args) {
        String P="Hello";
        int Q[]={9,8,7,6,5};
        int k=25;

        for(int i=0;i<P.length();i++){
            String temp="";
            temp+=P.charAt(i);
            System.out.print(temp+" ");

            int wt=Q[i];
            for(int j=i+1;j<P.length();j++){
                wt+=Q[j];
                if(wt<=k){
                    temp+=P.charAt(j);
                    System.out.print(temp+" ");
                }else{break;}
            }System.out.println();
        }
    }
}
