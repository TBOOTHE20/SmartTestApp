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
public class users implements java.io.Serializable{
    userInfo [] arrUser;
    
    public users(userInfo [] inpArrUser){
        this.arrUser = inpArrUser;
    }
    
    public userInfo[] getUsers(){
        return this.arrUser;
    }
   

    
}


