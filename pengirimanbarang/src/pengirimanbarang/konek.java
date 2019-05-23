/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengirimanbarang;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class konek {
      private static Connection conn;
    public static Connection connect(String db){
        try{conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+ db,"root","");}
        catch(SQLException e){System.out.println("koneksi gagal" + e);}
        return conn;
    }
}
