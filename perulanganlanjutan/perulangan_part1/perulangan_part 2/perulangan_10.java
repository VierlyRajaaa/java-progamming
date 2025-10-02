package perulanganlanjutan.perulangan_part1;
import java.util.Scanner;
public class perulangan_10 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input:");
        int n = input.nextInt();

        System.out.println("Output:");
        for ( int i = 1; i <= n; i++){
            for (int j = 1; j <=n; j++){
                if ( i == 1 || i == n || j == 1 || j == n){
                    System.out.print(" *");

                }else{
                    System.out.print( "");
                    System.out.println();
                }
            }

        }
    }
    
}
