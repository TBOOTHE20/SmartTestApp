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
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
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
public class AdminResetPassword extends Application {
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
        Label lblTitle = new Label("ADMIN CONSOLE");
        gp.add(lblTitle, 0, 0, 2, 1);
        
         Label lblTitle2 = new Label("Reset Password");
        gp.add(lblTitle2, 0, 1, 2, 2);

        
        //2. second row, add pincode and textbox
        Label lblFir = new Label("User Information");
        TextField tfFir = new TextField();
        gp.add(lblFir, 0, 3);
        gp.add(tfFir, 1, 3);
        //2. second row, add uname and textbox
        Label lblPwd = new Label("New Password");
        PasswordField pf = new PasswordField();
        gp.add(lblPwd, 0, 4);
        gp.add(pf, 1, 4);
        
        //3. third row, add password
        Label lblCPwd = new Label("Confirm New Password");
        PasswordField cpf = new PasswordField();
        gp.add(lblCPwd, 0, 5);
        gp.add(cpf, 1, 5);
        
        //4. add Button
        Button btnConfirm = new Button();
        btnConfirm.setText("Confirm");
        gp.add(btnConfirm, 0, 6);
        
        Button btnCancel = new Button();
        btnCancel.setText("Cancel");
        gp.add(btnCancel, 1, 6);
        
        //5. add handler
        btnConfirm.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                //String uname = tfUser.getText();
                //String pwd = pf.getText();
                
            }
        });    
        btnCancel.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                //String uname = tfUser.getText();
                //String pwd = pf.getText();
                
            }
            
        });
        
                
        Scene scene = new Scene(gp, 450, 250);
        /*scene.getStylesheets().add(
                Login.class.getResource("newCascadeStyleSheet.css").toExternalForm()
        );*/
        
        primaryStage.setTitle("Admin");
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