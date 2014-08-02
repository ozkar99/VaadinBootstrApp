/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ozkar.vaadinBootstrapp.login;


import org.ozkar.vaadinBootstrapp.common.User;
import org.ozkar.vaadinBootstrapp.common.HomePage;
import com.vaadin.event.ShortcutAction.KeyCode;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.Reindeer;




/**
 *
 * @author ozkar
 */
public class LoginPage extends CustomComponent implements View  {
    
    public static String URL = "login";
    private final TextField txtUsername = new TextField("Usuario:");
    private final PasswordField txtPassword = new PasswordField("Contraseña:");        
    private final Button btnOk = new Button("Aceptar");
    
    public LoginPage() {                
                            
        
        final VerticalLayout root = new VerticalLayout(); 
        final FormLayout loginForm = new FormLayout();           
        
        txtUsername.setRequired(true);
        txtPassword.setRequired(true);                                                                
        btnOk.setClickShortcut(KeyCode.ENTER);        
      
        root.addComponent(loginForm);
        root.setComponentAlignment(loginForm, Alignment.MIDDLE_CENTER);
        root.setSizeFull();     
        root.setStyleName(Reindeer.LAYOUT_BLUE);                        
        
        loginForm.addComponent(txtUsername);
        loginForm.addComponent(txtPassword);
        loginForm.addComponent(btnOk);
        
        loginForm.setSpacing(true);
        loginForm.setMargin(new MarginInfo(true, true, true, false));                              
        loginForm.setCaption(":::LOGIN:::");
        loginForm.setSizeUndefined();                     
                               
        this.setSizeFull();
        this.setCompositionRoot(root);
        
        /* Event Handling */
        btnOk.addClickListener((Button.ClickEvent event) -> {

            User user = User.getUser(txtUsername.getValue());
            
            if ( AuthUtils.validUser(user, txtPassword.getValue()) )  {
                Notification.show("Bienvenido...");
                AuthUtils.logIn(getUI(), user);
                getUI().getNavigator().navigateTo(HomePage.URL);
            } else {
                Notification.show("Usuario o Contraseña Incorrecto.");
            }
        });
        
    }                  
                
    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {          
    }
          
}
