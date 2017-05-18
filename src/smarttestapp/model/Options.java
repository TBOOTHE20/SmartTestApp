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
public class Options implements java.io.Serializable{
    //data members
    protected ArrayList<String> inplistofOptions =new ArrayList<String>();
    int lengthofarray;
    
   
    
    
    public Options (){
        
    }
    //appending - adding on top 
    public void addOptionvalue(String optionvalueinput)
    {
        this.inplistofOptions.add(optionvalueinput);
    }
    
    public String getOptionValue(int i){
    
        String answer = "";
        answer = this.inplistofOptions.get(i);
        return answer;
        
        
    
    }
    
    public void Optionlistsize(){
    
        lengthofarray = this.inplistofOptions.size();
    
    }
    
    public int getsize(){return lengthofarray;}
    
   
    
}
