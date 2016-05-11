
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
        
    }

}
