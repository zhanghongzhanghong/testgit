package com.zhang.spring.springbootweb.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class CustomListener implements ServletContextListener{

    @Override
    public void contextInitialized(ServletContextEvent sce) {
          System.out.println("servletContextListener init...");

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
