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
public class Jenis_Barang {

    private Integer id_JenisBarang;
    private String nama_JenisBarang;

    public void setId_JenisBarang(Integer id_JenisBarang) {
        this.id_JenisBarang = id_JenisBarang;
    }

    public Integer getId_JenisBarang() {
        return id_JenisBarang;
    }

    public void setNama_JenisBarang(String nama_JenisBarang) {
        this.nama_JenisBarang = nama_JenisBarang;
    }

    public String getNama_JenisBarang() {
        return nama_JenisBarang;
    }
}
