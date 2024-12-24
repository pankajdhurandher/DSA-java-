import java.util.Arrays;
import java.util.Scanner;
public class Binary_Search {
    public static int binarySearch(int[] arr , int search){
        int s = 0;
        int e = arr.length;
        while (s<=e){
            int mid = (s + e)/2;
            if (arr[mid] == search){
                return mid;
            } else if (arr[mid] < search) {
                s = mid + 1;
                if (arr[mid] == search){
                    return mid;
                }
            } else if (arr[mid] > search) {
                e = mid-1;
                if (arr[mid] == search){
                    return mid;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10,60,40,30,50,70,60};
        Arrays.sort(arr);
        System.out.print("Array : ");
        for (int i : arr){
            System.out.print(i);
        }
        System.out.print("\nEnter an element that you want to search : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = binarySearch(arr , n);
        System.out.println();
        if (ans == -1){
            System.out.print("Entered number is not exist in the array");
        }else {
            System.out.print(ans);
        }
    }
}
