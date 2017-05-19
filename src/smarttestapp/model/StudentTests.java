/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarttestapp.model;
import smarttestapp.model.Test;
import java.util.ArrayList;

/**
 *
 * @author csc190
 */
public class StudentTests {
    
    ArrayList<Test> myListofTests;
  
    
    public void StudentTests(){       
         
        
    }    
    
    public void StudentTestsaddList(ArrayList<Test> myListofTestinp){
        
        this.myListofTests= myListofTestinp;
    
    }
    
    
    public String getTestinfo(String PinIdin){
    
        for (int i = 0; i<myListofTests.size();i++){
            Test t = new Test();
            t = myListofTests.get(i);
            if (t.PinId==PinIdin)
                return t.Testname;
        }
        return "Not found";

    }  

    public String getTestinfobyNAME(String TestNameinp){
    
        for (int i = 0; i<myListofTests.size();i++){
            Test t = new Test();
            t = myListofTests.get(i);
            if (t.Testname==TestNameinp)
                return t.Testname;
        }
        return "Not found";
     
    } 
    
    
    
    
    
    
    
}
