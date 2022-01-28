/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ctrl;

import com.entities.User;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 *
 * @author Shivangi
 */
@Controller
public class HomeCtrl {
    @Autowired
    ServletContext context;
    
    @RequestMapping("/home")
    public String home(Model m){
        String str = "home";
        m.addAttribute("page",str);
        List<User> list =  (List<User>)context.getAttribute("list");
        m.addAttribute("userslist" , list);
        return "home"; 
    }
    
    @RequestMapping("/add")
    public String addTodo(Model m){
        
        User user =new User();
        m.addAttribute("page","add");
        m.addAttribute("user",user);
        return "home";
    }
    
    @RequestMapping(value="/registerUser", method=RequestMethod.POST)
    public String registerUser(@ModelAttribute("user")  User user,Model m){
    System.out.println("+++++++++" + user + "++++++");
    List<User> list =  (List<User>)context.getAttribute("list");
    list.add(user);
    
    m.addAttribute("msg", "Successfully Added");
    return "home";
        
    }
}
