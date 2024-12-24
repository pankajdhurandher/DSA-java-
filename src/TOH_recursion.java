public class TOH_recursion {

    public static void toh(int n, char from, char to, char aux) {
        // Your code here
        if(n==0){
            return;
        }
        toh(n-1 , from , aux , to);
        System.out.println("Move disk "+n+" from " + from + " to " + to);
        toh(n-1 , aux , to , from);
    }

    public static void main(String[] args) {
        toh(3 , 'A' , 'B' , 'C');
    }
}
