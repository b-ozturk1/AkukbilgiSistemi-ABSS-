
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class duyuruquery2 {
    
    
    public void updateContact(editicerik2_2 uyg){
        
        boolean contactIsCreated = true;
        
        Connection con = My_CNX.getConnection();
        PreparedStatement ps;
        String updateQuery = "UPDATE `duyuru` SET `2baslık`=?,`2icerik`=?";
        
        try {
            ps = con.prepareStatement(updateQuery);
                    ps.setString(1, uyg.getBaslik2());
                    ps.setString(2, uyg.getIcerik2());
                    
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
    
    
}
