
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
		    //case untuk kasus member Premium membership
                    System.out.println("\t====LIST PRODUK KECANTIKAN KAMI===");
                    System.out.println("\tShampo Creambath       Rp.200.000");
                    System.out.println("\tLulur Ayu Kecantikan   Rp.400.000");
                    System.out.println("\tPesona wangi parfum    Rp.100.000");
                    System.out.println("\tPesona langsing suplm  Rp. 50.000");
                    System.out.println("\tPitek Alami cantik     Rp. 25.000");
                    System.out.println("");
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
		    //case untuk kasus member GOld membership
                    System.out.println("\t====LIST PRODUK KECANTIKAN KAMI===");
                    System.out.println("\tShampo Creambath       Rp.200.000");
                    System.out.println("\tLulur Ayu Kecantikan   Rp.400.000");
                    System.out.println("\tPesona wangi parfum    Rp.100.000");
                    System.out.println("\tPesona langsing suplm  Rp. 50.000");
                    System.out.println("\tPitek Alami cantik     Rp. 25.000");
                    System.out.println("");
                    System.out.println("\t\t===GOLD MEMBERSHIP===");
                    System.out.print("Nama Pelanggan                   :");
                    name = in.next();
                    System.out.print("Masukkan Harga Jasa Pelayanan    : ");
                    hargaJasa = in.nextDouble();
                    System.out.print("Masukkan Harga Produk Kecantikan : ");
                    hargaProduk = in.nextDouble();
                    goldmem.setNama(name);
                    goldmem.setTariflayanan(hargaJasa);
                    goldmem.setTarifproduk(hargaProduk);
                    goldmem.tarifLayanan();
                    goldmem.tarifProduk();
                    System.out.println("");
                    goldmem.displayMessage();
                    System.out.println("");
                    break;
                case 3:
		    //case untuk kasus member silver membership
                    System.out.println("\t====LIST PRODUK KECANTIKAN KAMI===");
                    System.out.println("\tShampo Creambath       Rp.200.000");
                    System.out.println("\tLulur Ayu Kecantikan   Rp.400.000");
                    System.out.println("\tPesona wangi parfum    Rp.100.000");
                    System.out.println("\tPesona langsing suplm  Rp. 50.000");
                    System.out.println("\tPitek Alami cantik     Rp. 25.000");
                    System.out.println("");
                    System.out.println("\t\t===SILVER MEMBERSHIP===");
                    System.out.print("Nama Pelanggan                   :");
                    name = in.next();
                    System.out.print("Masukkan Harga Jasa Pelayanan    : ");
                    hargaJasa = in.nextDouble();
                    System.out.print("Masukkan Harga Produk Kecantikan : ");
                    hargaProduk = in.nextDouble();
                    silvermem.setNama(name);
                    silvermem.setTariflayanan(hargaJasa);
                    silvermem.setTarifproduk(hargaProduk);
                    silvermem.tarifLayanan();
                    silvermem.tarifProduk();
                    System.out.println("");
                    silvermem.displayMessage();
                    System.out.println("");
                    break;
                case 4:
		    //untuk kasus non-member dan tanpa diskon 
                    System.out.println("\t====LIST PRODUK KECANTIKAN KAMI===");
                    System.out.println("\tShampo Creambath       Rp.200.000");
                    System.out.println("\tLulur Ayu Kecantikan   Rp.400.000");
                    System.out.println("\tPesona wangi parfum    Rp.100.000");
                    System.out.println("\tPesona langsing suplm  Rp. 50.000");
                    System.out.println("\tPitek Alami cantik     Rp. 25.000");
                    System.out.println("");
                    System.out.println("\t\t===NON-MEMBERSHIP===");
                    System.out.print("Nama Pelanggan                   :");
                    name = in.next();
                    System.out.print("Masukkan Harga Jasa Pelayanan    : ");
                    hargaJasa = in.nextDouble();
                    System.out.print("Masukkan Harga Produk Kecantikan : ");
                    hargaProduk = in.nextDouble();
                    non.setNama(name);
                    non.setTariflayanan(hargaJasa);
                    non.setTarifproduk(hargaProduk);
                    non.tarifLayanan();
                    non.tarifProduk();
                    System.out.println("");
                    non.displayMessage();
                    System.out.println("");
                    break;
                case 5:
		    //close program
                    System.out.println("\t====TERIMA KASIH ATAS KUNJUNGAN ANDA====");
                    break;
                default:
		    //jika tidak memenuhi masukan pada pilihan menu
                    System.out.println("Masukkan Anda Salah,Tolong Coba Lagi..");

            }
        } while (pil != 5);
    }

}
