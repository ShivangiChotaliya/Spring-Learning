/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.listener;

import com.entities.Todo;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 *
 * @author Shivangi
 */
public class MyListener implements ServletContextListener{

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("contect created...");
        List<Todo> list=new ArrayList();
        ServletContext context = sce.getServletContext();
        context.setAttribute("list", list);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        
        
    }
    
}
