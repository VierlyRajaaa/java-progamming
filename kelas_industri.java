import javax.swing.JOptionPane;
public class kelas_industri;
    public static void main(String[] args) {
        
        String platnomor = JOptionPane.showInputDialog("Inputkan kode plat nomor kendaraan");

        switch(platnomor){
            case "P":
            System.out.println("Jember , Banyuwangi , Bondowoso , Situbondo");
            
            case"N":
            System.out.println("Lumajang , Probolinggo , pasuruan , Malang");
            
            case"L":
            System.out.println("Surabaya");
            
            
            default:
            System.out.println("Yang Anda inputkan tidak tersedia dalam data kami");
        }
    }
