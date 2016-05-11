
import java.util.Scanner;

public class MainSalonBahtiar {

    private static String name, member;
    private static double hargaJasa, hargaProduk;

    public static void main(String[] args) {
        int pil;
        //penginstasiasi objek baru dari class-class lain dan konstruktornya
        PremiumMembership premium = new PremiumMembership(name, member, hargaJasa, hargaProduk);
        GoldMembership goldmem = new GoldMembership(name, member, hargaJasa, hargaProduk);
        SilverMembership silvermem = new SilverMembership(name, member, hargaJasa, hargaProduk);
        NonMember non = new NonMember(name, member, hargaJasa, hargaProduk);
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("\t====SALON KECANTIKAN BAFARCORP====");
            System.out.println("Menu");
            System.out.println("1. Premium Membership");
            System.out.println("2. Gold Membership");
            System.out.println("3. Silver Membership");
            System.out.println("4. Non Membership");
            System.out.println("5. Exit");
            System.out.print("Masukkan pilihan  : ");
            pil = in.nextInt();
            System.out.println();
            switch (pil) {
                case 1:
                    System.out.println("\t\t===PREMIUM MEMBERSHIP===");
                    System.out.print("Nama Pelanggan                   : ");
                    name = in.next();
                    System.out.print("Masukkan Harga Jasa Pelayanan    : ");
                    hargaJasa = in.nextDouble();
                    System.out.print("Masukkan Harga Produk Kecantikan : ");
                    hargaProduk = in.nextDouble();
                    premium.setNama(name);
                    premium.setTariflayanan(hargaJasa);
                    premium.setTarifproduk(hargaProduk);
                    premium.tarifLayanan();
                    premium.tarifProduk();
                    System.out.println("");
                    premium.displayMessage();
                    System.out.println("");
                    break;
                case 2:
                    
                case 3:
                   
                case 4:
                   
                case 5:
                    System.out.println("\t====TERIMA KASIH ATAS KUNJUNGAN ANDA====");
                    break;
                default:
                    System.out.println("Masukkan Anda Salah,Tolong Coba Lagi..");

            }
        } while (pil != 5);
    }

}
