/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarttestapp;

import java.util.ArrayList;
import smarttestapp.model.userInfo;
import smarttestapp.model.users;


/**
 *
 * @author csc190
 */
public class Server {
    public static void insertUser(String username, String val){
        String qry = "INSERT INTO people (username, val) VALUES( '" + username + "', '"+ val +"')";
        Utils.execNonQuery(qry);
    }
    public static void updateUser(String username, String val){
        String qry = "UPDATE people SET val= '" + val +  "' WHERE name = '"+username+ "'";
        Utils.execNonQuery(qry);
    }
    protected static ArrayList<userInfo> getUser(String username){
        //1. retrieve the password of a user. This is for if we want to update a password
        //I would think we would need another one for getting the whole user again but not sure yet
        String sRet = "";
        String qry = "SELECT val FROM people WHERE name='"+ username +"' ";
        String userObjStr = Utils.execQuery(qry);
        
        ArrayList<userInfo> arrUsers = new ArrayList<>();
        users user1= (users) Utils.toObj(userObjStr);
        for(userInfo e : user1.getUsers()){
            arrUsers.add(e);
        }
        return arrUsers;
    }
    //GETS ALL THE USERS
    protected static ArrayList<userInfo> getAllUsers(){
        String qry = "SELECT val FROM people";
        ArrayList<String> userObjStr;
        userObjStr = Utils.executeQuery(qry);
        
        //users user1;
        //user1 = (users) Utils.toObj(userObjStr);
        ArrayList<userInfo> arrUsers = new ArrayList<>();
        for(String a : userObjStr){
           userInfo usr = (userInfo) Utils.toObj(a);
           arrUsers.add(usr);
        }
        return arrUsers;
        
    }
     protected static ArrayList<userInfos> getAll(){
        String qry = "SELECT val FROM people";
        ArrayList<String> userObjStr;
        userObjStr = Utils.executeQuery(qry);
        
        //users user1;
        //user1 = (users) Utils.toObj(userObjStr);
        ArrayList<userInfos> arrUsers = new ArrayList<>();
        for(String a : userObjStr){
           userInfos usr = (userInfos) Utils.toObj(a);
           arrUsers.add(usr);
        }
        return arrUsers;
        
    }
    //checks for verification
     protected static boolean getVerification(String username, String password){
        //1. retrieve the password of a user. This is for if we want to update a password
        //I would think we would need another one for getting the whole user again but not sure yet
        //String sRet = "";
        String qry = "SELECT val FROM tbl_users WHERE name='users'";
        String userObjStr = Utils.execQuery(qry);
        
        users user1= (users) Utils.toObj(userObjStr);
        for(userInfo e : user1.getUsers()){
            if(e.username.equals(username) && e.password.equals(password)){
                return true;
            }
        }
        return false;
    }
    public static void main(String [] args){
        String op = args[0];
        if(op.equals("uploadUser")){
            insertUser(args[1], args[2]);
        }else if(op.equals("getAllUsers")){
            ArrayList<userInfo> arrUsers = getAllUsers();
        }
        else{
          Boolean str= getVerification(args[1], args[2]);
          System.out.println(str);
        }
    }
}
