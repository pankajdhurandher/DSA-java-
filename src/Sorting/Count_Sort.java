package Sorting;

public class Count_Sort {
    // ye ek condicnal qus hai jisme
    public static void main(String[] args) {
        int[] frequencyarr = new int[3];
        //[0,0,0]
        int[] nums = {1 ,2 ,1 ,0 ,0 ,2 ,0 ,1 ,0 ,2 ,1 ,0 ,2 ,0 ,2 ,1 ,0 ,0 ,2 ,1 ,0 ,2};
        for (int i = 0 ; i < nums.length ; i++){
            // frequencyarr mai phle 0 0 0 store hoga fir
            frequencyarr[nums[i]]++;
        }
        for(int i : frequencyarr){
            System.out.println(i);
        }

    }
}
