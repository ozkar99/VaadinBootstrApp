package org.ozkar.vaadinBootstrapp.application.utils;

import javax.servlet.ServletContext;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class SpringContextHelper {

    private final ApplicationContext context;
    public SpringContextHelper(ServletContext servletContext) {      
        context = WebApplicationContextUtils.
                getRequiredWebApplicationContext(servletContext);
    }

    public Object getBean(final String beanRef) {
        return context.getBean(beanRef);
    }    
}
