/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Administrator
 */
public class Barang {

    private Integer id_barang;
    private String nama_barang;
    private Jenis_Barang jenis_barang;
    private Integer harga_barang;
    private Integer stok;

    public void setId_barang(Integer Id_barang) {
        this.id_barang = Id_barang;
    }

    public Integer getId_barang() {
        return id_barang;
    }

    public void setJenis_barang(Jenis_Barang jenis_barang) {
        this.jenis_barang = jenis_barang;
    }

    public Jenis_Barang getJenis_barang() {
        return jenis_barang;
    }

    public void setNama_Barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setHarga_barang(Integer harga_barang) {
        this.harga_barang = harga_barang;
    }

    public Integer getHarga_barang() {
        return harga_barang;
    }

    public void setStok(Integer stok) {
        this.stok = stok;
    }

    public Integer getStok() {
        return stok;
    }
}
