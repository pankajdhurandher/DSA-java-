package HashSet;//c++ mai unorderd data set
import java.util.*;

public class Implemantation {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        //adition
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(2);
        System.out.println("HastSet elements : " + set);
        //remove
        set.remove(2);
        System.out.println("HashSet after removing " + set);
        System.out.println("HashSet contains 2 : " + set.contains(2));
        System.out.println("Size of HashSet is : " + set.size());
        set.add(5);
        set.add(8);
        set.add(11);


        //to treavesel in HashMap
        Iterator it = set.iterator();
        System.out.println("First element of set : " + it.next());
        System.out.println("Second element of set : " + it.next());

        System.out.println("Is HashSet has next element or not : " + it.hasNext());
        System.out.println("Print HashSet by using loop : ");
        while(it.hasNext()){// print 5 se hoha kyoki it ko phle se iterate kra chuke hai agr suru mai ye use krenge to starting se pura print hoga
            System.out.print(it.next() + "  ");
        }
        System.out.println();
        Iterator it1 = set.iterator();
        System.out.println(it1.next());
        System.out.println(it1.hasNext());
//        int curr = it1.next();
//        System.out.println(curr);




    }
}
