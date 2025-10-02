import java.io.*;
public class tugas_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Inputkan nama sekolah: ");
        String namasekolah = input.readLine();

        System.out.print("Inputkan jarak rumah ke sekolah: ");
        double jarak = Double.parseDouble(input.readLine());

        System.out.print("Inputkan plat nomor kendaraan: ");
        char kodeplat = input.readLine().charAt(0);

        System.out.print("Inputkan anak ke berapa: ");
        int anak = Integer.parseInt(input.readLine());

        //Menampilkan Output
        System.out.println("\n==========Output==========");
        System.out.println("Nama Sekolah: " + namasekolah);
        System.out.println("Jarak Dari Sekolah: " + jarak);
        System.out.println("Plat Nomor Kendaraan: " + kodeplat);
        System.out.println("Anak Ke Berapa: " + anak);
    }
}
