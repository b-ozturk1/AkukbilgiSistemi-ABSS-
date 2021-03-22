
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class duyuruquery3 {
    
    
    public void updateContact(editicerik3_3 uyg){
        
        boolean contactIsCreated = true;
        
        Connection con = My_CNX.getConnection();
        PreparedStatement ps;
        String updateQuery = "UPDATE `duyuru` SET `3baslık`=?,`3icerik`=?";
        
        try {
            ps = con.prepareStatement(updateQuery);
                    ps.setString(1, uyg.getBaslik3());
                    ps.setString(2, uyg.getIcerik3());
                    
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
