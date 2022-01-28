/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ctrl;

import org.springframework.stereotype.Service;

/**
 *
 * @author Shivangi
 */
@Service
public class LoginService {
  public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("shivangi") && password.equals("shivangi");
	}  
}
