package project.crud.mysql;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class ProjectCRUDMYSQL {
    //parameter JDBC untuk koneksi kedatabase
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/dbbarang";
    static final String USER = "root";
    static final String PASS = "";
    
    //objek untuk mengelola database
    static Connection con;
    static Statement stm;
    static ResultSet rs;
    
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);

    public static void main(String[] args) {
        try {
            Class.forName(JDBC_DRIVER);
            con = DriverManager.getConnection(DB_URL,USER,PASS);
            stm = con.createStatement();
            
            while (!con.isClosed()) {                
                menu();
            }
            stm.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static void menu(){
        System.out.println("ini cuma tes aja sih");
        System.out.println("Menu Utama");
        System.out.println("1. List Data Barang");
        System.out.println("2. Tambah Data Barang");
        System.out.println("3. Ubah Data Barang");
        System.out.println("4. Hapus Data Barang");
        System.out.println("0. Keluar");
        System.out.print("Pilihan : ");
        try {
            int pilih = Integer.parseInt(input.readLine());
            switch (pilih){
                case 0 : System.exit(0); break;
                case 1 : listData();break;
                case 2 : tambahData();break;
                case 3 : ubahData();break;
                case 4 : hapusData();break;
                default: System.out.println("Pilihan anda salah !!!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static void listData(){
        String sql = "SELECT * FROM databarang";
        try{
            rs = stm.executeQuery(sql);
            System.out.println("\t\t\tList Data Barang");
            System.out.println("------------------------------------------------------------------");
            System.out.println("| kode |\tNama\t\t|\tTanggal\t     | \tHarga\t |");
            System.out.println("------------------------------------------------------------------");
            while(rs.next()){
                int kode = rs.getInt("kode");
                String nama = rs.getString("nama");
                String tanggal = rs.getString("tanggal");
                int harga = rs.getInt("harga");

                System.out.println(String.format("|%3d   | %20s\t| %18s | %9d |", kode, nama, tanggal, harga));
            }
            System.out.println("------------------------------------------------------------------");
        }catch(Exception Ext){
            Ext.printStackTrace();
        }
    }
    static void tambahData(){
        try {
            System.out.print("Kode Barang : ");
            int kode = Integer.parseInt(input.readLine());
            System.out.print("Nama Barang : ");
            String nama = input.readLine();
            System.out.print("Tanggal Masuk : ");
            String tanggal = input.readLine();
            System.out.print("Harga Barang : ");
            int harga = Integer.parseInt(input.readLine());
            
            String sql = "INSERT INTO databarang (kode, nama, tanggal, harga) VALUE ('%d', '%s', '%s', '%d')";
            sql = String.format(sql, kode, nama, tanggal, harga);
            
            stm.execute(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static void ubahData() throws IOException{
        try{
            System.out.print("Masukan kode barang yang mau diedit : ");
            int kode = Integer.parseInt(input.readLine());
            System.out.print("Nama Barang : ");
            String nama = input.readLine().trim();
            System.out.print("Tanggal Masuk : ");
            String tanggal = input.readLine().trim();
            System.out.print("Harga Barang : ");
            int harga = Integer.parseInt(input.readLine());

            String sql = "UPDATE databarang SET nama='%s',tanggal='%s',harga='%d' WHERE kode=%d";
            sql = String.format(sql, nama, tanggal, harga, kode);

            stm.execute(sql);
        }catch(Exception Ext){
            Ext.printStackTrace();
        }
    }
    static void hapusData(){
        try {
            System.out.print("Masukkan kode barang yang akan dihapus : ");
            int kode = Integer.parseInt(input.readLine());
            
            String sql = String.format("DELETE FROM databarang WHERE kode=%d",kode);
            stm.execute(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}