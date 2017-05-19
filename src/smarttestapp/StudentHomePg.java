package smarttestapp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import static smarttestapp.StudentExampleTest.instance;

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
        
        Label labeltest = new Label("Test:");//add the nametest variable - concatination
        gp.add(labeltest, 0, 3);
        
        Label labelgrade = new Label("Grade:");//add the nametest variable - concatination
        gp.add(labelgrade, 2, 3);

        Button startButton = new Button("Start");
        gp.add(startButton, 3, 1);
        startButton.setOnAction((ActionEvent e) -> {
            //if empty or not correct show an alert that theres no such pin in the system ..enter again
            if(addpin == null){
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
        //-------------------------------
        //in a while loop /for loop to display or taken tests 
        //creating a test label example to click on 
        Button TestnameButton = new Button("TestNameExample");
        gp.add(TestnameButton, 0, 4);
        TestnameButton.setOnAction((ActionEvent e) -> {
           
            StudentExampleTestResult str = new StudentExampleTestResult();
            str.StudentExampleTestResult();//will display questions from that object(egg)
            //str.initStudTestResultsScreen();
            str.showAndWait();
        });
        //and here creating a grade display label to look at next to the specific test 
        Label labelgradedisplayed = new Label("GradeExampleDisplayed");//add the nametest variable - concatination
        gp.add(labelgradedisplayed, 2, 4);
        
        stage.setScene(scene1);
        stage.show();
        
    }  
    
    public static void main(String[] args) {
        launch(args);
    }
    
} 