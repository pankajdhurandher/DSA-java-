package Secondary_Class;

public class Reverse_array {
    public static void reverseArray(int[] arr){
        int n = (int)arr.length/2;
        int temp;
        for (int i = 0 ; i < n ; i++){
            temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length - i - 1] = temp;
        }
        System.out.println();
    }
    public static void printArray(int[] arr){
        for (int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        printArray(arr);
        reverseArray(arr);
        printArray(arr);
    }

}
