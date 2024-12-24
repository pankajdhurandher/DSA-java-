import java.util.Scanner;

public class VT_qus_1 {
    public static void main(String[] args) {
        int G , B ,S;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of gold medals : ");
        int Gm = sc.nextInt();
        System.out.println();
        System.out.print("Enter the number of Silver medals : ");
        int Sm = sc.nextInt();
        System.out.println();
        System.out.print("Enter the number of Bronze medals : ");
        int Bm = sc.nextInt();
        System.out.println();
        int sum = 0;
        sum += Gm;
        sum += Sm;
        sum += Bm;
        sum = 15 - sum;
        System.out.println("The total number of medals required to make chef happy : " + sum );

    }
}
