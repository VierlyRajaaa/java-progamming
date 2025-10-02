import java.util.Scanner;
public class volumetabung {
   public static void main(String[] args) {
    Scanner input = new Scanner (System.in);

    System.out.println("Inputkan JariJari");
    Double jarijari = input.nextDouble();

    System.out.println("Inputkan TinggiTabung");
    Double tinggi =input.nextDouble();

    Double VolumeTabung = 2* 3.14 * jarijari * jarijari * tinggi;
    System.out.println("\nMaka Volume Tabung =" + VolumeTabung);


     }

}