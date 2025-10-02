import javax.swing.JOptionPane;

public class seleksi_siswa {
    public static void main(String[] args) {
        // input nilai rapor
        String nilaiInput =JOptionPane.showInputDialog("Masukkan nilai rapor:");
        int nilai = Integer.parseInt(nilaiInput);

        // input umur
        String umurInput =JOptionPane.showInputDialog("Masukkan Umur:");
        int umur = Integer.parseInt(umurInput);

        // Seleksi berdasarkan aturan
        boolean lulus = (nilai >=78) && (umur >= 15);

        // Output hasil seleksi
        JOptionPane.showMessageDialog("Hasil seleksi " + lulus);
    }
    
}
