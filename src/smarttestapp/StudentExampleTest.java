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
import static sun.plugin.navig.motif.Plugin.start;

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
        public RadioButton buttonChoice;
    
    public void StudentExampleTest(){ //passing a Test testcreated
        //this.Test = testcreated; 
        
        
        //this.choices = new Options(ex);
        //this.q = new Question();
        Test t = new Test(); //making test 
        t.addTestName("Math 105"); //making test math 105
        //String tes = t.Testname;
        //Label lbltes = new Label(tes);
        
        
        Question q = new Question(); 
        q.addQuestion("What is 2+2?"); //Sample question
        q.addAnswers("4"); //Sample Answer
        //q.addPointValue("5");
        q.addPointValues("6");
        Options x = new Options();
        x.addOptionvalue("4");   
        x.addOptionvalue("8"); 
        x.addOptionvalue("2"); 
        q.addOptions(x);
        x.Optionlistsize();
        t.addQuestions(q);//adding list of questions
        
        Question q2 = new Question(); 
        q2.addQuestion("What is 4+4?"); //Sample question
        q2.addAnswers("8"); //Sample Answer
        q2.addPointValues("10");
        Options x2 = new Options();
        
        x2.addOptionvalue("6");
        x2.addOptionvalue("8");
        x2.addOptionvalue("4"); 
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
        //int counter;
        //for each question in my test called t I will print out the question name the point value and the choices
        for(int i = 0; i<t.myListofQuestions.size();i++){//i for ques
            //counter = 0;
            Question ques = t.myListofQuestions.get(i);//gets the ith question in test list
            Label lblques = new Label (ques.question);
            gp.add(lblques,ccolumn,rrow*2);
            Label lblpointvalue = new Label (ques.pointvalue + "pt");
            gp.add(lblpointvalue,ccolumn+1,rrow*2);//+1
            rrow++;
            int sizze= t.myListofQuestions.get(i).myListofOptions.getsize();
            //while Array list not empty do toggle
            for(int y = 0 ; y<sizze;y++){//y for options
                //radio button
                RadioButton buttonChoice = new RadioButton(t.myListofQuestions.get(i).myListofOptions.getOptionValue(y));
                //counter++;//to count how many choices by incrementing
                ToggleGroup sp = new ToggleGroup();
                buttonChoice.setToggleGroup(sp);
                gp.add(buttonChoice, y, rrow*2+1); 
            }//choice loop
            rrow++;  
        }//question loop   
   /* }
 
    public void initStudTestScreen()
    {*/
        Label lblTitle = new Label("Test:");
        this.gp.add(lblTitle, 0, 0, 2, 1);

        //3. add Button
        Button subtes = new Button();
        subtes.setText("Submit Test");
        gp.add(subtes, 5, 1);
            
            //4. add handler
        //subtes.setOnAction(new EventHandler<ActionEvent>() {
            
                /*@Override
                public void handle(ActionEvent event) {
                    //q.question = 
                   // save(); //this will be saving the answers that student inputs for each question
                   
                }
            });*/
                
            subtes.setOnAction((ActionEvent e)-> {
                
                //String Start = tfFir.getText();
                //String pwd = pf.getText();
                this.close();
                //save();
                });
            
            
            
    }
    /*
        public void save(){
            //employee.name = this.tfName.getText();
            //Test.testcreated = Integer.parseInt(this.buttonChoice.getText();
            
            //if the button selected is equal to the correct answer
            if(buttonChoice.isSelected() == q.correctanswer)
            {
                //this.
                //give the point value given
                q.pointvalue;//don't change the pointvalue
                //
            }
            else{ //if the button pressed is not equal to the correct answer
                //
                q.pointvalue = 0;
            }
        }
      */  
    }
    

    
               
       
    
