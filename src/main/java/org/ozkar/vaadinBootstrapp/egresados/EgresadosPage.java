/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ozkar.vaadinBootstrapp.egresados;

import org.ozkar.vaadinBootstrapp.common.MasterPage;
import org.ozkar.vaadinBootstrapp.login.AuthUtils;
import org.ozkar.vaadinBootstrapp.common.HomePage;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.VerticalLayout;

/**
 *
 * @author ozkar
 */
public class EgresadosPage extends MasterPage {
    
    public static String URL = "egresados";    
    
    public EgresadosPage() {                    
        /*Page Setup From CustomView*/         
        super();        
        VerticalLayout view = super.getView();                
                 
        /* View Construction */        
        Button btn = new Button("new");        
        view.addComponent(new Label("Pagina De Egresados"));    
        view.addComponent(btn);
        
        /* Event Handling */
        btn.addClickListener((Button.ClickEvent event) -> {
            Notification.show("JALA");
        });
    }        

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
       
        if  ( !"Admin".equals(AuthUtils.getUserRole(getUI()))) {
            Notification.show("No Eres Admin");
            getUI().getNavigator().navigateTo(HomePage.URL);
        }
    }            
        
    
}
