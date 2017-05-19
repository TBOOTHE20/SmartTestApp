/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarttestapp;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author csc190
 */
public class userInfos {
     
 
        private final SimpleStringProperty fullName;
        private final SimpleStringProperty password;
        private final SimpleStringProperty userName;
        private final SimpleStringProperty status;
        
 
        private userInfos(String fName, String lName, String UName, String Stat) {
            this.fullName = new SimpleStringProperty(fName);
            this.password = new SimpleStringProperty(lName);
            this.userName = new SimpleStringProperty(UName);
            this.status = new SimpleStringProperty(Stat);
            
        }
 
        public String getFullName() {
            return fullName.get();
        }
 
        public void setFulltName(String fName) {
            fullName.set(fName);
        }
 
        public String getpassword() {
            return password.get();
        }
 
        public void setpassword(String lName) {
            password.set(lName);
        }
 
        public String getuserName() {
            return userName.get();
        }
 
        public void setuserName(String UName) {
            userName.set(UName);
        }
        
        public String getstatus() {
            return status.get();
        }
 
        public void setstatus(String Stat) {
            status.set(Stat);
        }
        
    }
    
    
 


     

