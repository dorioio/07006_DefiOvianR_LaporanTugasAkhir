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
public class Detail_TransaksiModel {
    private Barang barang;
    private TransaksiModel transaksi;
    private Integer jumlah;
    
    public void setBarang(Barang barang){
        this.barang=barang;
    }
    public Barang getBarang(){
        return barang;
    }
    public void setTransaksi(TransaksiModel transaksi){
        this.transaksi=transaksi;
    }
    public TransaksiModel getTransaksi(){
        return transaksi;
    }
      public void setJumlah(Integer jumlah){
        this.jumlah=jumlah;
    }
    public Integer getJumlah(){
        return jumlah;
    }
}
