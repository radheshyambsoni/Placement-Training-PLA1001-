public class May25_MoveHyphen {
    // Move Hyphen to beginning
    public static void main(String[] args){
        char str[]="-test-- test----".toCharArray();
        int i=str.length - 1;
        moveHyphen(str, i);
    }

    private static void moveHyphen(char[] str, int i) {
        for(int j=i;j >= 0;j--){
            if(str[j]!='-'){
                char temp=str[i];
                str[i]=str[j];
                str[j]=temp;
                i--;  
            }
        }
        
        for(i=0;i<str.length;i++){System.out.print(str[i]+"");}
    }
}