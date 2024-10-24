import java.util.Scanner

public class Nomor2{
    public static void main(String[] args){
    String Labubu, Jenglot, Voodo, barang;
        double harga = 0;
        double diskon = 0;

        System.out.print("Masukan nama produk [Labubu/Jenglot/kita]: ");
        Labubu = scanner.next();
        System.out.print("Masukan nama produk [Labubu/Jenglot/kita]: ");
        Jenglot= scanner.nextInt();
        System.out.print("Masukan nama produk [Labubu/Jenglot/kita]: ");
        Labubu = scanner.next();

        switch (barang) {
            case "Labubu":
              harga += 300000;
              break;
            case "Jenglot":
              harga += 250000;
              break;
            case "Voodo":
              harga += 200000;
              break;
            default:
            System.out.println("Input lagi (Y/N)?: ");

          }

        if (harga >500000) {
            diskon = harga*0.10;
        } else if (harga >=100000) {
            diskon = harga*0.15;
        }
    }
}
