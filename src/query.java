
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class query {
    
    public void insertContact(uygulamayarlar uyg){
        
        boolean contactIsCreated = true;
        
        Connection con = My_CNX.getConnection();
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement("INSERT INTO `kullanıcılar`( `ad`, `soyad`, `kullanıcıAdı`, `e_posta`, `telefon`, `okul_no`, `durum`, `şifre`) VALUES (?,?,?,?,?,?,?,?)");
                    ps.setString(1, uyg.getAd());
                    ps.setString(2, uyg.getSoyad());
                    ps.setString(3, uyg.getKullanıcıAdı());
                    ps.setString(4, uyg.getE_posta());
                    ps.setString(5, uyg.getTelefon());
                    ps.setString(6, uyg.getOkul_no());
                    ps.setString(7, uyg.getDurum());
                    ps.setString(8, uyg.getŞifre());
                    
                    if(ps.executeUpdate() != 0){
                        JOptionPane.showMessageDialog(null, "Yeni kullanıcı eklendi");      
                        
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Hesap oluşturulamadı!!");
                        
                    }
        } catch (SQLException ex) {
            Logger.getLogger(query.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
        public void updateContact(uygulamayarlar uyg){
        
        boolean contactIsCreated = true;
        
        Connection con = My_CNX.getConnection();
        PreparedStatement ps;
        String updateQuery = "UPDATE `kullanıcılar` SET `ad`= ?,`soyad`=?,`kullanıcıAdı`=?,`e_posta`=?,`telefon`=?,`okul_no`=?,`durum`=?,`şifre`=? WHERE `id` = ?";
        
        try {
            ps = con.prepareStatement(updateQuery);
                    ps.setString(1, uyg.getAd());
                    ps.setString(2, uyg.getSoyad());
                    ps.setString(3, uyg.getKullanıcıAdı());
                    ps.setString(4, uyg.getE_posta());
                    ps.setString(5, uyg.getTelefon());
                    ps.setString(6, uyg.getOkul_no());
                    ps.setString(7, uyg.getDurum());
                    ps.setString(8, uyg.getŞifre());
                    ps.setInt(9, uyg.getUid());
                    
                    if(ps.executeUpdate() != 0){
                        JOptionPane.showMessageDialog(null, "Düzenlendi");      
                   
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Düzenlenemedi!!");
                        
                    }
        } catch (SQLException ex) {
            Logger.getLogger(query.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
        
            public void deleteContact(int cid){
        
        boolean contactIsCreated = true;
        
        Connection con = My_CNX.getConnection();
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement("DELETE FROM `kullanıcılar` WHERE `id` = ?");
            ps.setInt(1, cid);
                    if(ps.executeUpdate() != 0){
                        JOptionPane.showMessageDialog(null, "kullanıcı Silindi.");      
                        
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Kullanıcı silinemedi!!");
                        
                    }
        } catch (SQLException ex) {
            Logger.getLogger(query.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
        
    
    public ArrayList<uygulamayarlar> contactList(){
    
        ArrayList<uygulamayarlar> cList = new ArrayList<>();
        
        Connection con = My_CNX.getConnection();    
        Statement st;
        ResultSet rs;
        
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT `id`, `ad`, `soyad`, `kullanıcıAdı`, `e_posta`, `telefon`, `okul_no`, `durum`, `şifre` FROM `kullanıcılar`");
            uygulamayarlar ug;
            
            while(rs.next()){
            ug = new uygulamayarlar(
                                    rs.getInt("id"), 
                                    rs.getString("ad"), 
                                    rs.getString("soyad"), 
                                    rs.getString("kullanıcıadı"), 
                                    rs.getString("e_posta"), 
                                    rs.getString("telefon"), 
                                    rs.getString("okul_no"), 
                                    rs.getString("durum"), 
                                    rs.getString("şifre"), 
                                    0);
            
                        cList.add(ug);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(query.class.getName()).log(Level.SEVERE, null, ex);
        }      
        return cList;
    }
    
    
}
