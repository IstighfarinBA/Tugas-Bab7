public class SilverMembership extends AbstractMemberParent{
 
    private String keanggotaan;
    private double total;
    
    public SilverMembership (String nama, String keanggotaan, double tariflayanan, double tarifproduk){
        super(nama,keanggotaan,tariflayanan,tarifproduk);
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
    
}
