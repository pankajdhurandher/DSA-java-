import java.util.Arrays;
public class Sum_of_index_Equel_target {
    public static void main(String[] args) {
        int[] arr = {3,5,8,95,4,6,2,7,58,96,45};
        int[] ans = new int[2];
        System.out.print("Array : ");
        for (int i = 0 ; i < arr.length - 1  ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int target = 10;


        for (int i = 0 ; i < arr.length ; i++){
            for (int j = i + 1 ; j < arr.length ; j++){
                if (arr[i] + arr[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        System.out.print("\nTarget = " + ans[0] + " + " + ans[1]);
        Arrays.sort(arr);
        System.out.println("\nMin " + arr[0] + "       Max : " + arr[arr.length-1]);
    }
}








//HASHMAP SE ORDEROF 1 ME SLOVE KRNA HAI