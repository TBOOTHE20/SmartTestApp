package smarttestapp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import static smarttestapp.StudentExampleTest.instance;
import smarttestapp.model.Question;
import smarttestapp.model.StudentTests;
import smarttestapp.model.Test;

/**
 *
 * @author csc190
 */
public class StudentHomePg extends Application {
    //Scene gpStudExTest;
    //Stage thestage;
    ScrollPane sp;
    GridPane gp;
    Scene scene1;
    //static StudentHomePg instance = null;
    
    @Override
    public void start(Stage stage) {
        
        //Scene scene = new Scene(new Group());
        //stage.setTitle("Student");
        //stage.setWidth(700);
        //stage.setHeight(600);
        sp = new ScrollPane();
        gp = new GridPane();
        
        sp.setContent(gp);
        //instance = this;
        Scene scene1 = new Scene(sp,550,250);
        stage.setTitle("Student");
        stage.setScene(scene1); 

        Label labelstut = new Label("STUDENT TESTS");
        gp.add(labelstut, 0, 0, 2, 1);
        
        Label labelpin = new Label("Pincode:");//add the nametest variable - concatination
        gp.add(labelpin, 0, 1, 2, 1);
        
        TextField addpin = new TextField();
        gp.add(addpin, 2, 1);
        
       /* Label labeltest = new Label("Test:");//add the nametest variable - concatination
        gp.add(labeltest, 0, 3);
        
        Label labelgrade = new Label("Grade:");//add the nametest variable - concatination
        gp.add(labelgrade, 2, 3);
*/
        Button startButton = new Button("Start");
        gp.add(startButton, 3, 1);
        startButton.setOnAction((ActionEvent e) -> {
            //if empty or not correct show an alert that theres no such pin in the system ..enter again
            if(addpin.getText() == null){ //if not in the database 
                     Alert al = new Alert(Alert.AlertType.INFORMATION);
                     al.setContentText("Wrong Pincode. Enter again.");
                     al.showAndWait();
            }
            //else the pin is correct then proceed to StudentExampleTest -specific test
            else{
                    StudentExampleTest st = new StudentExampleTest();
                    //st.initStudTestScreen();
                    st.StudentExampleTest();//will display questions from that object(egg)
                    
                    st.showAndWait();
                    
                    }       
        });

        Test t = new Test();
        t.addTestName("Math105");
        t.addGrade("97");
        
        Test t2 = new Test();
        t2.addTestName("Math101");
        t2.addGrade("87");
        
        //add the newly created test to an ArrayList and check to see if its added to Test array
        ArrayList<Test> ttests = new ArrayList();
        ttests.add(t);
        ttests.add(t2);
        
        //System.out.println("Testname: " + ttests.get(1).Testname + ", PinId: " + ttests.get(0).PinId);
        
        //created a student test egg which will hold all the test for that specific student
        StudentTests jj = new StudentTests();
        jj.StudentTestsaddList(ttests);
        //double checking to make sure all of jj tests are in array and can be found
        //System.out.println("Testname: " + jj.getTestinfo("222")+"!");

        //logout button to go back to the SmartTest Homepage
        Button btnLogout = new Button("Log Out");     
        
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.CENTER);
        hbBtn.getChildren().add(btnLogout);
        gp.add(hbBtn, 4, 0);
       
        btnLogout.setOnAction((ActionEvent e) -> {
            //go to homepage scene of SmartTest
           
        });
        
        Label lblTableTitleTest = new Label("Test:");
        Label lblTableTitleGrade = new Label("Grade:");
        
        
        gp.add(lblTableTitleTest,0,3);
        gp.add(lblTableTitleGrade,1,3);
        
        int rrow = 4;
        int ccolumn=0;
        for(int i=0; i<ttests.size(); i++){
            
            Test a = ttests.get(i); // Tests 
            
            //Label lbl = new Label(a.Testname); //label for each of those tests displayed 
            Button btn = new Button();
            btn.setText(a.Testname);
            
            btn.setOnAction(new EventHandler<ActionEvent>() {            
                @Override //Show test information based on selected test
                public void handle(ActionEvent event) {
                    StudentExampleTestResult str = new StudentExampleTestResult();
                    str.StudentExampleTestResult();//will display questions from that object(egg)
                    //str.initStudTestResultsScreen();
                    str.showAndWait();
                    //AddQuestionStage ef = new AddQuestionStage();
                    //ef.showAndWait();
                }
            });
            Label lbl = new Label();
            lbl.setText(a.Grade); 

            gp.add(btn, ccolumn,rrow);
           gp.add(lbl, ccolumn+1,rrow);
            rrow++;//increment the row  
        }
        stage.setScene(scene1);
        stage.show();   
    }

    public static void main(String[] args) {
        launch(args);
    }
    
} 