package tugas_pratikum ;
import java.util.Scanner;
public class tugas_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int kapasitas = 10;

        System.out.print("Masukkan jumlah pasien yang datang: ");
        int jumlahPasien = input.nextInt();

        int pasienDilayani = 0; // menghitung pasien yang sudah keluar antrean
        System.out.println("\n=== Situalisasi Antrean Klinik ===");

        for (int i = 1; i <= jumlahPasien; i++) {
            if (i - pasienDilayani > kapasitas) {
                pasienDilayani= 0; // menghitung pasien yang sudah keluar antrean
                System.out.println("Antrean penuh! Pasien nomor " + pasienDilayani +" selesai dilayani.");
                System.err.println("Pasian nomor " +i+ "masuk antrean (total antrean:) + (i - pasienDilayani) + ");
            } else {
                System.out.println("\npasien yang masih dalam antrean: ");
                pasienDilayani++;
                System.out.println("Pasien " + pasienkeluar + " selesai dilayani dan keluar dari antrian.");
                System.out.println("Pasien nomor " + i);

                }
        input.close();
            
        }
    }
}

