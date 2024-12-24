public class Contigous_Max_Sub_Array {
    public static int max_Sub_Array(int[] arr){
        int max_Sum = Integer.MIN_VALUE;
        for (int i = 0 ; i < arr.length ; i++){
            int sum = 0;
            for (int j = i ; j < arr.length ; j++){
                sum += arr[j];
                if (sum > max_Sum){
                    max_Sum = sum;
                }
            }
        }
        return max_Sum;
    }
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(max_Sub_Array(arr));
    }
}
