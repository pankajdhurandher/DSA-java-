import java.util.Scanner;

public class recursion {



    public static int fectNum(int n){
        if (n==1){
            return 1;
        }
        int fectnumber = n*fectNum(n-1);
        return fectnumber;
    }

    public static void printDecrising(int n){
        if (n==0){
            return;
        }
        System.out.print(n + "->");
        printDecrising(n-1);
    }

    public static void printIncreasing(int n){
        int p = 0;
        if (n==0){
            return;
        }
        System.out.print(p + "->");
        p++;
        printIncreasing(n-1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\bFactorial of a number");
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.println(fectNum(n));
        System.out.println();
        printDecrising(n);
        System.out.println();
        printIncreasing(n);
    }
}
