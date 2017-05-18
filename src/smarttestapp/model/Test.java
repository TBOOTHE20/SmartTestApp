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
    public ArrayList<Question> myListofQuestions = new ArrayList(); 
    public String Testname;
    public String PinId;
    

    
    
    public void Test(){
    
        
;    }

    public void Test(String inTestname, String inPinId){
        this.Testname=inTestname;
        this.PinId=inPinId;
    
    }
    
    public void Test(ArrayList<Question> myListofQuestions, String Testname, String PinId){
        this.myListofQuestions = myListofQuestions;
        this.Testname=Testname;
        this.PinId=PinId;
    
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
}
