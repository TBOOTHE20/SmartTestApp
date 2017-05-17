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

    ArrayList<Options> myListofOptions= new ArrayList();
    public String question;
    protected String correctanswer;
    protected String pointvalue;
    //ArrayList<LearningOutcome> myListofLearningOutcome= new ArrayList();

    public Question() {
        
        

    }
    
    public Question(String ques){
        
        this.question = ques;
    
    }
            

    public Question (ArrayList<Options> inpListofOptions){
        this.myListofOptions = inpListofOptions;
    }
    
    public void addQuestion(String quesinput)
       {
            this.question= quesinput;
       }
   
    public void addPointValue(String pointinput)
       {
            this.correctanswer = pointinput;
       }

   
       public void addOptions(String [] o) {
        Options t = new Options(o);
        //add to array
        myListofOptions.add(t);
    }
       
       public void addAnswer(String ansinput)
       {
            this.correctanswer = ansinput;
       }

    
}
