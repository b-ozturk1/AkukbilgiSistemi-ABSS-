
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class duyuruquery {
    
    
    public void updateContact(editicerik1_1 uyg){
        
        boolean contactIsCreated = true;
        
        Connection con = My_CNX.getConnection();
        PreparedStatement ps;
        String updateQuery = "UPDATE `duyuru` SET `1baslık`=?,`1icerik`=?";
        
        try {
            ps = con.prepareStatement(updateQuery);
                    ps.setString(1, uyg.getBaslik1());
                    ps.setString(2, uyg.getIcerik1());
                    
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
