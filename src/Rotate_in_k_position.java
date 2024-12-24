//public class Rotate_in_k_position {
//    import java.util.ArrayList;
//
//    public class Solution {
//        public void rotate(int[] nums, int k) {
//            int n = nums.length;
//            k = k % n; // To handle cases where k > n
//
//            // Create a new ArrayList to store the rotated elements
//            ArrayList<Integer> arr1 = new ArrayList<Integer>();
//
//            // Add the last k elements
//            for (int i = n - k; i < n; i++) {
//                arr1.add(nums[i]);
//            }
//
//            // Add the first n - k elements
//            for (int i = 0; i < n - k; i++) {
//                arr1.add(nums[i]);
//            }
//
//            // Copy elements back to nums
//            for (int i = 0; i < n; i++) {
//                nums[i] = arr1.get(i);
//            }
//        }
//    }
//
//}
