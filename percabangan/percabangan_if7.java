package percabangan;
import java.util.Scanner;

public class percabangan_if7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inputkan Angka pertama");
        // untuk menginputkan angka pertama
        int angka1 = input.nextInt();

        System.out.println("Inputkan Angka Kedua");
        // untuk menginputkan angka kedua
        int angka2= input.nextInt();

        if (angka1 > angka2){
            System.out.println( " Angka pertama:" + angka1 +"lebih besar dari angka kedua:" + angka2);
            // untuk menjumlahkan angka 1 dari angka 2
        } else {
            System.out.println("Angka kedua:" + angka2 + "lebih besar dari angka pertama:" + angka1);
            // untuk menjumlahkan angka 2 dari angka 1
        }
    }
    
}
