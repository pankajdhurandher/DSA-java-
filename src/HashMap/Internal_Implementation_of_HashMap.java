package HashMap;
import  java.util.*;

public class Internal_Implementation_of_HashMap {
   static class HashMap1<K , V>{
       //
       private class Node{
           K key;
           V value;
           // creating constructor
           public Node(K key , V value){
               this.key = key;
               this.value = value;
           }
       }

       private int n; // n - nodes
       private int N ; // N - buckets
       private LinkedList<Node> buckets[]; // N = bucket.length

       // to clear some random error like sometime we got 10-15 lines of error
       @SuppressWarnings("unchecked")

       public HashMap1(){  //  creating a linkedlist in each index
           this.N = 4;
           this.buckets = new LinkedList[4];
           for(int i = 0 ; i < 4 ; i++){
               this.buckets[i] = new LinkedList<>();
           }
       }
       // creating a hashfunction to get the index of the given value
       private int hashFunction(K key){
           int bi = key.hashCode();   // here .hashCode is pre define function we can use common hashfunction like key%10 , key%n or string hashfunction
           return Math.abs(bi) % N;  // Math.abs gived the mod value of bi
       }

       private int searchInLL(K key , int bi){
           LinkedList<Node> ll = buckets[bi];
           for(int i = 0 ; i < ll.size() ; i++){
               if(ll.get(i).key == key) return i;
           }
           return -1;
       }

       @SuppressWarnings("unchecked")
       // if the size of lambda is greater then given constant then we have to use Rehashing
       private void rehash(){
           LinkedList<Node> oldBucket[] = buckets;
           buckets = new LinkedList[N*2]; // increase the size of the linkedlist by twice

           for(int i = 0 ; i < oldBucket.length ; i++){
               LinkedList<Node> ll = oldBucket[i];
               for(int j = 0 ; j < ll.size() ; j++){
                   Node node = ll.get(j);
//                   put(node.key , node.value);
               }
           }
       }

       public void put(K key, V value) {
           int bi = hashFunction(key);
           int di = searchInLL(key, bi); //di = -1
           if(di == -1) { //key doesn't exist
               buckets[bi].add(new Node(key, value));
               n++;
           } else { //key exists
               Node node = buckets[bi].get(di);
               node.value = value;
           }
           double lambda = (double)n/N;
           if(lambda > 2.0) {
               rehash();
           }
       }

       public boolean containsKey(K key) {
           int bi = hashFunction(key);
           int di = searchInLL(key, bi); //di = -1
           if(di == -1) { //key doesn't exist
               return false;
           } else { //key exists
               return true;
           }
       }
       public V remove(K key) {
           int bi = hashFunction(key);
           int di = searchInLL(key, bi); //di = -1
           if(di == -1) { //key doesn't exist
               return null;
           } else { //key exists
               Node node = buckets[bi].remove(di);
               n--;
               return node.value;
           }
       }
       public V get(K key) {
           int bi = hashFunction(key);
           int di = searchInLL(key, bi); //di = -1
           if(di == -1) { //key doesn't exist
               return null;
           } else { //key exists
               Node node = buckets[bi].get(di);
               return node.value;
           }
       }

       public ArrayList<K> keySet() {
           ArrayList<K> keys = new ArrayList<>();
           for(int i=0; i<buckets.length; i++) { //bi
               LinkedList<Node> ll = buckets[i];
               for(int j=0; j<ll.size(); j++) { //di
                   Node node = ll.get(j);
                   keys.add(node.key);
               }
           }
           return keys;
       }
       public boolean isEmpty() {
           return n == 0;
       }
   }

    public static void main(String[] args) {
        HashMap1<String , Integer> hm = new HashMap1<String, Integer>();
        hm.put("A" , 10);
        hm.put("B" , 20);
        hm.put("C", 30);
        System.out.println(hm);

        ArrayList<String> keys = hm.keySet();
        for(int i = 0 ; i < keys.size() ; i++){
            System.out.println(keys.get(i) + " " + hm.get(keys.get(i)));
        }


        if (hm.containsKey("A")) System.out.println("A exists in the hm");

        hm.remove("B");
        System.out.println(hm);
        hm.put("C" , 50);
        System.out.println("After update the value of C : " + hm);

        System.out.println("Value of A is : " + hm.get("A"));

    }

}
