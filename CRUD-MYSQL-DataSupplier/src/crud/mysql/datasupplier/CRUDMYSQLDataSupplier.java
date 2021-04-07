package crud.mysql.datasupplier;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class CRUDMYSQLDataSupplier {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/dbsupplier";
    static final String USER = "root";
    static final String PASS = "";
    
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
            while(!con.isClosed()){
                menu();
            }
            stm.close();
            con.close();
        } catch (Exception Ext) {
            Ext.printStackTrace();
        }
    }
        static void menu(){
        System.out.println("====== Menu Utama ======");
        System.out.println("1. Insert data Supplier");
        System.out.println("2. Show Data Supplier");
        System.out.println("3. Edit Data Supplier");
        System.out.println("4. Delete Data Supplier");
        System.out.println("0. Keluar");
        System.out.println("========================");
        System.out.print("Pilihan : ");
        try {
            int pilih = Integer.parseInt(input.readLine());
            switch(pilih){
                case 0 : System.exit(0);break;
                case 1 : insert();break;
                case 2 : show();break;
                case 3 : edit();break;
                case 4 : delete();break;
                default: System.out.println("Pilihan Anda Salah");
            }
        } catch (Exception Ext) {
            Ext.printStackTrace();
        }
    }
    static void show(){
        String sql = "SELECT * FROM datasupplier";
        try {
            rs = stm.executeQuery(sql);
            System.out.println("\t\t\t\t\t List Data Supplier");
            System.out.println("---------------------------------------------------------------------------------------------------------");
            System.out.println("| Kode Supplier | Nama Supplier |\t\t Alamat \t\t| Nomor Telepon | Kontak Person |");
            System.out.println("---------------------------------------------------------------------------------------------------------");
            while(rs.next()){
                int kode = rs.getInt("kode_supplier");
                String nama = rs.getString("nm_supplier");
                String alamat = rs.getString("alamat");
                String tlp = rs.getString("tlp");
                String cp = rs.getString("kontak_person");
                
                System.out.println(String.format("|\t%d\t| %13s | %37s | %13s | %13s |",kode,nama,alamat,tlp,cp));
            }
            System.out.println("---------------------------------------------------------------------------------------------------------");
        } catch (Exception Ext) {
            Ext.printStackTrace();
        }
    }
    static void insert(){
        try {
            System.out.print("Kode Supplier : ");
            int kode = Integer.parseInt(input.readLine());
            System.out.print("Nama Supplier : ");
            String nama = input.readLine();
            System.out.print("Alamat        : ");
            String alamat = input.readLine();
            System.out.print("Nomor Telepon : ");
            String tlp = input.readLine();
            System.out.print("Kontak Person : ");
            String cp = input.readLine();
            
            String sql = "INSERT INTO datasupplier (kode_supplier, nm_supplier, alamat, tlp, kontak_person) VALUE ('%d', '%s', '%s', '%s', '%s')";
            sql = String.format(sql, kode, nama, alamat, tlp, cp);
            stm.execute(sql);
        } catch (Exception Ext) {
            Ext.printStackTrace();
        }
    }
    static void edit(){
        try {
            System.out.print("Masukkan Kode Supplier yang mau diedit :");
            int kode = Integer.parseInt(input.readLine());
            System.out.print("Nama Supplier   : ");
            String nama = input.readLine().trim();
            System.out.print("Alamat          : ");
            String alamat = input.readLine().trim();
            System.out.print("Nomor Telepon   : " );
            String tlp = input.readLine().trim();
            System.out.print("Kontak Person   : ");
            String cp = input.readLine().trim();
            
            String sql = "UPDATE datasupplier SET nm_supplier='%s', alamat='%s', tlp='%s', kontak_person='%s' WHERE kode_supplier=%d";
            sql = String.format(sql, nama, alamat, tlp, cp, kode);
            
            stm.execute(sql);
        } catch (Exception Ext) {
            Ext.printStackTrace();
        }
    }
    static void delete(){
        try {
            System.out.print("Masukan kode supplier yang akan dihapus : ");
            int kode = Integer.parseInt(input.readLine());
            
            String sql = String.format("DELETE FROM datasupplier WHERE kode_supplier=%d",kode);
            stm.execute(sql);
        } catch (Exception Ext) {
                Ext.printStackTrace();
        }
    }
}