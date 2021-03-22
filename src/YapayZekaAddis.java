
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class YapayZekaAddis {
    
    public void uyg(){
    
        ImageIcon icon = new ImageIcon("src/Robotikon.png");
        ImageIcon icon2 = new ImageIcon("src/üzgün robot.png");
        ImageIcon ekle = new ImageIcon("src/add.png");
        ImageIcon sil = new ImageIcon("src/delete.png");
        ImageIcon düzenle = new ImageIcon("src/edit.png");
        String Y = "Yenile Çalışmıyor";
        String y = "yenile çalışmıyor";
        String E = "Ekle Çalışmıyor";
        String e = "ekle çalışmıyor";
        String D = "Düzenle Çalışmıyor";
        String d = "düzenle çalışmıyor";
        String S = "Sil Çalışmıyor";
        String s = "sil çalışmıyor";
        String H = "Hiçbiri";
        String h = "hiçbiri";
        String K = "Kişiler Gözükmüyor";
        String k = "kişiler gözükmüyor";
        
        
        int input = JOptionPane.showConfirmDialog(null, "Merhaba Ben ADDİS. Siz değerli klüp yöneticilerimiz için hizmetteyim. Yardım Almak için 'YES' Tıklayınız.","Ben Addis",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon);
if(input == 0){
                
            String isim;
            isim = JOptionPane.showInputDialog(null, "Size yardım etmek için can atıyorum '??' ama daha isminizi bilmiyorum isminizi öğrenebilirmiyim ?");
            
            int Adım1 = JOptionPane.showConfirmDialog(null, "Memnun oldum."+isim+" Tam olarak buraya neden geldiğini anlamadım. Şuanda Üzerinde bulunduğun panel hakkında yardım mı almak istiyorsun evetse : 'YES'","Ben Addis",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon);
            if(Adım1 == 0){
                
                String Adım2 = JOptionPane.showInputDialog(null, "H-mm Anlıyorum aslında sistemin çok karmaşık olmadığını düşünüyorum. Peki Sorun ne ?(Kişiler Gözükmüyor, Ekle Çalışmıyor, Düzenle Çalışmıyor, Sil Çalışmıyor, Yenile Çalışmıyor, Hiçbiri)");
                    if(Adım2.equals("Kişiler Gözükmüyor") && Adım2.equals("kişiler gözükmüyor")){
                        
                        int Adım4 = JOptionPane.showConfirmDialog(null, "Demek Kullanıcılar gözükmüyor. Acaba veritabanı kapalı olabilir mi?. Veritabanı açık veya kapalı olduğunu kontrol ediniz. Açıksa = 'YES' , Kapalıysa = 'NO'","Ben Addis",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon);
                        if(Adım4 == 0){
                        
                        }
                        else{
                        
                        }
                    }
                    else if (Adım2.equals(E) && Adım2.equals(e)){
                        
                        int Adım5 = JOptionPane.showConfirmDialog(null, "Peki Alttaki tabloda kullanıcıları gözüküyor mu? evet = 'YES' ; hayır = 'NO'","Ben Addis",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, ekle);
                        if(Adım5 == 0){
                        
                        }
                        else{
                        
                        }
                    }
                    else if (Adım2.equals(D) && Adım2.equals(d)){
                        int Adım6 = JOptionPane.showConfirmDialog(null, "Peki Alttaki tabloda kullanıcıları gözüküyor mu? evet = 'YES' ; hayır = 'NO'","Ben Addis",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, düzenle);
                        if(Adım6 == 0){
                        
                        }
                        else{
                        
                        }
                    }
                    else if(Adım2.equals(S) && Adım2.equals(s)){
                        int Adım7 = JOptionPane.showConfirmDialog(null, "Peki Alttaki tabloda kullanıcıları gözüküyor mu? evet = 'YES' ; hayır = 'NO'","Ben Addis",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, sil);
                        if(Adım7 == 0){
                        
                        }
                        else{
                        
                        }
                    }
                    else if(Adım2.equals(y) && Adım2.equals(Y)){
                        JOptionPane.showMessageDialog(null, "Evvvvvet!. Bu sorunun geleceğini biliyordum Sayın ||--"+isim+"--||. Aslında her işlemden sonra sayfa kendini yeniliyor ancak ne olur ne olmaz işimiz garanti olsun diye bende butonunu kattım :D","Ben Addis",1);
                    }
                    else if(Adım2.equals(H) && Adım2.equals(h)){
                        
                        int Adım8 = JOptionPane.showConfirmDialog(null, "Anlamadım tam olarak ne istiyorsun benden? Yoksa benle sohbet etmek mi istiyorsun ? :)","Ben Addis",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon);
                        if(Adım8 == 0){
                        
                        }
                        else{
                        
                        }
                    
                    }
                    else{
                        
                    }
                
            }
            else{
                int Adım3 = JOptionPane.showConfirmDialog(null, "Bu Panel Üzerinde değil demek. Ozaman Uygulamayla alakalı bir sorun mu var?","Ben Addis",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon);
                if (Adım3 == 0){
                
                }
                else{
                
                }
            }
            
        }
else{
        
            JOptionPane.showConfirmDialog(null, "Ozaman Ben gidiyorum. Elbet başka yardım edebileceğim insanlar vardır.","Ben Addis Gidiyor",JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE, icon2);
            
        }
        
    }
    
    
}
