
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
            
        } while (pil != 5);
    }

}
