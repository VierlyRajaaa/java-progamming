package operator_pemograman;
//untuk menaruh bahasa pemograman coding sebuah wadah untuk menaruh
import java.io.*;
//untuk membaca input dan output
public class operatorAritmatika_2 {
    //sebuah untuk wadah untuk menaruh
    //metod utama di java
    public static void main(String[] args) throws IOException {
        //digunakan untuk mendeklarasikan untuk sebuah kelas yang dapat
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("inputkan nilai a: ");
        int a = Integer.parseInt(input.readLine());
        //untuk menampilkan input yang tinggi
        int angka1;//untuk mendeklarasikan angka 1
        int angka2 ;// untuk mendeklarasikan angka 2
        int angka3  ;//untuk mendeklarasikan angka 3
        int angka4 ;//untuk mendeklarasikan angka 4
      //fungsi int adalah untuk mengembalikan bilangan bulat
     
        System.out.print("Inputkan nilai b: ");
        int b = Integer.parseInt(input.readLine());
        //untuk pembagian dari angka

        System.out.print("Inputkan nilai c: ");
        int c = Integer.parseInt(input.readLine());
        //untuk mengurangkan dari dua nilai
        int hasil = a + b * c ;
        // untuk menghasilkan totalnya tersebut

        System.out.println("\nMaka hasil perhitungan = " + hasil );
        //untuk menghasilkan di layar
        //untuk sebuah bahasa pemograman coding
        //untuk menghasilkan nilai input dan outputnya

    } 
}
