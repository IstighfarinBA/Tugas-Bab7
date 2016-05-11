
public class NonMember extends AbstractMemberParent {

    private String keanggotaan;
    private double total;

    public NonMember(String nama, String keanggotaan, double tariflayanan, double tarifproduk) {
        super(nama, keanggotaan, tariflayanan, tarifproduk);//pemanggilan attribut pada parent class
    }

    public String getNama() {
        return nama;
    }

    public void setKeanggotaan(String keanggotaan) {
        this.keanggotaan = keanggotaan;
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

    public void tarifLayanan() {
        this.tariflayanan = tariflayanan;
    }

    public void tarifProduk() {
        double diskon = tarifproduk;
        tarifproduk = tarifproduk - diskon;
    }

    public double TotalBiaya() {
        return total = tariflayanan + tarifproduk;
    }

    public void displayMessage() {
        System.out.println("\t====NOTA PELANGGAN SALON BAFARCORP====");
        System.out.println("Nama pelanggan            : " + nama);
        System.out.println("Status membership         : Tidak Ada");
        System.out.println("Biaya Jasa                : Rp " + tariflayanan);
        System.out.println("Biaya Produk              : Rp " + tarifproduk);
        System.out.println("=======================================");
        System.out.println("TOTAL PEMBAYARAN          : Rp. " + TotalBiaya());
        System.out.println();
        System.out.println("=====TERIMA KASIH TELAH MENJADI PELANGGAN KAMI=====");
    }
}
