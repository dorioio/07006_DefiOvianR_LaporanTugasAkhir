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
public class JenisBarangController {

    Koneksi koneksi;
    ArrayList<Jenis_Barang> arrjBarang;

    public JenisBarangController() throws SQLException {
        this.koneksi = new Koneksi();
        this.arrjBarang = new ArrayList<>();
    }

    public ArrayList<Jenis_Barang> getDataJBarang(Jenis_Barang p) throws SQLException {

        this.arrjBarang.clear();
        ResultSet rs = this.koneksi.GetData("SELECT * FROM JENIS_BARANG_07006 ORDER BY ID_JENISBARANG ASC");
        while (rs.next()) {
            Jenis_Barang JB = new Jenis_Barang();
            JB.setId_JenisBarang(rs.getInt("ID_JENISBARANG"));
            JB.setNama_JenisBarang(rs.getString("NAMA_JENISBARANG"));

            this.arrjBarang.add(JB);

        }
        return this.arrjBarang;
    }

    public void insertJBarang(Jenis_Barang datajbarang) {
        this.koneksi.ManipulasiData("INSERT INTO JENIS_BARANG_07006 VALUES (" + datajbarang.getId_JenisBarang() + ", '"
                + datajbarang.getNama_JenisBarang() + "')");

    }

    public void update(Jenis_Barang datajbarang) {
        String kodeSql = "UPDATE JENIS_BARANG_07006 SET " + "NAMA_JENISBARANG = '" + datajbarang.getNama_JenisBarang() + "'"
                + "WHERE ID_JENISBARANG = " + datajbarang.getId_JenisBarang();
        this.koneksi.ManipulasiData(kodeSql);
    }
}
