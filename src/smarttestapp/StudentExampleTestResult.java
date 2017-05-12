/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarttestapp;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author csc190
 */
public class StudentExampleTestResult extends Application {
    
     @Override
    public void start(Stage primaryStage) {
        //1. add label Login Form/Occupies 2 columns
        GridPane gp = new GridPane();
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
        gp.add(back, 4, 4);
        
        
        
        //4. add handler
        back.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                //String Start = tfFir.getText();
                //String pwd = pf.getText();
                
            }
        });
               
        Scene scene = new Scene(gp, 550, 250);
        /*scene.getStylesheets().add(
                Login.class.getResource("newCascadeStyleSheet.css").toExternalForm()
        );*/
        
        primaryStage.setTitle("Student");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
    
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}