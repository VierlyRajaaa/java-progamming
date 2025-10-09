package tugas_pratikum;
import java.util.Scanner;
public class tugas_4 {
    public static void main(String[] args) {
         String PIN_BENAR = "123456";
         int MAKS_PERCOBAAN = 3;
        int percobaan = 0;
        Scanner input = new Scanner(System.in);

        while (percobaan < MAKS_PERCOBAAN) {
            System.out.print("Masukkan PIN (6 digit): ");
            String pin = input.nextLine();

            boolean valid = true;
            if (pin.length() != 6) {
                System.out.println("\nInput tidak valid! PIN harus berupa 6 digit angka.\n");
                continue;
            }
            if (pin.equals(PIN_BENAR)) {
                System.out.println("\nSelamat datang! Transaksi dapat dilanjutkan.");
                input.close();
                return; 
            } else {
                percobaan++;
                int sisa = MAKS_PERCOBAAN - percobaan;

                if (sisa > 0) {
                    System.out.println("PIN salah. Sisa percobaan: " + sisa + "\n");
                } else {
                    System.out.println("Kartu diblokir. Silakan hubungi bank.");
                }
            }
        }

        input.close();
    }
}
