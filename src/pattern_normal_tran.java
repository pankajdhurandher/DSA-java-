import java.util.Scanner;
public class pattern_normal_tran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The rquried pattern is : ");
        for (int i = 0 ; i <= n ; i++){
            for (int j = 0 ; j <= i ; j++){
                System.out.print(" ");
            }
            for (int k = i ; k <= n ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i =0 ; i <= n ; i++){
            for(int k = i ; k <= n ; k++){
                System.out.print(" ");
            }
            for (int j = 0 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}




//    Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
//        for (int i = 0 ; i <=n; i++){
//        for (int j = 0 ; j < n-i ; j++){
//            System.out.print("* ");
//        }
//        System.out.println();
//        int xyz = 0;
//        for (int j = n-i ; j < 0 ; j--){
//            System.out.print(xyz+" ");
//            xyz++;
//        }
//        System.out.println();
//    }
//}