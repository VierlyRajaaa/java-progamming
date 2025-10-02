package percabangan;
import java.util.Scanner;

public class percabangan_if2 {
    public static void main(String[] args) {
        // untuk memainkan run java tersebut
    Scanner input = new Scanner (System.in);
    // mendeklarasikan sebuah tempat data
    int belanja;
    // mendeklarasikan sebuah file menyimpan data

    System.out.print("Inputkan total belanja Anda: ");
    //membuat percabangan mengambil dataa sesuatu
    belanja = input.nextInt();
    //mendeklarasikan sebuah wadah untuk menyimpan filee

    if (belanja >=5000000) {
        System.out.println("Selamat ! Anda mendapatkan Hadiah gantungan kunci");
        //untuk mendeklarasikan tempat yang menyimpan data
    } else {
        int selisihbelanja = 5000000 -  belanja;
        //melarasikan data disimpan di flashdisk
        System.out.println("Belanja anda kurang dari Rp 5000000");
        //mencatumkan barang harga barang
        System.out.println("Silahkan tambah lagi belanjanya senilai Rp." + selisihbelanja);
        // mencatumkan harga barang tersebut
        System.out.println("Agar bisa mendapatkan bonus gantungan kunci");
        //untuk mendapat bonusan gantungan kunci
    }
    }


    
}
