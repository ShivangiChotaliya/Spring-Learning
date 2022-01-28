/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ctrl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 *
 * @author Shivangi
 */

@Controller
public class LoginController {
    
    //set the login service - Auto Wiring
    @Autowired
    LoginService service;
    
    @RequestMapping(value="/login",method=RequestMethod.GET)
    public String showLoginPage(){
        return "login";
    }
    
    @RequestMapping(value="/login",method=RequestMethod.POST)
    public String handleLoginRequest(@RequestParam String name,@RequestParam String password,ModelMap model){
        
       
        if(!service.validateUser(name,password)){
           model.put("errorMessage", "Invalid Credentials");
                  
            return "login";
        }
        model.put("name",name);
        model.put("password", password);
        return "Welcome";
    }

   
}
