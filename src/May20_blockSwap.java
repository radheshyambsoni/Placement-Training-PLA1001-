public class May20_blockSwap{
    // Wrapper over the recursive function leftRotateRec()
    // It left rotates arr[] by d.
    public static void leftRotate(int arr[],int d,int n){
        leftRotateRec(arr,0,d,n);
    }

    public static void leftRotateRec(int arr[],int i,int d,int n){
        /*
         * Return If number of elements to be rotated
         * is zero or equal to array size
         */
        if(d==0 || d==n)
            return;

        /*
         * If number of elements to be rotated
         * is exactly half of array size
         */
        if(n-d==d){
            swap(arr,i,n-d+i,d);
            return;
        }

        /* If A is shorter */
        if(d<n-d){
            swap(arr,i,n-d+i,d);
            leftRotateRec(arr,i,d,n-d);
        }else{/* If B is shorter */
            swap(arr,i,d,n-d);
            leftRotateRec(arr,n-d+i,2 * d-n,d);/* This is tricky */
        }
    }

    /* UTILITY FUNCTIONS */
    /* function to print an array */
    public static void printArray(int arr[],int size){
        int i;
        for(i = 0;i<size;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    /*
     * This function swaps d elements
     * starting at index fi with d elements
     * starting at index si
     */
    public static void swap(int arr[],int fi,
            int si,int d){
        int i,temp;
        for(i = 0;i<d;i++){
            temp = arr[fi+i];
            arr[fi+i] = arr[si+i];
            arr[si+i] = temp;
        }
    }

    public static void main(String[] args){
        // Naive approach for block swap
        // Scanner sc=new Scanner(System.in);
        int arr[] ={ 1,2,3,4,5 };
        // int idx=sc.nextInt();
        // sc.close();

        // int ans[]=new int[arr.length];
        // int j=0;
        // for(int i=idx+1;i<arr.length;i++){
        // ans[j]=arr[i];
        // j++;
        // }
        // for(int i=0;i<=idx&&idx<arr.length;i++){
        // ans[j]=arr[i];
        // j++;
        // }

        // System.out.println(Arrays.toString(ans));

        leftRotate(arr, 2, arr.length);
        printArray(arr, arr.length);
    }
}
