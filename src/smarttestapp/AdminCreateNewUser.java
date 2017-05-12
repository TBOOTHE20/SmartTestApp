/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarttestapp;

import java.awt.Image;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;


/**
 *
 * @author csc190
 */
public class AdminCreateNewUser extends Application {
    
     @Override
    public void start(Stage primaryStage) {
        //1. add label Login Form/Occupies 2 columns
        GridPane gp = new GridPane();
        Label lblTitle = new Label("ADMIN CONSOLE");
        lblTitle.setFont(new Font("Arial", 16));
        gp.add(lblTitle, 0, 0, 2, 1);
        
         Label lblTitle2 = new Label("Create a New User");
         lblTitle2.setFont(new Font("Arial", 14));
        gp.add(lblTitle2, 0, 1, 2, 2);
        
        //2. second row, add pincode and textbox
        Label lblFir = new Label("First Name");
        TextField tfFir = new TextField();
        gp.add(lblFir, 0, 3);
        gp.add(tfFir, 1, 3);
        
        Label lblLas = new Label("Last Name");
        TextField tfLas = new TextField();
        gp.add(lblLas, 2, 3);
        gp.add(tfLas, 3, 3);
        
        Label lblUser = new Label("Username");
        TextField tfUser = new TextField();
        gp.add(lblUser, 0, 4);
        gp.add(tfUser, 1, 4);
        
        Label lblPwd = new Label("Password");
        PasswordField pf = new PasswordField();
        gp.add(lblPwd, 2, 4);
        gp.add(pf, 3, 4);
        
        
        //3. add Button
        Button btnCreate = new Button();
        btnCreate.setText("Create");
        gp.add(btnCreate, 1, 7);
        
        Button btnCancel = new Button();
        btnCancel.setText("Cancel");
        gp.add(btnCancel, 3, 7);
        
        //4. add handler
        btnCreate.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                String Start = tfFir.getText();
                //String pwd = pf.getText();
                
            }
        });
               
        Scene scene = new Scene(gp, 550, 250);
        /*scene.getStylesheets().add(
                Login.class.getResource("newCascadeStyleSheet.css").toExternalForm()
        );*/
        
        primaryStage.setTitle("Admin");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        //------     
        ToggleGroup group = new ToggleGroup();
    RadioButton button1 = new RadioButton("Teacher");
    button1.setToggleGroup(group);
    //button1.setSelected(true);
    gp.add(button1, 2, 5);
    RadioButton button2 = new RadioButton("Student");
    button2.setToggleGroup(group);
    gp.add(button2, 2, 6);
    
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}