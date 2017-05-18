/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarttestapp;

import java.util.ArrayList;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import static smarttestapp.StudentExampleTest.instance;
import smarttestapp.model.Options;
import smarttestapp.model.Question;
import smarttestapp.model.Test;

/**
 *
 * @author csc190
 */
public class StudentExampleTestResult extends Stage {
    
        //data memebers
        Stage stage;
    
        ArrayList<Question> myListofQuestions = new ArrayList();
        //data members 
        public ScrollPane sp;
        public GridPane gp;
        static StudentExampleTestResult instance = null;
        public Label back;
    
    public void StudentExampleTestResult(){
        
         Test t = new Test(); //making test 
        t.addTestName("Math 105"); //making test math 105
        //String tes = t.Testname;
        //Label lbltes = new Label(tes);
        t.addGrade("67");
        
        Question q = new Question(); 
        q.addQuestion("What is 2+2?"); //Sample question
        q.addAnswers("4"); //Sample Answer
        q.addPointValues("2");
        Options x = new Options();
        //x.addOptionvalue("4");   
        //x.addOptionvalue("8"); 
        //x.addOptionvalue("2"); 
        q.addOptions(x);
        x.Optionlistsize();
        t.addQuestions(q);//adding list of questions
        
        Question q2 = new Question(); 
        q2.addQuestion("What is 4+4?"); //Sample question
        q2.addAnswers("8"); //Sample Answer
        q2.addPointValues("3");
        Options x2 = new Options();
        
        //x2.addOptionvalue("6");
        //x2.addOptionvalue("8");
        //x2.addOptionvalue("4"); 
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
        
        //stage.show();
        
        
        int rrow=4;
        int ccolumn = 0;
        //int counter;
        //for each question in my test called t I will print out the question name the point value and the choices
        for(int i = 0; i<t.myListofQuestions.size();i++){//i for ques
            //counter = 0;
            Question ques = t.myListofQuestions.get(i);//gets the ith question in test list
            Label lblques = new Label (ques.question);
            gp.add(lblques,ccolumn,rrow*2);
            //if (q.correctanswer == q.buttonChoice)
            Label lblpt = new Label (ques.pointvalue + "pt");
            gp.add(lblpt, ccolumn+1, rrow*2);
            
            
            
            //if the question was answered correctly then post the full points
            //else give zero points 
            //Label lblpointvalue = new Label (ques.pointvalue + "pt");
            //gp.add(lblpointvalue,ccolumn+1,rrow*2);//+1
            rrow++;
            
            
                
                Label lblAns = new Label("Answer:");
                gp.add(lblAns, ccolumn, rrow*2+1); 
                //q.addAnswers("4");
                
                Label lblpointvalue = new Label (ques.correctanswer);
                gp.add(lblpointvalue,ccolumn+1,rrow*2+1);//+1
                
        
                Label lblYAns = new Label("Your Answer:"); //add value of points given 
                //gp.add(lblYAns, 3, 3, 2, 1);
                gp.add(lblYAns, ccolumn+2, rrow*2+1); 
                //q.addAnswers("4");
                
                Label lblanswer = new Label ("YourExampleanswer"); //10
                gp.add(lblanswer,ccolumn+3,rrow*2+1);//+1
                
                
                
                
                
            rrow++;  
        }//question loop   
        
        
        
        
        
    
   /* }
        
        
        
        
    public void initStudTestResultsScreen()
    { */ 
     //1. add label Login Form/Occupies 2 columns
     
        Label lblTitle = new Label("RESULTS:"+ t.Testname); //adding name of course here 
        gp.add(lblTitle, 0, 0, 2, 1);
        
        Label lblTitle2 = new Label("GRADE:"+ t.Grade); //adding score value here
        gp.add(lblTitle2, 3, 0, 2, 1);
        
        /*//2. second row, add pincode and textbox
        Label lblQE = new Label("QuestionExample");
        gp.add(lblQE, 0, 2, 3, 1);
        
        Label lblpt = new Label("pt"); //add value of points given 
        gp.add(lblpt, 3, 2);
        */
        
        
        
        //3. add Button
        Button back = new Button();
        back.setText("Back");
        gp.add(back, 5, 4);
        
        
        
        //4. add handler
        //back.setOnAction(new EventHandler<ActionEvent>() {
            
            //@Override
            back.setOnAction((ActionEvent e)-> {
                this.close();
                //String Start = tfFir.getText();
                //String pwd = pf.getText();
                
           // }
        });
    }   
        
        
    

    
}