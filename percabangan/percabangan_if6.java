package percabangan;
import javax.swing.JOptionPane;

public class percabangan_if6 {
    public static void main(String[] args) {
        String platnomor = JOptionPane.showInputDialog("Inputkan kode plat nomor kendaraan");

        switch(platnomor){
            case "P":
            System.out.println("Jember , Banyuwangi , Bondowoso , Situbondo");
            //plat p jember banyuwangi bondowoso situbondo
            case"N":
            System.out.println("Lumajang , Probolinggo , pasuruan , Malang");
            // plat n lumajang probolinggo pasuruan malang
            case"L":
            System.out.println("Surabaya");
            // plat L surabaya
            // plat w sidoarjo
            default:
            System.out.println("Yang Anda inputkan tidak tersedia dalam data kami");
        }
    }
    
}
