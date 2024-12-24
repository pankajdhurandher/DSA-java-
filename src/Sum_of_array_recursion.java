public class Sum_of_array_recursion {

    public static int sumArray(int[] arr, int n) {

        if (n <= 0) {
            return 0;
        }

        int so = sumArray(arr, n - 1);
        int ans = so + arr[n - 1];
        return ans;


    }

    public static int findTarger(int[] arr , int n , int target ){
        if (n<=0){
            return 0;
        }
        if (arr[n-1] == target){
            return n-1;
        }
        return findTarger(arr , n-1 , target);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("Sum of a array is : "+sumArray(arr , arr.length));

    }
}
