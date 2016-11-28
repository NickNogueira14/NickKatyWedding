package com.weddingapp.nickkaty.config;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.googlecode.objectify.ObjectifyService;
import com.weddingapp.nickkaty.domain.AdditionalGuest;
import com.weddingapp.nickkaty.domain.Guest;
import com.weddingapp.nickkaty.domain.MessageToCouple;

/**
 * Initial setup before the web application start.
 * 
 * @since Aug 18, 2016
 * @author <a href="mailto:comp.vinicius@gmail.com">Vinicius Nogueira</a>
 */
public class OfyInitSetup implements ServletContextListener {

    @Override
    public void contextDestroyed(ServletContextEvent arg0) {

    }

    @Override
    public void contextInitialized(ServletContextEvent arg0) {
        ObjectifyService.register(Guest.class);
        ObjectifyService.register(AdditionalGuest.class);
        ObjectifyService.register(MessageToCouple.class);
    }

}
