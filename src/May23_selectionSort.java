import java.util.Arrays;

public class May23_selectionSort{
    public static void main(String[] args) {
        int arr[]={-12,-22,6,44,-22,-18,10};
        int i=0;
        int minIdx=-1;
        while(i<arr.length-1){
            int minVal=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(minVal>arr[j]){
                    minVal=arr[j];
                    minIdx=j;
                }
            }

            // swapping
            if(minVal!=arr[i]){
                int temp=arr[i];
                arr[i]=arr[minIdx];
                arr[minIdx]=temp;
            }
            
            i++;
        }

        System.out.println(Arrays.toString(arr));
    }
}