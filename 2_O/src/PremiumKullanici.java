public class PremiumKullanici extends Kullanici{
    @Override
    public double getToplamTutar(double fiyat){
        return fiyat*0.9;
    }
}
