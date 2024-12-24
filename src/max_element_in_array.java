public class max_element_in_array {

    public static int getMaxV(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0 ; i <= arr.length-1 ; i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int getMinV(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0 ; i <= arr.length-1 ; i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    public static int sumArray(int[] arr){
        int sum = 0;
        for (int i = 0 ;i < arr.length - 1 ; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static int SecondMaxInArray(int[] arr){
        int Smin = Integer.MIN_VALUE;
        for (int i = 0 ; i < arr.length - 1 ; i++){
            if (arr[i] > Smin && arr[i] != getMaxV(arr)){
                Smin = arr[i];
            }
        }
        return Smin;
    }

    public static int SecondMinArray(int[] arr){
        int Smax = Integer.MAX_VALUE;
        for (int i = 0 ; i < arr.length - 1 ; i++){
            if (arr[i]<Smax && arr[i] != getMinV(arr)){
                Smax = arr[i];
            }
        }
        return Smax;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};

        System.out.println("Max value of an array is : " + getMaxV(arr));
        System.out.println("Max value of an array is : " + getMinV(arr));
        System.out.println("Sum of an array is : " + sumArray(arr));
        System.out.println("Second Max element in array : " + SecondMaxInArray(arr));
        System.out.println("Second Min value in an Array : " + SecondMinArray(arr));

    }
}
