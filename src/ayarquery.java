
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ayarquery {
    
    
    public void updateContact(ayarlarrrrrrrrrrrrrrr uyg){
        
        boolean contactIsCreated = true;
        
        Connection con = My_CNX.getConnection();
        PreparedStatement ps;
        String updateQuery = "UPDATE `kullanıcılar` SET `kullanıcıAdı`= ?, `şifre`= ?, `ad`= ?,`soyad`= ?,`e_posta`= ?,`telefon`= ?,`okul_no`= ? WHERE `id`=?";
                
        try {
            ps = con.prepareStatement(updateQuery);
                    ps.setInt(8, uyg.getId());
                    ps.setString(3, uyg.getAd());
                    ps.setString(4, uyg.getSoyad());
                    ps.setString(1, uyg.getKullanıcıAdı());
                    ps.setString(5, uyg.getE_posta());
                    ps.setString(6, uyg.getTelefon());
                    ps.setString(7, uyg.getOkul_no());
                    ps.setString(2, uyg.getŞifre());
                   

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
    
    
    
    public ArrayList<ayarlarrrrrrrrrrrrrrr> contactList(){
    
        ArrayList<ayarlarrrrrrrrrrrrrrr> cList = new ArrayList<>();
        
        Connection con = My_CNX.getConnection();    
        Statement st;
        ResultSet rs;
        
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT `id`, `ad`, `soyad`, `kullanıcıAdı`, `e_posta`, `telefon`, `okul_no`, `şifre` FROM `kullanıcılar`");
            ayarlarrrrrrrrrrrrrrr ug;
            
            while(rs.next()){
            ug = new ayarlarrrrrrrrrrrrrrr(rs.getInt("id"),
                                           rs.getString("şifre"), 
                                           rs.getString("ad"), 
                                           rs.getString("soyad"), 
                                           rs.getString("kullanıcıadı"), 
                                           rs.getString("e_posta"), 
                                           rs.getString("telefon"), 
                                           rs.getString("okul_no")) ;
                                           
                                    
            
                        cList.add(ug);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(query.class.getName()).log(Level.SEVERE, null, ex);
        }      
        return cList;
    }
    
    
    
    
    
}
