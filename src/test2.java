class test2 {
    public static void main(String[] args) {
        int[] arr ={1, 2, 3, 4, 6, 4, 5, 0};
        System.out.println(arr.length);
        int max = arr[arr.length - 1];
        System.out.println(max);
        for (int i = arr.length - 2; i >= 0; i--){
            if (arr[i] > max) {
                max = arr[i];
                System.out.println(max);
            }
        }
    }
}