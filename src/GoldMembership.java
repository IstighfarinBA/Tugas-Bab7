public class GoldMembership extends AbstractMemberParent {

    private String member;
    private double total;
    public GoldMembership (String nama, String member, double tariflayanan, double tarifproduk){
        super(nama,member,tariflayanan,tarifproduk); //pemanggilan attribut pada parent class
    }
    
    public void tarifLayanan(){
        double diskon = tariflayanan*0.15; //mendapatkan diskon sebanyak 15%
        tariflayanan-=diskon;
    }
    public void tarifProduk(){
        double diskon = tarifproduk*0.1; //semua member mendapat diskon 10%
        tarifproduk-=diskon;
    }
    //pembuatan method getter baru
    public String getKeanggotaan() {
        return member;
    }

    public double getTariflayanan() {
        return tariflayanan;
    }
    public double TotalBiaya (){
        return total = tariflayanan+tarifproduk;
    }
    

    public double getTarifproduk() {
        return tarifproduk;
    }
    public void displayMessage (){
        System.out.println("\t====NOTA PELANGGAN SALON BAFARCORP====");
        System.out.println("Diskon 15% untuk Jasa");
        System.out.println("Diskon 10% untuk produk");
        System.out.println("Nama pelanggan            : "+nama);
        System.out.println("Status membership         : Premium Membership");
        System.out.println("Biaya Jasa                : Rp "+tariflayanan);
        System.out.println("Biaya Produk              : Rp "+tarifproduk);
        System.out.println("=======================================");
        System.out.println("TOTAL PEMBAYARAN          : Rp. "+TotalBiaya());
        System.out.println();
        System.out.println("=====TERIMA KASIH TELAH MENJADI PELANGGAN KAMI=====");
    }

}
