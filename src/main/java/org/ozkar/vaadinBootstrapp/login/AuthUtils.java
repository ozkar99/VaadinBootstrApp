/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ozkar.vaadinBootstrapp.login;

import org.ozkar.vaadinBootstrapp.common.User;
import com.vaadin.ui.UI;

//
/**
 *
 * @author ozkar
 */
public abstract class AuthUtils {   
    
    public static boolean validUser(User user, String pass) {       
        /* Codigo para user login */ 
            if (user != null)
                return  user.getPassword().equals(pass);
            
            return false;
    }
    
    public static boolean loggedIn(UI ui, User user) {
           return (ui.getSession().getAttribute("user") != null);
    }
    
    public static void logIn(UI ui, User u) {                        
        ui.getSession().setAttribute("user", u);
    }
    
    public static void logOut(UI ui) {        
        ui.getSession().setAttribute("user", null);
    }
    
    public static String getUserRole(UI ui) {
        User u = (User) ui.getSession().getAttribute("user");
        String role = "";        
        
        if ( loggedIn(ui, u) ) {         
            role = u.getRole();
        }
            return role;
    }
    
}
