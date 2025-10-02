import java.util.Scanner;

public class OperatorLogika_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // seleksi pegawai mensyaratkan tinggi minimal 160 dan nilai UN minimal 80
        // variabel ini adalah tinggi dan nilai UN dari calon pegawai yang ikut seleksi 
        System.out.print("Inputkan tinggi badan calon pegawai:");
        int tinggi = input.nextInt();
        System.out.print("Inputkan nilai UN calon pegawai");
        int nilaiUN= input.nextInt();

        // karena aturanya tinggi minimal 160 dan nilai UN minimal 80
        // maka aturan tersebut menjadi pembanding
        // yang mana kedua syarat tsb dihubungkan dengan operator logika AND
        boolean hasilseleksi = (tinggi >= 160) && (nilaiUN >= 80);
        System.out.println ("Hasil seleksi pegawai :" + hasilseleksi);
    }
}
