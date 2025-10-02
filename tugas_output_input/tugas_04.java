
import javax.swing.JOptionPane;
public class tugas_04 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Inputkan Nama: ");
        String nis = JOptionPane.showInputDialog("Inputkan NISN: ");
        int umur =  Integer.parseInt(JOptionPane.showInputDialog("Inputkan Umur: "));

        System.out.println("Nama Panjang" + name);
        System.out.println("NISN" + nis);
        System.out.println("UMUR" + umur);
    }
}
