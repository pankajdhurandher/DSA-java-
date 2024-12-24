package Sorting;

public class Selection_Sort {
    public static void selectionSort(int[] arr , int n){
        for (int i = 0 ;  i < n-1 ; i++){
            int mini = i;
            for (int j = i+1 ; j < n ; j++ ){
                //minimum index find krna hai                 bubble sort or selection sort mai thi difference hota hai ki
                if (arr[j]<arr[mini]){                      //isme phle index find krte hai fir uske swap krte hai or BUBBLE
                    mini = j;                              // SORT mai index find krne ke baad turant hi swap krte hai
                }
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }


    }
    public static void printArray(int[] arr){
        for (int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1,5,7,6,5,7,9,7,5,87};
        printArray(arr);
        selectionSort(arr , arr.length);
        printArray(arr);

    }
}
