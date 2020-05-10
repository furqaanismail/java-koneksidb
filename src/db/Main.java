/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;

/**
 *
 * @author FRQ
 */
public class Main {
    Connection con;
    public Main() {
        con = Koneksi.getKoneksi();
    }
    public static void main(String[] args) {
        Main m = new Main();
    }
    
}
