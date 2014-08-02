package org.ozkar.vaadinBootstrapp.application;



import org.ozkar.vaadinBootstrapp.egresados.EgresadosPage;
import org.ozkar.vaadinBootstrapp.login.LoginPage;
import org.ozkar.vaadinBootstrapp.common.HomePage;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.UI;
import javax.servlet.annotation.WebServlet;

@Theme("mytheme")
@SuppressWarnings("serial")
public class Application extends UI
{          
    @WebServlet(value = "/*", asyncSupported = true)
    @VaadinServletConfiguration(productionMode = false, ui = Application.class, widgetset = "org.ozkar.vaadinBootstrapp.application.AppWidgetSet")
    public static class Servlet extends VaadinServlet {}

    @Override
    protected void init(VaadinRequest request) {                
        getPage().setTitle("Actas");  
        
        Navigator nav = new Navigator(this, this);           
        /*Default Pages*/
        nav.addView(LoginPage.URL, LoginPage.class);        
        nav.addView(HomePage.URL, HomePage.class);
        
        /*Add Custom Pages*/
        nav.addView(EgresadosPage.URL, EgresadosPage.class);
      
        /*Start Page*/
        nav.navigateTo(LoginPage.URL);                   
    }
    
    
}
