
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class querys {
    
    
    public void InsertContact(şifredeğiştir cont){
        
        boolean şifredeğiştiroluştur = true;
        
        Connection con = My_CNX.getConnection();
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement("INSERT INTO `şifreler`(`Özelkod`, `Şifre1`, `Şifre2`) VALUES (?,?,?)");
            ps.setString(1, cont.getÖzelkod());
            ps.setString(2, cont.getŞifre1());
            ps.setString(3, cont.getŞifre2());
            
            if(ps.executeUpdate() != 0){
            
                JOptionPane.showMessageDialog(null,"Eklendi");
               
            }
            else{
                JOptionPane.showMessageDialog(null, "Eklenemedi","",2);
               
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(querys.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }
    
    
    public void UpdateContact(şifredeğiştir uyg){
        
        boolean contactIsCreated = true;
        
        Connection con = My_CNX.getConnection();
        PreparedStatement ps;
        String updateQuery = "UPDATE `şifreler` SET `Özelkod`=?,`Şifre1`=?,`Şifre2`=? WHERE `id` = ?";
        
        try {
            ps = con.prepareStatement(updateQuery);
                    ps.setString(1, uyg.getÖzelkod());
                    ps.setString(2, uyg.getŞifre1());
                    ps.setString(3, uyg.getŞifre2());
                    ps.setInt(4, uyg.getId());
                    
                    
                    if(ps.executeUpdate() != 0){
                        JOptionPane.showMessageDialog(null, "Düzenlendi");      
                        contactIsCreated = true;
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Düzenlenemedi!!");
                        contactIsCreated = false;
                    }
        } catch (SQLException ex) {
            Logger.getLogger(query.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
   
    
    public ArrayList<şifredeğiştir> contactList(){
    
        ArrayList<şifredeğiştir> clist = new ArrayList<>();
        
        Connection con = My_CNX.getConnection();
        Statement st;
        ResultSet rs;
        
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT `id`, `Özelkod`, `Şifre1`, `Şifre2` FROM `şifreler`");
            şifredeğiştir ct;
            
            while(rs.next()){
            ct = new şifredeğiştir( rs.getInt("id"),
                                        rs.getString("Özelkod"), 
                                        rs.getString("Şifre1"), 
                                        rs.getString("Şifre2"));
                
                clist.add(ct);
            
            }
            
        
        
        } catch (SQLException ex) {
            Logger.getLogger(querys.class.getName()).log(Level.SEVERE, null, ex);
        }

        return clist;
        
    }
    

}
