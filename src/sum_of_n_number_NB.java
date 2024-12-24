import java.util.Scanner;
public class sum_of_n_number_NB {
    public static void main(String[] args) {
        System.out.println("SUM OF N NUMBER \n");
        System.out.print("Enter the number of n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Here's how its calculate \n");
        for (int i = 1 ; i <= n ; i++){
           for(int j= 1 ; j <= i ; j++ ){
               if (j>1){
                   System.out.print(" + ");
               }
               System.out.print(j );
           }
            System.out.print(" = ");
           int s = 0;
           for (int k = 1 ; k <= i ; k++){
               s = s + k;
           }
            System.out.println(s);
        }
    }
}
