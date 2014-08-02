/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ozkar.vaadinBootstrapp.common;

import org.ozkar.vaadinBootstrapp.egresados.EgresadosPage;
import com.vaadin.ui.MenuBar;


/**
 *
 * @author ozkar
 */
public class Menu extends MenuBar {

 public Menu() {             
         /* Top Level Items */
         this.addItem("Home", (MenuItem selectedItem) -> {
             getUI().getNavigator().navigateTo(HomePage.URL);
         });
  
         this.addItem("Egresados", (MenuItem  selectedItem) -> {
            getUI().getNavigator().navigateTo(EgresadosPage.URL);
         });
         
         
        /*Submenu Example*/
        MenuItem subMenuAdmin = this.addItem("Admin", null, null);
        
        subMenuAdmin.addItem("Usuarios", (MenuItem selectedItem) -> {
            getUI().getNavigator().navigateTo("admin/usuarios");
        });
         
        subMenuAdmin.addItem("Maestros", (MenuItem selectedItem) -> {
            getUI().getNavigator().navigateTo("admin/maestros");
        });        
         
        this.setWidth("100%");        
    }     
 
}
