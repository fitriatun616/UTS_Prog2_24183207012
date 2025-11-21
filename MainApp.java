/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;
import java.util.Scanner;


public class MainApp {
    public static void main(String[]args){
        ArrayList<Mahasiswa> dataMahasiswa = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        int pilihan;
        do {
            System.out.println("\n===== MENU DATA MAHASISWA =====");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampilkan Semua Data");
            System.out.println("3. Keluar");
            System.out.println("Pilih menu : ");
            pilihan = input.nextInt();
            input.nextLine();
            
        switch (pilihan){
        case 1:
            System.out.println("Masukkan Nama : ");
            String nama = input.nextLine();
            System.out.println("Masukkan Npm : ");
            String npm = input.nextLine();
            System.out.println("Masukkan Jurusan : ");
            String jurusan = input.nextLine();
            
            Mahasiswa mhs = new Mahasiswa(nama,npm,jurusan);
            dataMahasiswa.add(mhs);
            
            System.out.println("Data berhasil ditambahkan!");
        break ;
        case 2 :
            System.out.println("\n===== DATA MAHASISWA =====");
            if (dataMahasiswa.isEmpty()){
            System.out.println("Belum ada data.");
            
            }
            
            else{
            for (Mahasiswa m : dataMahasiswa){
                m.tampilkanData();
            }
            }
            break ;
                case 3:
            System.out.println("Keluar dari program...");
            break ;
                default :
            System.out.println("Pilihan tidak valid!");
            
            }
        }
        while (pilihan != 3);
        input.close();
        
    }

    
}
