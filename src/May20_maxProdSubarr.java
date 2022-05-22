public class May20_maxProdSubarr {
    static int maxSubarrProd(int[] arr){
        int maxProd=arr[0];

        // for(int i=0;i<arr.length;i++){
        //     int temp=arr[i];
        //     for(int j=i+1;j<arr.length;j++){
        //         maxProd=Math.max(maxProd,temp);
        //         temp*=arr[j];
        //     }
        //     maxProd=Math.max(maxProd,temp);
        // }

        // Efficient solution with only one while loop
        int i=0,j=1;
        int temp=arr[0];
        while(i<arr.length && j<arr.length){
            if(i==arr.length-1){
                temp=arr[i];
                maxProd=Math.max(maxProd,temp);
                break;
            }
            if(j==i+1){
                temp=arr[i];
                maxProd=Math.max(maxProd,temp);
            }            
            temp*=arr[j];
            maxProd=Math.max(maxProd,temp);
            if(j==arr.length-1){
                if(i==arr.length-2){j=++i;continue;}
                j=++i+1;continue;
            }
            j++;
        }
        
        return maxProd;
    }
    public static void main(String[] args) {
        int arr[] = {0,-1,0,-3,25,0,5,6};
        System.out.println("Maximum Sub array product is "+ maxSubarrProd(arr));
    }
}
