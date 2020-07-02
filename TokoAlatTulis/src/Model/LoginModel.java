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
public class LoginModel {
    private Integer id_owner;
    private String username;
    private String password;
 
    
    public void setId_owner(Integer id_owner){
        this.id_owner=id_owner;
    }
    public Integer getId_owner(){
        return id_owner;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public String getUsername(){
        return username;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getPassword(){
        return password;
    }
}
