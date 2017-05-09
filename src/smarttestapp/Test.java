/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarttestapp;

import java.util.ArrayList;

/**
 *
 * @author csc190
 */
public class Test implements java.io.Serializable {
    ArrayList<Question> myListofQuestions = new ArrayList(); 

   public void addQuestions(Question q) {

        //add to array
        myListofQuestions.add(q);

    } 
}
