
public class Next_greater_element {
    public static long[] nextLargerElement(long[] arr, int n)
    {
        // Your code here
        long[] ans = new long[arr.length];

        for(int i = 0 ; i < arr.length ; i++){
            if(i == arr.length - 1 ){
                ans[arr.length - 1] = -1;
            }
            for(int j = i + 1 ; j < n ; j++){
                if(arr[j]>arr[i]){
                    ans[i] = arr[j];
                    break;
                }else{
                    ans[i] = -1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {5,8,6,8,4,2,9,11,7,8,2,9,5,5,8};

    }
}
