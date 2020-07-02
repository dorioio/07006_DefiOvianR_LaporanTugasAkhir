/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Barang;
import Model.Jenis_Barang;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import alattulis.Koneksi;

/**
 *
 * @author Administrator
 */
public class BarangController {

    Koneksi koneksi;
    ArrayList<Barang> arrproduk;

    public BarangController() throws SQLException {
        this.koneksi = new Koneksi();
        this.arrproduk = new ArrayList<>();
    }

    public ArrayList<Barang> getDataBarang(Barang p) throws SQLException {

       this.arrproduk.clear();
       ResultSet rs = this.koneksi.GetData("SELECT BARANG_07006.*, JENIS_BARANG_07006.* FROM BARANG_07006 JOIN JENIS_BARANG_07006 ON BARANG_07006.ID_JENISBARANG = JENIS_BARANG_07006.ID_JENISBARANG ORDER BY ID_BARANG ASC");

        while (rs.next()) {
            Jenis_Barang JB = new Jenis_Barang();
            JB.setId_JenisBarang(rs.getInt("ID_JENISBARANG"));
            JB.setNama_JenisBarang(rs.getString("NAMA_JENISBARANG"));

            Barang barang = new Barang();
            barang.setId_barang(rs.getInt("ID_BARANG"));
            barang.setJenis_barang(JB);
            barang.setNama_Barang(rs.getString("NAMA_BARANG"));
            barang.setHarga_barang(rs.getInt("HARGA_BARANG"));
            barang.setStok(rs.getInt("STOK"));
            this.arrproduk.add(barang);

        }
        return this.arrproduk;
    }

    public void insertBarang(Barang barang) {
        this.koneksi.ManipulasiData("INSERT INTO BARANG_07006 VALUES (" + barang.getId_barang() + ", "
                + barang.getJenis_barang().getId_JenisBarang() + ", '" + barang.getNama_barang() + "', '"
                + barang.getHarga_barang() + "', '" + barang.getStok() + "')");

    }

    public void deleteProduk(int idProduk) {
        try {
            this.koneksi.ManipulasiData("DELETE BARANG_07006 WHERE ID_BARANG=" + idProduk);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void update(Barang databarang) {
        String kodeSql = "UPDATE BARANG_07006 SET " + "ID_JENISBARANG = '" + databarang.getJenis_barang().getId_JenisBarang()+ "', "
                + "NAMA_BARANG = '" + databarang.getNama_barang() + "', " + "HARGA_BARANG = '" + databarang.getHarga_barang() + "'," 
                + "STOK = '" + databarang.getStok() + "'" 
                + "WHERE ID_BARANG = " + databarang.getId_barang();
        this.koneksi.ManipulasiData(kodeSql);
    }
}
