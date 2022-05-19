public class May19_swapNibble {
    public static void main(String[] args) {
        int n=12;
        String s=Integer.toBinaryString(n);
        while(s.length()!=8){s="0".concat(s);}
        String ans=s.substring(4).concat(s.substring(0,4));
        n=Integer.parseInt(ans);
        ans=Integer.toString(n);
        n=0;
        for(int i=0;i<ans.length();i++){
            n+=Integer.parseInt(ans.substring(i,i+1))*Math.pow(2, ans.length()-1-i);
        }
        System.out.println(n);
    }
}