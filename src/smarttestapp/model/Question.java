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
public class Question implements java.io.Serializable {

    public Options myListofOptions; //array list with multiple options for ex for Question "whats 2 + 2?"
    public String question;
    public String correctanswer;
    public String pointvalue;
    //ArrayList<LearningOutcome> myListofLearningOutcome= new ArrayList();

    public Question() {
        

    }
       
    public void addQuestion(String quesinput)
       {
            this.question= quesinput; //points to a specific question
       }
   
    public void addPointValue(String pointinput)
       {
            this.correctanswer = pointinput;  //points to correct answer's pt value
       }

   
       public void addOptions(Options v) {
        //add to array
        //creat option egg and add values
        Options myListofOptions = new Options();
        this.myListofOptions = v;
        }
       
       public void addAnswer(String ansinput)
       {
            this.correctanswer = ansinput; //points to correct answer
       }

       
    
}
