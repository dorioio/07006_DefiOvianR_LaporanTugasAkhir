/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Barang;
import Model.Jenis_Barang;
import Model.LoginModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import alattulis.Koneksi;
import alattulis.Login;

/**
 *
 * @author Administrator
 */
public class LoginController {
    Koneksi koneksi;
    ArrayList<LoginModel> arrlogin;

    public LoginController() throws SQLException {
        this.koneksi = new Koneksi();
        this.arrlogin = new ArrayList<>();
    }

    public ArrayList<LoginModel> getDataLogin(LoginModel p) throws SQLException {
       this.arrlogin.clear();
       ResultSet rs = this.koneksi.GetData("SELECT * FROM LOGIN_07006 ORDER BY ID_OWNER ASC");
        while (rs.next()) {
            LoginModel lg = new LoginModel();
            lg.setId_owner(rs.getInt("ID_OWNER"));
            lg.setUsername(rs.getString("USERNAME"));
            lg.setPassword(rs.getString("PASSWORD"));
            this.arrlogin.add(lg);

        }
        return this.arrlogin;
    }

    public void insertLogin(LoginModel datalogin) {
        this.koneksi.ManipulasiData("INSERT INTO LOGIN_07006 VALUES (" + datalogin.getId_owner()+ ", '"
                + datalogin.getUsername() + "', '" + datalogin.getPassword() + "')");
    }

    public void deleteLogin(int idLogin) {
        try {
            this.koneksi.ManipulasiData("DELETE LOGIN_07006 WHERE ID_OWNER=" + idLogin);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void update(LoginModel dataLogin) {
        String kodeSql = "UPDATE LOGIN_07006 SET " + "USERNAME = '" + dataLogin.getUsername()+ "', "
                + "PASSWORD = '" + dataLogin.getPassword() + "'" 
                + "WHERE ID_OWNER = " + dataLogin.getId_owner();
        this.koneksi.ManipulasiData(kodeSql);
    }
}