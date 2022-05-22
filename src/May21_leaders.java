// import java.util.Vector;

public class May21_leaders {
    public static void leaders(int arr[]){
        int maxElement=arr[arr.length-1];
        System.out.print(maxElement+" ");

        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>maxElement){
                maxElement=arr[i];
                System.out.print(maxElement+" ");
            }
        }
    }

    public static void main(String[] args) {
        // Vector<Integer> leaders=new Vector<>();
        int arr[]={5,0,2,-3,1,0};
        for(int i=0;i<arr.length;i++){
            boolean check=true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    check=false;break;
                }
            }if(check){System.out.print(arr[i]+" ");}
            // if(check){leaders.add(arr[i]);}
        }
        // System.out.println(leaders); 

        System.out.println();
        // Optimised approach
        leaders(arr);
    }
}
