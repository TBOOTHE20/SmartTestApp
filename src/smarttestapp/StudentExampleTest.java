/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarttestapp;

import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import smarttestapp.model.Options;
import smarttestapp.model.Question;
import smarttestapp.model.Test;

/**
 *
 * @author csc190
 */
public class StudentExampleTest extends Stage {
    //Scene gpStudExTest;
    //data memebers
    Stage stage;
    
    ArrayList<Question> myListofQuestions = new ArrayList();
    //data members 
        public ScrollPane sp;
        public GridPane gp;
        static StudentExampleTest instance = null;
        public Label subtest;
       
    
    public void StudentExampleTest(){
        //this.choices = new Options(ex);
        //this.q = new Question();
        Test t = new Test(); //making test 
        t.addTestName("Math 105"); //making test math 105
        //String tes = t.Testname;
        //Label lbltes = new Label(tes);
        
        Question q = new Question(); 
        q.addQuestion("What is 2+2?"); //Sample question
        q.addAnswer("4"); //Sample Answer
        q.addPointValue("5");
        Options x = new Options();
        x.addOptionvalue("7");   
        x.addOptionvalue("7"); 
        x.addOptionvalue("7"); 
        q.addOptions(x);
        x.Optionlistsize();
        t.addQuestions(q);//adding list of questions
        
        Question q2 = new Question(); 
        q2.addQuestion("What is 4+4?"); //Sample question
        q2.addAnswer("8"); //Sample Answer
        q2.addPointValue("10");
        Options x2 = new Options();
        
        x2.addOptionvalue("6");
        x2.addOptionvalue("8");
        x2.addOptionvalue("82"); 
        q2.addOptions(x2);
        x2.Optionlistsize();//update length variable
        t.addQuestions(q2);//adding list of questions
        
        gp = new GridPane();
        sp = new ScrollPane();
        sp.setContent(gp);
        instance = this;
        Scene scene = new Scene(sp,550,250);
        this.setTitle("Student");
        this.setScene(scene);  
        
        
        
        int rrow=4;
        int ccolumn = 0;
        int counter;
        
       
        //for each question in my test called t I will print out the question name the point value and the choices
        for(int i = 0; i<t.myListofQuestions.size();i++){//i for ques
            //counter = 0;
            Question ques = t.myListofQuestions.get(i);//gets the ith question in test list
            Label lblques = new Label (ques.question);
            gp.add(lblques,ccolumn,rrow*2);
            Label lblpointvalue = new Label (ques.pointvalue + "pt");
            gp.add(lblpointvalue,ccolumn+1,rrow*2);//+1
            rrow++;
            
            
            //int sizzze= t.myListofQuestions.get(i).myListofOptions.getsize();
            int sizzze= t.myListofQuestions.get(i).myListofOptions.getsize();
            //while Array list not empty do toggle
            
            
            for(int y = 0 ; y<sizzze;y++){//y for options
                
                //radio button
                RadioButton buttonChoice = new RadioButton(t.myListofQuestions.get(i).myListofOptions.getOptionValue(y));
                //counter++;//to count how many choices by incrementing
                ToggleGroup sp = new ToggleGroup();
                buttonChoice.setToggleGroup(sp);
                gp.add(buttonChoice, y, rrow*2+1); 
                
                
           
            }//choice loop
            
            rrow++;
            
        }//question loop
        
        
        
        
        
         
    }
 
    public void initStudTestScreen()
    {
        Label lblTitle = new Label("Test:");
        this.gp.add(lblTitle, 0, 0, 2, 1);
        
        Label lblFir = new Label("QuestionExample");
        this.gp.add(lblFir, 0, 2, 3, 1);
        
        Label lblpt = new Label("pt"); //add value of points given 
        gp.add(lblpt, 3, 2);
        
        //3. add Button
        Button subtes = new Button();
        subtes.setText("Submit Test");
        gp.add(subtes, 4, 4);
        
        /*//Radio buttons 
        ToggleGroup group = new ToggleGroup();
        RadioButton button1 = new RadioButton("choice1");
        button1.setToggleGroup(group);
        //button1.setSelected(true);
        gp.add(button1, 1, 3);
        
        RadioButton button2 = new RadioButton("choice2");
        button2.setToggleGroup(group);
        gp.add(button2, 2, 3);
        
        
        RadioButton button3 = new RadioButton("choice3");
        button3.setToggleGroup(group);
        //button1.setSelected(true);
        gp.add(button3, 3, 3);
        
        
        RadioButton button4 = new RadioButton("choice4");
        button4.setToggleGroup(group);
        gp.add(button4, 4, 3);
        */    
            //4. add handler
        subtes.setOnAction(new EventHandler<ActionEvent>() {
            
                @Override
                public void handle(ActionEvent event) {
                    
                    //StudentHomePg shp = new StudentHomePg();
                    //shp.();//will display questions from that object(egg)
                    //shp.showAndWait();
                }
            });
            
    }
    

    
               
       
    
}           
