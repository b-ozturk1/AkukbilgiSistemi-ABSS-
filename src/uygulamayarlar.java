public class uygulamayarlar {
    private Integer cid;
    private String ad;
    private String soyad;
    private String kullanıcıAdı;
    private String e_posta;
    private String telefon;
    private String okul_no;
    private String durum;
    private String şifre;
    private int uid;

    public uygulamayarlar() {
    }

    
    
    public uygulamayarlar(Integer cid, String ad, String soyad, String kullanıcıAdı, String e_posta, String telefon, String okul_no, String durum, String şifre, Integer uid) {
        this.cid = cid;
        this.ad = ad;
        this.soyad = soyad;
        this.kullanıcıAdı = kullanıcıAdı;
        this.e_posta = e_posta;
        this.telefon = telefon;
        this.okul_no = okul_no;
        this.durum = durum;
        this.şifre = şifre;
        this.uid = uid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
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

    public String getKullanıcıAdı() {
        return kullanıcıAdı;
    }

    public void setKullanıcıAdı(String kullanıcıAdı) {
        this.kullanıcıAdı = kullanıcıAdı;
    }

    public String getE_posta() {
        return e_posta;
    }

    public void setE_posta(String e_posta) {
        this.e_posta = e_posta;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getOkul_no() {
        return okul_no;
    }

    public void setOkul_no(String okul_no) {
        this.okul_no = okul_no;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }

    public String getŞifre() {
        return şifre;
    }

    public void setŞifre(String şifre) {
        this.şifre = şifre;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
    
    
    
}
    


   