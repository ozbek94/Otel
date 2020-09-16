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
public class Oda {
    
    private int oda_no;
    private String oda_turu ;
    private String kalanlar ;

    public Oda(int oda_no, String oda_turu, String kalanlar) {
        this.oda_no = oda_no;
        this.oda_turu = oda_turu;
        this.kalanlar = kalanlar;
    }

    public int getOda_no() {
        return oda_no;
    }

    public void setOda_no(int oda_no) {
        this.oda_no = oda_no;
    }

    public String getOda_turu() {
        return oda_turu;
    }

    public void setOda_turu(String oda_turu) {
        this.oda_turu = oda_turu;
    }

    public String getKalanlar() {
        return kalanlar;
    }

    public void setKalanlar(String kalanlar) {
        this.kalanlar = kalanlar;
    }
    
    

   
  
        
}
