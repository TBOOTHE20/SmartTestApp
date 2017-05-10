/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author csc190
 */
public class Category1 implements java.io.Serializable{
    
    //keeps array of all of their category 2 names
    protected String cat1Name; //learning outcome name
    protected Category2 [] arrCat2; 
    
    public Category1 (String inpN, Category2[] inpArrCat2){
        this.cat1Name = inpN;
        this.arrCat2 = inpArrCat2;
    }

    
}