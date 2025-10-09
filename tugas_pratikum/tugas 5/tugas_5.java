package tugas_pratikum;

public class tugas_5 {
    public static void main(String[] args) {
        String[] karyawan = {"Andi", "Budi", "Citra", "Dina", "Eka"};
        int hari = 1;

        System.out.println("=== Jadwal Shift Harian ===");
        for (int i = 0; i < karyawan.length; i++) {
            for (int j = i + 1; j < karyawan.length; j++) {
                System.out.println("Hari " + hari + ": " + karyawan[i] + " dan " + karyawan[j]);
                hari++;
            }
        }
    }
}
