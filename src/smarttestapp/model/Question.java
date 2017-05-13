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
    String correctanswer;
    

    public Question() {

    }

    public Question (ArrayList<Options> inpListofOptions){
        this.myListofOptions = inpListofOptions;
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
