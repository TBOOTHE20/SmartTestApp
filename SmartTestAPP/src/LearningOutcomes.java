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

    
    //protected Category1 [] arrCat1;
    //protected ArrayList<Category1> LO = new ArrayList(); // ummmmmm 
            
            
       
    //public LearningOutcomes (String name, ArrayList<Category1>  inpArrCat1){
           
    Category1 [] arrCat1;
    public LearningOutcomes(String name, Category1 [] inpArr){
     
        this.arrCat1 = inpArr;
    
    }
    
}
