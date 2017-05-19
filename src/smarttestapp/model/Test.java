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
public class Test implements java.io.Serializable {
    
    //data members
    //public ArrayList<Test> myListofTests = new ArrayList();
    public ArrayList<Question> myListofQuestions = new ArrayList(); 
    public String Testname;
    public String PinId;
    public String Grade;
    

    
    
    public void Test(){
    
        
;    }

    public void Test(String inTestname, String inPinId, String Grade){
        this.Testname=inTestname;
        this.PinId= inPinId;
        this.Grade=Grade;
    
    }
    
    public void Test(ArrayList<Question> myListofQuestions, String Testname, String PinId, String Grade){
        this.myListofQuestions = myListofQuestions;
        this.Testname=Testname;
        this.PinId=PinId;
        this.Grade=Grade;
    
    }
    
   public void addQuestions(Question q) {

        //add to array
        myListofQuestions.add(q);

    } 
   
   
           
   
   public void addTestName(String testnameinp){
       
       //
       Testname = testnameinp;
   
   }
   
  public void addTestPin(String testpinidinp){
       
       //
       PinId = testpinidinp;
   
   }
  
  public void addGrade(String testgradeinp){
       
       //
       Grade = testgradeinp;
   
   }
  
}
