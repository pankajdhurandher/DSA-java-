public class Sort_Bubble_Sort {
    public static void main(String[] args) {
        int[] arr= {10,58,96,56,85,65,4,45,255,58};
        for (int i = 0 ; i < arr.length ; i++){
            for (int j = 0 ; j < arr.length - i - 1 ; j++){
                if (arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
}
