/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ozkar.vaadinBootstrapp.common;

import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.VerticalLayout;

/**
 *
 * @author ozkar
 */
    public class HomePage extends MasterPage {
    
    public static String URL = "";    
    
    public HomePage() {                    
        /*Page Setup From CustomView*/         
        super();        
        VerticalLayout view = super.getView();                
                 
        /* View Construction */                
        view.addComponent(new Label("Hola Mundo"));    
        
        Button btn = new Button("Hola");        
        view.addComponent(btn);
        
        /* Event Handling */
        btn.addClickListener((Button.ClickEvent event) -> {
            Notification.show("Hola Mundo!");
        });
    }        

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) { 
        
    }            
}
