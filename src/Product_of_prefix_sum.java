public class Product_of_prefix_sum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] ans = new int[arr.length];
        for (int i = 0 ; i < arr.length ; i++){
            int pro = 1;
            for (int j = 0 ; j < args.length ; j++){

                if (j==i){
                    continue;
                }
                pro = pro*arr[i];
            }
            ans[i] = pro;
        }
        for (int i : ans){
            System.out.print(" " + i + " ");
        }
    }
}
