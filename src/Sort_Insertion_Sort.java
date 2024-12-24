public class Sort_Insertion_Sort {
    public static void main(String[] args) {
        int[] arr ={5,10,6,89,56,2,11,58};
        int n = arr.length;

        for (int i = 1 ; i < n  ; i++){
            int temp = arr[i];
            int j = i-1;

            while (j >= 0 && arr[j] >= arr[temp]){
                arr[j+1] = arr[j];
                j--;
            }
        }
    }
}
