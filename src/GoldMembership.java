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
}
