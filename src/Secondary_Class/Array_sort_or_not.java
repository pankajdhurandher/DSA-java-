package Secondary_Class;

public class Array_sort_or_not {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int check = 0;
        for (int i = 0; i < arr.length - 1 ; i++) {
                if (arr[i]<arr[i+1]){
                    check++;
                }
        }
        if (check == arr.length -1){
            System.out.println("Array is sorted");
        }else {
            System.out.println("Array is not sorted");
        }

    }
}