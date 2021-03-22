
public class şifredeğiştir {
    private Integer id;
    private String Özelkod;
    private String Şifre1;
    private String Şifre2;


    public şifredeğiştir() {
    }

    public şifredeğiştir(Integer id, String Özelkod, String Şifre1, String Şifre2) {
        this.id = id;
        this.Özelkod = Özelkod;
        this.Şifre1 = Şifre1;
        this.Şifre2 = Şifre2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getÖzelkod() {
        return Özelkod;
    }

    public void setÖzelkod(String Özelkod) {
        this.Özelkod = Özelkod;
    }

    public String getŞifre1() {
        return Şifre1;
    }

    public void setŞifre1(String Şifre1) {
        this.Şifre1 = Şifre1;
    }

    public String getŞifre2() {
        return Şifre2;
    }

    public void setŞifre2(String Şifre2) {
        this.Şifre2 = Şifre2;
    }


}