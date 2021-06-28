/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//02-01 MEMBUAT KONEKSI KE DATABASE



/**
 *
 * @author ACER
 */
import java.sql.DriverManager;

public class Koneksi {
    private static java.sql.Connection koneksi;
    
    public static java.sql.Connection getKoneksi(){
        if(koneksi == null){
            try {
                String url = "jdbc:mysql://localhost:3306/hotel";
                String user = "root";
                String password= "";
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url,user,password);
                System.out.println("Berhasil Terhubung");
            } catch (Exception e) {
                System.out.println("Gagl Terhubung");
            }
        }
        return koneksi;
    }
    public static void main(String[] args) {
        getKoneksi();
    }
}

//02-01 MEMBUAT KONEKSI KE DATABASE