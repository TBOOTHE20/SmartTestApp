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
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author csc190
 */
public class AdminHomepg extends Application {
   
     @Override
    public void start(Stage primaryStage) {
        //1. add label Login Form/Occupies 2 columns
        GridPane gp = new GridPane();
        Label lblTitle = new Label("ADMIN CONSOLE");
        lblTitle.setFont(new Font("Arial", 16));
        gp.add(lblTitle, 1, 0, 2, 1);
        
        
        //2. second row, add pincode and textbox
        //Label lblUsr = new Label("Pincode");
        //TextField tfUser = new TextField();
        //gp.add(lblUsr, 0, 1);
        //gp.add(tfUser, 1, 1);
        
        //3. add Button
        Button btnNU = new Button();
        btnNU.setText("New User");
        gp.add(btnNU, 2, 1);
        
        Button btnRP = new Button();
        btnRP.setText("Reset Password");
        gp.add(btnRP, 2, 2); 
        
        Button btnVU = new Button();
        btnVU.setText("View Users");
        gp.add(btnVU, 2, 3); 
        
        //4. add handler
        btnNU.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                //String Start = tfUser.getText();
                //String pwd = pf.getText();
                
            }
        });
               
        btnRP.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                //String Start = tfUser.getText();
                //String pwd = pf.getText();
                
            }
        });
        
        btnVU.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                //String Start = tfUser.getText();
                //String pwd = pf.getText();
                
            }
        });
        
        Scene scene = new Scene(gp, 300, 250);
        /*scene.getStylesheets().add(
                Login.class.getResource("newCascadeStyleSheet.css").toExternalForm()
        );*/
        
        primaryStage.setTitle("Admin Homepage");
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