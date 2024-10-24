import java.util.Scanner;

public class Nomor1{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
        int i = 0;
        double totalTunjangan = 0;
        boolean jmlKeluargaLbhSmTiga;
        System.out.println("Jumlah Anggota Keluarga: ");
        jmlKeluargaLbhSmTiga = scanner.nextBoolean();
        System.out.println("Besar Tunjangan Kesehatan: ");
        totalTunjangan = scanner.nextDouble();

        if (i >= 3) {
            System.out.println("Besar Tunjangan Kesehatan: " + jmlKeluargaLbhSmTiga);
        } else {
        }
    }
}
