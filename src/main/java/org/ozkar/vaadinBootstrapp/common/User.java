/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ozkar.vaadinBootstrapp.common;

/**
 *
 * @author admin
 */
public class User {
    private String name;
    private String role;
    private String password;
    
    public static User getUser(String name) {
        /*Codigo para traerse usuario de la base de datos a partir del nombre*/
        return new User("LCC", "CommonUser", "LCC");
    }
    
    public User(){}   

    public User(String name, String role, String password) {
        this.name = name;
        this.role = role;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }    
    
}
