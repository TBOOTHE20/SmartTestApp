/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarttestapp.model;

import smarttestapp.model.Question;
import java.util.ArrayList;

/**
 *
 * @author csc190
 */
public class Test implements java.io.Serializable {
    ArrayList<Question> myListofQuestions = new ArrayList(); 
    String Testname;

    
    
   public void addQuestions(Question q) {

        //add to array
        myListofQuestions.add(q);

    } 
   
   public void addTestName(String testnameinp){
       
       //
       Testname = testnameinp;
   
   }
}
