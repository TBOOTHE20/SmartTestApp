/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;


import javafx.application.Application;
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
public class Login extends Application {
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
        Label lblTitle = new Label("Welcome to SmartTest");
        gp.add(lblTitle, 0, 0, 2, 1);
        
        //2. second row, add uname and textbox
        Label lblUsr = new Label("User Name");
        TextField tfUser = new TextField();
        gp.add(lblUsr, 0, 1);
        gp.add(tfUser, 1, 1);
        
        //3. third row, add password
        Label lblPwd = new Label("Password");
        PasswordField pf = new PasswordField();
        gp.add(lblPwd, 0, 2);
        gp.add(pf, 1, 2);
        
        //4. add Button
        Button btnLogin = new Button();
        btnLogin.setText("Login");
        gp.add(btnLogin, 1, 3);
        
        
        //5. add handler
        btnLogin.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                String uname = tfUser.getText();
                String pwd = pf.getText();
                
            }
        });
        
                
        Scene scene = new Scene(gp, 300, 250);
        /*scene.getStylesheets().add(
                Login.class.getResource("newCascadeStyleSheet.css").toExternalForm()
        );*/
        
        primaryStage.setTitle("Login Form");
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