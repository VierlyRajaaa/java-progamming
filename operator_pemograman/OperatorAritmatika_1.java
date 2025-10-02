package operator_pemograman;
// untuk menaruh sebuah wadah
import java.util.Scanner;
// untuk menjumlahkan nilai tersebut

public class OperatorAritmatika_1 {
    //sebuah wadah untuk menaruh sebuah perintah inpuy
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        //untuk sebuah tempat logaritme

        System.out.println("inputkan alas:");
        //alas tinggi 0.5
        int alas =input.nextInt();
        //digunakan untuk mendeklarasikan sebuah


        System.out.println("Inputkan tinggi:");
        // untuk menampilkan input yang di isi
        int tinggi =input.nextInt();
        //untuk menampilkan layar

        double luasSegitiga =0.5 * (alas * tinggi );
        //untuk mendeklarasikan nahasa pemograman
        System.out.println("\nMaka Luas Segitiga = " + luasSegitiga);
        //untuk menaruh bahasa pemograman
    }
    
}
