public class Contigous_Max_Sub_Array_Updated {

    public static int maxSubArray(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int sum = 0 ;
        for (int i = 0 ; i < arr.length ; i++){
            sum += arr[i];
            if (sum > maxSum){
                maxSum = sum;
            }
            if (sum < 0){
                sum = 0;
            }
            /* yha ye last mai ek or loop use kie the pr iske check krte hai ki agr sum 0 se chota hai to sum ko 0 hi assign krdete hai
            isse jb bhi sum negative hoga to to zero assign ho jaega

             or order of n hi time lgega
             */
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
}
