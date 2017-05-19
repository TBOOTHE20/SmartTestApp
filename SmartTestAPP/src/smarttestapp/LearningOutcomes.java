package smarttestapp;


import smarttestapp.Category1;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author csc190
 */
public class LearningOutcomes implements java.io.Serializable  {

    protected String name; //learning outcome name
    protected ArrayList LearningOutcomes = new ArrayList(); // ummmmmm 
            
    protected Category1 [] arrCat1;        
       
    public LearningOutcomes (String inpN, Category1 [] inpArrCat1){
        this.name = inpN;
        this.arrCat1 = inpArrCat1;
    }
    
}
