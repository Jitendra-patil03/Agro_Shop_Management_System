/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agro_shop_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;





/**
 *
 * @author User
 */
public class Agro_Shop_Management {

    /**
     * @param args the command line arguments
     */
  
    public void finalize() {
        System.out.println("at the end");
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Agro_Shop_Management.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    private static Connection con = null;
    private static Statement st=null;
    private static PreparedStatement ps = null;
    private static String userType;
   
    public static Connection getCon() {
        return con;
    }

   
    public static Statement getSt() {
        return st;
    }

    public static PreparedStatement getPs() {
        return ps;
    }
     public static void setPs(PreparedStatement p) {
         ps = p;
     }

    public static String getUserType() {
        return userType;
    }
    static void setUserType(String string) {
        userType = string;
    }

    public static void main(String args[]){
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
      
        
        Connection();
        new LoginPage().setVisible(true);
        System.out.println("Ended");
//        try {
//            con.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(Agro_Shop_Management.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        finally{
//            con = null;
//            System.gc();
//        }

    }
    static void Connection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
           // System.out.println("Driver loaded");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Agro_shop_management_system","root","root");
            //System.out.println("connection done");
            st=con.createStatement();
            
        } catch(ClassNotFoundException | SQLException e) {
            //System.out.println("Exeption in connection : "+e);
             JOptionPane.showMessageDialog(null,"Exception in program plz contact developer");
        }
    }

   
    
}
