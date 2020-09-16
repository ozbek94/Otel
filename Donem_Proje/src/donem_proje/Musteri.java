/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donem_proje;

/**
 *
 * @author User
 */
public class Musteri {
    private String ad;
    private String soyad;
    private int yas;
    private int tc;
    private int tel_no;
    private int oda_no;
    private int gun_sayisi;
    private int bakiye;

    public Musteri(int bakiye) {
        this.bakiye = bakiye;
    }
    
    public Musteri( String ad, String soyad, int yas, int tc, int tel_no, int oda_no, int gun_sayisi, int bakiye) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.tc = tc;
        this.tel_no = tel_no;
        this.oda_no = oda_no;
        this.gun_sayisi = gun_sayisi;
        this.bakiye = bakiye;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getTc() {
        return tc;
    }

    public void setTc(int tc) {
        this.tc = tc;
    }

    public int getTel_no() {
        return tel_no;
    }

    public void setTel_no(int tel_no) {
        this.tel_no = tel_no;
    }

    public int getOda_no() {
        return oda_no;
    }

    public void setOda_no(int oda_no) {
        this.oda_no = oda_no;
    }

    public int getGun_sayisi() {
        return gun_sayisi;
    }

    public void setGun_sayisi(int gun_sayisi) {
        this.gun_sayisi = gun_sayisi;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    @Override
    public String toString() {
        return "Musteri{"  + ", ad=" + ad + ", soyad=" + soyad + ", yas=" + yas + ", tc=" + tc + ", tel_no=" + tel_no + ", oda_no=" + oda_no + ", gun_sayisi=" + gun_sayisi + ", bakiye=" + bakiye + '}';
    }

    

  

    
}
