/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ozkar.vaadinBootstrapp.application.utils;

import org.apache.log4j.Logger;

/**
 *
 * @author Christian
 */
public abstract class Util {

    
    public static Logger log(Class clase) {
       return Logger.getLogger(clase);
    }
     

}
