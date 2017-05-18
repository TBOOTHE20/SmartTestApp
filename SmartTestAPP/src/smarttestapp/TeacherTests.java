/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarttestapp;

import java.util.ArrayList;
import smarttestapp.Test;
import smarttestapp.Test;

/**
 *
 * @author csc190
 */
public class TeacherTests {
    
    ArrayList<Test> myListofTest;
    
    
    public void TeacherTests(){       
         
        
    }    
    
    public void TeacherTestsaddList(ArrayList<Test> myListofTestinp){
        
        this.myListofTest= myListofTestinp;
    
    }
    
    public void addTest(Test t){
    
        this.myListofTest.add(t);
    
    }
    
    
    public void removeTest(Test t){
    
        this.myListofTest.remove(t);
    
    }
    
    public String getTestinfo(String PinIdin){
    
        for (int i = 0; i<myListofTest.size();i++){
            Test t = new Test();
            t = myListofTest.get(i);
            if (t.PinId==PinIdin)
                return t.Testname;
        }
        return "Not found";
        
    
   
    }  
    
    
    public String getTestinfobyNAME(String TestNameinp){
    
        for (int i = 0; i<myListofTest.size();i++){
            Test t = new Test();
            t = myListofTest.get(i);
            if (t.Testname==TestNameinp)
                return t.Testname;
        }
        return "Not found";
        
    
   
    } 
}
