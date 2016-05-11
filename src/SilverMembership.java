public class SilverMembership extends AbstractMemberParent{
 
    private String keanggotaan;
    private double total;
    
    public SilverMembership (String nama, String keanggotaan, double tariflayanan, double tarifproduk){
        super(nama,keanggotaan,tariflayanan,tarifproduk);
    }

    
    //pembuatan method getter baru
    public String getNama() {
        return nama;
    }

    public String getKeanggotaan() {
        return keanggotaan;
    }

    public double getTariflayanan() {
        return tariflayanan;
    }

    public double getTarifproduk() {
        return tarifproduk;
    }

    public void tarifLayanan(){
        double diskon = tariflayanan*0.1; //diskon untuk silvermembership 10%
        tariflayanan=tariflayanan-diskon;
    }
    
    public void tarifProduk(){
        double diskon = tarifproduk*0.1; //diskon untuk produk salon 10%
        tarifproduk=tarifproduk-diskon;
    }
    
    public double TotalBiaya (){
        return total = tariflayanan + tarifproduk;
    }
    
    public void displayMessage (){
        System.out.println("\t====NOTA PELANGGAN SALON BAFARCORP====");
        System.out.println("Diskon 10% untuk Jasa");
        System.out.println("Diskon 10% untuk produk");
        System.out.println("Nama pelanggan            : "+nama);
        System.out.println("Status membership         : Silver Membership");
        System.out.println("Biaya Jasa                : Rp "+tariflayanan);
        System.out.println("Biaya Produk              : Rp "+tarifproduk);
        System.out.println("=======================================");
        System.out.println("TOTAL PEMBAYARAN          : Rp. "+TotalBiaya());
        System.out.println();
        System.out.println("=====TERIMA KASIH TELAH MENJADI PELANGGAN KAMI=====");
    }
}
