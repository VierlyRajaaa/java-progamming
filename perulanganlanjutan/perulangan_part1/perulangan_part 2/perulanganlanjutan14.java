import java.util.Scanner;

public class perulanganlanjutan14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tinggi piramida: ");
        int tinggi = input.nextInt();

        System.out.println("Output: ");
        for (int i = tinggi; i >= 1; i--) {
            for (int j = 1; j <= tinggi - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
