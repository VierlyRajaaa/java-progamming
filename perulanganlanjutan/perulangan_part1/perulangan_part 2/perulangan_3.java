package perulanganlanjutan.perulangan_part1;

public class perulangan_3 {
    public static void main(String[] args) {
        int deret = 1;
        int deretsebelumnya =1;
        int penjumlah = 0;

        while (true) { 
            System.out.println("deret +   ");
            deret = deretsebelumnya + penjumlah;
            penjumlah =deretsebelumnya;
            if (deret >= 200){
                break;
            }

        }
    }
}
