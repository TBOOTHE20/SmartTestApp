/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarttestapp.model;

/**
 *
 * @author csc190
 */
public class userInfo implements java.io.Serializable {
    Integer id;
    public String fname;
    public String username;
    public String password;
    public String role;
    
    public userInfo(int inpID, String inpFname, String inpUsername, String inpPassword, String inpRole){
        this.id = inpID;
        this.fname = inpFname;
        this.username = inpUsername;
        this.password = inpPassword;
        this.role = inpRole;
    }
    
    
}
