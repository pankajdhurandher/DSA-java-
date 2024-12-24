//class Solution {
//    // Function to find common elements in three arrays.
//    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
//                                        List<Integer> arr3) {
//        // Code Here
//        TreeMap<Integer , Integer> tr = new TreeMap<>();
//        for(int i : arr1){
//            tr.put(i , 1);
//        }
//        for(int i : arr2){
//            if(tr.containsKey(i) && tr.get(i) == 1){
//                tr.put(i , 2);
//            }
//        }
//        for(int i : arr2){
//            if(tr.containsKey(i) && tr.get(i) == 2){
//                tr.put(i , 3);
//            }
//        }
//        ArrayList<Integer> ans = new ArrayList<>();
//        for(int i : tr.keySet()){
//            if(tr.get(i) == 3) {
//                ans.add(i);
//            }
//        }
//        if(ans.size() == 0){
//            ans.add(-1);
//            return ans;
//        }else{
//            return ans;
//        }
//    }
//}
//public class Common_in_3_arrays {
//}
