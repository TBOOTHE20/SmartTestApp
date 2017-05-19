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
import smarttestapp.model.Question;

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
        
        gp = new GridPane();
        sp = new ScrollPane();
        sp.setContent(gp);
        instance = this;
        Scene scene = new Scene(sp,550,250);
        this.setTitle("Student");
        this.setScene(scene); 
        
        //stage.show();
        
        
    
   /* }
        
        
        
        
    public void initStudTestResultsScreen()
    { */ 
     //1. add label Login Form/Occupies 2 columns
     
        Label lblTitle = new Label("RESULTS:"); //adding name of course here 
        gp.add(lblTitle, 0, 0, 2, 1);
        
        Label lblTitle2 = new Label("GRADE:"); //adding score value here
        gp.add(lblTitle2, 3, 0, 2, 1);
        
        //2. second row, add pincode and textbox
        Label lblQE = new Label("QuestionExample");
        gp.add(lblQE, 0, 2, 3, 1);
        
        Label lblpt = new Label("pt"); //add value of points given 
        gp.add(lblpt, 3, 2);
        
        Label lblAns = new Label("Answer:");
        gp.add(lblAns, 0, 3, 2, 1);
        
        Label lblYAns = new Label("Your Answer:"); //add value of points given 
        gp.add(lblYAns, 3, 3, 2, 1);
        
        
        
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