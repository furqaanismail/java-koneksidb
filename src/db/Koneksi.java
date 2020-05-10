/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FRQ
 */
public class Koneksi {
    static Connection con=null;

    private Koneksi() {
    }
    
    public static Connection getKoneksi(){
        MysqlDataSource db = new MysqlDataSource();
        db.setDatabaseName("Minimarket");
        db.setUser("root");
        db.setPassword("");
        
        try {
            con = db.getConnection();
            if(!con.isClosed()){
                System.out.println("koneksi berhasil");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;
    }
    
}
