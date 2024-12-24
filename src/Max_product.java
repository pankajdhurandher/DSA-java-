public class Max_product {
    public static int maxProduct(int[] arr){
        int maxProduct = Integer.MIN_VALUE;
        int product = 1;
        for (int i = 0 ; i < arr.length ; i++){
            product *= arr[i];
            if (product > maxProduct){
                maxProduct = product;
            }
            if (product == 0 ){
                product = 1;
            }
        }

         product = 1;
        for (int i = 0 ; i < arr.length ; i++){
            product *= arr[i];
            if (product > maxProduct){
                maxProduct = product;
            }
            if (product < 0 ){
                product = 1;
            }
        }
        return (int)maxProduct;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,8,-6,4,7,9,0,-5};
        System.out.println(maxProduct(arr));
    }
}
