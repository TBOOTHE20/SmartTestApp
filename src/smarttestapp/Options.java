/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarttestapp;

/**
 *
 * @author csc190
 */
public class Options implements java.io.Serializable{
    
    protected String[]options;
   
    
    public Options (String [] inpOptions )
    {
        this.options = inpOptions;
            }
    
    
}
