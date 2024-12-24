public class isPrimeNumber {
    static int isprime(int n){
        int count = 0;
        for (int i = 1 ; i <=n ; i++){
            if (n %i == 0){
                count++;
                System.out.print(i + " ");
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Factors ");
        int check = isprime(50);
        System.out.println();
        System.out.print("Prime number :");
        if (check ==2){
            System.out.println("yes it is");
        }else {
            System.out.println("nhi");
        }
    }
}
