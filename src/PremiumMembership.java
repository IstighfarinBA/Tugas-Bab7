public class PremiumMembership extends AbstractMemberParent {

    private String keanggotaan;
    private double total;
    
    public PremiumMembership (String nama, String keanggotaan, double tariflayanan, double tarifproduk){
        super(nama,keanggotaan,tariflayanan,tarifproduk);//pemanggilan attribut dari super class
    }

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
        double diskon = tariflayanan*0.2;//diskon untuk premium member 20%
        tariflayanan=tariflayanan-diskon;
    }
    
    public void tarifProduk(){
        double diskon = tarifproduk*0.1;//diskon untuk produk 10%
        tarifproduk=tarifproduk-diskon;
    }
    
}
