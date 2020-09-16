
package donem_proje;


public class Otel {
    private String isim;
    private String sahibi;
    private String adres;
    private int yildiz;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSahibi() {
        return sahibi;
    }

    public void setSahibi(String sahibi) {
        this.sahibi = sahibi;
    }

    public int getYildiz() {
        return yildiz;
    }

    public void setYildiz(int yildiz) {
        this.yildiz = yildiz;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public Otel(String isim, String sahibi, String adres, int yildiz) {
        this.isim = isim;
        this.sahibi = sahibi;
        this.adres = adres;
        this.yildiz = yildiz;
    }
    
}
