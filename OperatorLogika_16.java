import java.util.Scanner; 
public class OperatorLogika_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("jawab pertanyaan dengan memasukkan (ya) atau (tidak)");
        System.out.println("Apakah nilai akademik kamu lebih dari 70?");
        String a = input.next();
        System.err.println("Apakah ketakdiran kamu selama 1 semester kurang dari 10?");
        String b = input.next();
         
        String hasil;

        //contoh operator ternary
        hasil = a.equals("ya") && b.equals("ya")  ? "selamat kamu naik kelas".... :)" : "Semangat belajar lagi;
        System.out.println(hasil);

        hasil = a.equals("tidak") && b.equals("tidak") ? " Maaf, kamu tidak naik kelas" : "Pertahankan nilaimu";
        System.out.println(hasil);

    }
    
}
