/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daftarmahasiswa;

/**
 *
 * @author sekar
 */
public class Mahasiswa {
    private String nim;
    private String nama;
    private String nilai;
    private String ukuran;
    
    public Mahasiswa(String nim, String nama, String nilai, String ukuran){
        this.nim = nim;
        this.nama = nama;
        this.nilai = nilai;
        this.ukuran = ukuran;
    }
    
    public void setNim(String nim) {
        this.nim = nim;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setNilai(String nilai) {
        this.nilai = nilai;
    }
    
    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }
    
    public String getNim() {
        return this.nim;
    }
    
    public String getNama() {
        return this.nama;
    }
    
    public String getNilai() {
        return this.nilai;
    }
    
    public String getUkuran() {
        return this.ukuran;
    }
    
    
}
