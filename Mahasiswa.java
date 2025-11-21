/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Mahasiswa {
    String nama;
    String npm;
    String jurusan;
   
        
        public Mahasiswa(){
            this.nama="";
            this.npm="";
            this.jurusan="";
            
        }
        
        public Mahasiswa(String nama, String npm, String jurusan){
            this.nama = nama;
            this.npm = npm;
            this.jurusan = jurusan;  
        }
        
        public void setNama(String nama){
            this.nama = nama;
        }
        
        public String getNama(){
            return nama;
        }
        
        public void setNpm(String npm){
            this.npm = npm;
        }
        
        public String getNpm(){
            return npm;
        }
        
        public void setJurusan(String jurusan){
            this.jurusan = jurusan;
        }
        
        public String getJurusan(){
            return jurusan;
        }
        
        // Method tambahan
        public void tampilkanData(){
            System.out.println("Nama :"+ nama);
            System.out.println("Npm :"+ npm);
            System.out.println("Jurusan :"+ jurusan);
            System.out.println("------------------------");
    }
}
