
package bean;

public class Kisi {

    private int kisiID;
    private String kisiAd;
    private String kisiSoyad;
    private String kisiCepTel;
    private String kisiAdres;
    private String kisiKimlikNo;

   
    public Kisi() {
    
    }
    
    public Kisi(String kisiAd,String kisiSoyad,String kisiCepTel,String kisiAdres,String kisiKimlikNo){
        
        this.kisiAd=kisiAd;
        this.kisiSoyad=kisiSoyad;
        this.kisiCepTel=kisiCepTel;
        this.kisiAdres=kisiAdres;
        this.kisiKimlikNo=kisiKimlikNo;
    }
    
    public Kisi(int kisiID,String kisiAd,String kisiSoyad,String kisiCepTel,String kisiAdres,String kisiKimlikNo){
        this.kisiID=kisiID;
        this.kisiAd=kisiAd;
        this.kisiSoyad=kisiSoyad;
        this.kisiCepTel=kisiCepTel;
        this.kisiAdres=kisiAdres;
        this.kisiKimlikNo=kisiKimlikNo;
        
    }
    
    public int getKisiID() {
        return kisiID;
    }

    public String getKisiKimlikNo() {
        return kisiKimlikNo;
    }

    public void setKisiKimlikNo(String kisiKimlikNo) {
        this.kisiKimlikNo = kisiKimlikNo;
    }

    public void setKisiID(int kisiID) {
        this.kisiID = kisiID;
    }
    
    public String getKisiAd() {
        return kisiAd;
    }

    public void setKisiAd(String kisiAd) {
        this.kisiAd = kisiAd;
    }

    public String getKisiSoyad() {
        return kisiSoyad;
    }

    public void setKisiSoyad(String kisiSoyad) {
        this.kisiSoyad = kisiSoyad;
    }

    public String getKisiCepTel() {
        return kisiCepTel;
    }

    public void setKisiCepTel(String kisiCepTel) {
        this.kisiCepTel = kisiCepTel;
    }

    public String getKisiAdres() {
        return kisiAdres;
    }

    public void setKisiAdres(String kisiAdres) {
        this.kisiAdres = kisiAdres;
    }
    
}

