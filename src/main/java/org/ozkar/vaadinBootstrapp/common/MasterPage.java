/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ozkar.vaadinBootstrapp.common;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.VerticalLayout;
import org.ozkar.vaadinBootstrapp.application.utils.SpringContextHelper;

/**
 *
 * @author ozkar
 */
public abstract class MasterPage extends CustomComponent implements View  {

    private Menu menu;
    private VerticalLayout view = new VerticalLayout();

    public MasterPage() {
        
        VerticalLayout root = new VerticalLayout();
       
       SpringContextHelper helper = new SpringContextHelper(VaadinServlet.getCurrent().getServletContext());
       menu = (Menu) helper.getBean("menu");
               
        root.addComponent(menu);
        root.addComponent(view);      
        
        view.setSizeFull();
        this.setSizeFull();   
        this.setWidth("100%");
        this.setHeight("100%");
        this.setCompositionRoot(root);                
        
    }       
    
    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
    }

    public VerticalLayout getView() {
        return view;
    }
       
}
