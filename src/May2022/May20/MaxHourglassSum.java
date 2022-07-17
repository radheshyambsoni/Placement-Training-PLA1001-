package May2022.May20;

public class MaxHourglassSum {
    static int maxSum(int[][] arr){
        if (arr.length<3 || arr[0].length<3){return -1;}

        int sum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length-2;i++){
            int temp=0;
            for(int j=0;j<arr[i].length-2;j++){
                temp=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                sum=Math.max(sum,temp);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[][]={{1, 2, 3, 0, 0},
        {0, 0, 0, 0, 0},
        {2, 1, 4, 0, 0},
        {0, 0, 0, 0, 0},
        {1, 1, 0, 1, 0}};
        System.out.println(maxSum(arr));
    }
}