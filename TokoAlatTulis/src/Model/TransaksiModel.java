/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Administrator
 */
public class TransaksiModel {

    private int id_transaksi;
    private LoginModel login;
    private Double total_harga;
    private String tgl_transaksi;
    private Double uang_bayar;
    private Double kembalian;
    private ArrayList<Detail_TransaksiModel> arrDetail_Transaksi;

    public void setId_transaksi(int id_transaksi) {
        this.id_transaksi = id_transaksi;
    }

    public int getId_transaksi() {
        return id_transaksi;
    }

    public void setLogin(LoginModel login) {
        this.login = login;
    }

    public LoginModel getLogin() {
        return login;
    }

    public void setTotal_harga(Double total_harga) {
        this.total_harga = total_harga;
    }

    public Double getTotal_harga() {
        return total_harga;
    }

    public void setTgl_transaksi(String tgl_transaksi) {
        this.tgl_transaksi = tgl_transaksi;
    }

    public String getTgl_transaksi() {
        return tgl_transaksi;
    }

    public void setUang_bayar(Double uang_bayar) {
        this.uang_bayar = uang_bayar;
    }

    public Double getUang_bayar() {
        return uang_bayar;
    }

    public void setKembalian(Double kembalian) {
        this.kembalian = kembalian;
    }

    public Double getKembalian() {
        return kembalian;
    }

    public void setArrDetail_Transaksi(ArrayList<Detail_TransaksiModel> arrDetail_Transaksi) {
        this.arrDetail_Transaksi = arrDetail_Transaksi;
    }

    public ArrayList<Detail_TransaksiModel> getArrDetail_Transaksi() {
        return arrDetail_Transaksi;
    }
}
