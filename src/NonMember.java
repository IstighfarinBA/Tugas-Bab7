
public class NonMember extends AbstractMemberParent {

    private String keanggotaan;
    private double total;

    public NonMember(String nama, String keanggotaan, double tariflayanan, double tarifproduk) {
        super(nama, keanggotaan, tariflayanan, tarifproduk);//pemanggilan attribut pada parent class
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

}
