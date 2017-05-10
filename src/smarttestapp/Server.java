/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarttestapp;

import smarttestapp.model.userInfo;
import smarttestapp.model.users;


/**
 *
 * @author csc190
 */
public class Server {
    protected static void updateUser(String val){
        String qry = "UPDATE tbl_users SET val='" + val +"' WHERE name='users'";
        Utils.execNonQuery(qry);
    }
    protected static String getUser(String username){
        //1. retrieve the password of a user. This is for if we want to update a password
        //I would think we would need another one for getting the whole user again but not sure yet
        String sRet = "";
        String qry = "SELECT val FROM tbl_user WHERE name='schedule'";
        String userObjStr = Utils.execQuery(qry);
        
        users user1= (users) Utils.toObj(userObjStr);
        for(userInfo e : user1.getUsers()){
            if(e.username == username){
                sRet += ""+e.password;
            }
        }
        return sRet;
    }
    public static void main(String [] args){
        String op = args[0];
        if(op.equals("uploadUser")){
            updateUser(args[1]);
        }
        else{
          String str= getUser(args[2]);
          System.out.println(str);
        }
    }
}
