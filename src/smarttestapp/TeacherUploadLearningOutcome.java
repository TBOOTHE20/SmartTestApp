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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author csc190
 */
public class TeacherUploadLearningOutcome extends Application {
    //THESE ARE THE THINGS THAT NEED TO BE FIXED WITH THIS IMPLEMENTATION
    //1. Connect the database to the login
    //2. Add a new button for register
    //3. Set up the scene to that when register is hit, the scene changes to a new option
    //4. Set up mysql instructions such as update and create for login and register
    //5. Add either a text field or button that indicates the role of the user
    @Override
    public void start(Stage primaryStage) {
        //1. add label Login Form/Occupies 2 columns
        GridPane gp = new GridPane();
        Label lblTitle = new Label("Add Learning Outcome");
        gp.add(lblTitle, 0, 1, 2, 1);
        
        //2. second row, add uname and textbox
        Label lblCat1 = new Label("Category 1");
        TextField tfCat1 = new TextField();
        gp.add(lblCat1, 0, 2);
        gp.add(tfCat1, 1, 2);
        
        //2. second row, add uname and textbox
        Label lblCat2 = new Label("Category 2");
        TextField tfCat2 = new TextField();
        gp.add(lblCat2, 1, 3);
        gp.add(tfCat2, 2, 3);
        
        
        Label lblAdd = new Label("Add another Category 1");
        gp.add(lblAdd, 1, 4);
        
        Button btnlogout = new Button();
        btnlogout.setText("Log Out");
        gp.add(btnlogout, 0, 0);
        
        Button btnAdd = new Button();
        btnAdd.setText("+");
        gp.add(btnAdd, 0, 4);
        
        
        //4. add Button
        Button btnFin = new Button();
        btnFin.setText("Finalize");
        gp.add(btnFin, 1, 5);
        
        Button btnCancel = new Button();
        btnCancel.setText("Cancel");
        gp.add(btnCancel, 2, 5);
        
        btnlogout.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                //String cate1 = tfCat1.getText();
                //String cate2 = tfCat2.getText();
                
            }
        });
        
        btnAdd.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                String cate1 = tfCat1.getText();
                String cate2 = tfCat2.getText();
                
            }
        });
        
        
        
        
        // add handler
        btnFin.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                //String cate1 = tfCat1.getText();
                //String cate2 = tfCat2.getText();
                
            }
        });
        
        btnCancel.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
                
            }
        });
                
        Scene scene = new Scene(gp, 450, 250);
        /*scene.getStylesheets().add(
                Login.class.getResource("newCascadeStyleSheet.css").toExternalForm()
        );*/
        
        primaryStage.setTitle("Teacher");
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