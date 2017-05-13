/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarttestapp.model;

import java.util.ArrayList;

/**
 *
 * @author csc190
 */
public class User {
    
    String fullname, username, password, role;
    
    
    public User() {

    }

    public User(String fullnameinp, String usernameinp, String passwordinp, String roleinp) {
        this.fullname = fullnameinp;
        this.username = usernameinp;
        this.password = passwordinp;
        this.role = roleinp;
                
    }
}
