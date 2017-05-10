/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarttestapp;

//these were created in the model class
import smarttestapp.model.userInfo;
import smarttestapp.model.users;


import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Base64;
/**
 *
 * @author csc190
 */
public class Client {
    protected static users buildUser() {
        //this is hardcoded users into the database
  
        //this is the arraylist of skills for users
        //this user is made from an id, fname, username, password, and role
        userInfo [] arrUsers = new userInfo[]{
           new userInfo(101, "Jane Doe", "doeJane@hofstra.edu", "doeJane", "Admin"),
           new userInfo(201, "Mini Me", "meMini@hofstra.edu", "meMini", "Teacher"),
           new userInfo(301, "Number Two", "twoNumber@hofstra.edu", "twoNumber", "Student") 
        };
        
        
        //making an array users for both of the user
        users user1 = new users(arrUsers);
        
        return user1;
    }

    /**
     * Serialization. Convert Menu to byte array, and then encode using base64
     *
     * @param users
     * @param 
     * @return
     */
    protected static String usersToStr(users user1) {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(user1);
            byte[] barrOut = bos.toByteArray();
            byte[] b64Out = Base64.getEncoder().encode(barrOut);
            int len1 = barrOut.length;
            int len2 = b64Out.length;
            String sRet = new String(b64Out);
            sRet = URLEncoder.encode(sRet, "UTF-8");
            return sRet;
        } catch (IOException exc) {
            System.out.println(exc);
            return null;
        }
    }

   
    
    //1. CREATE ANOTHER STNDARD JAVA PROJECT (NOT JAVA FAX)
    //2. copy over the files in your source folder to the src/ of that folder
    
    

    public static void main(String[] args) {
        String op = args[0];
        users user1 = buildUser();
        String url = "http://localhost/smarttest.php";
        String userContent = Utils.toStr(user1);
        String datastr = op.equals("1")
                ? "op=uploadUser&val=" + userContent 
                : "op=getUser" + "&username=" + args[2];
        try {
            String response = Utils.httpsPost(url, datastr);
            System.out.println(response);
        } catch (Exception exc) {
            System.out.println(exc);
        }
        int k = 0;




    }

}  


