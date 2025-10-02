package percabangan;
import java.util.Scanner;

public class percabangan_if8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inputkan Angka Pertama:");
        // untuk menginputkan angka pertama
        int angka1 = input.nextInt();

        System.out.println("Inputkan Angka Kedua");
        // untuk menginputkan angka kedua
        int angka2 = input.nextInt();

        if (angka1 % 2 == 0) {
            System.out.println("Angka pertama: " + angka1 + " adalah BILANGAN GENAP");
            // untuk menjumlahkan angka pertama adalah bilangan genap
        } else {
            System.out.println("Angka pertama: " + angka1 + "adalah BILANGAN GANJIL");
            //untuk menjumlahkan angka pertama adalah  bilangan ganjil
        }

        if (angka2 % 2 == 0) {
          System.out.println("Angka Kedua:" + angka2 + " adalah BILANGAN GENAP");
          // untuk menjumlahkan angka kedua adalah bilangan genap
        } else {
           System.out.println("Angka Kedua:" + angka2 + " adalah BILANGAN GANJIL");
           // untuk menjumlahkan angka kedua adalah bilangan ganjil
        }
        }
    }
