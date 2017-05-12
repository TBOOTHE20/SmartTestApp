/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarttestapp;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author csc190
 */
public class StudentExampleTest extends Application {
    
     @Override
    public void start(Stage primaryStage) {
        //1. add label Login Form/Occupies 2 columns
        GridPane gp = new GridPane();
        Label lblTitle = new Label("Test:");
        gp.add(lblTitle, 0, 0, 2, 1);
        
        
        //2. second row, add pincode and textbox
        Label lblFir = new Label("QuestionExample");
        gp.add(lblFir, 0, 2, 3, 1);
        
        Label lblpt = new Label("pt"); //add value of points given 
        gp.add(lblpt, 3, 2);
        
        //3. add Button
        Button subtes = new Button();
        subtes.setText("Submit Test");
        gp.add(subtes, 4, 4);
        
        
        
        //4. add handler
        subtes.setOnAction(new EventHandler<ActionEvent>() {
            
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
        
        //------     
        ToggleGroup group = new ToggleGroup();
        RadioButton button1 = new RadioButton("choice1");
        button1.setToggleGroup(group);
        //button1.setSelected(true);
        gp.add(button1, 1, 3);
        
        RadioButton button2 = new RadioButton("choice2");
        button2.setToggleGroup(group);
        gp.add(button2, 2, 3);
        
        
        RadioButton button3 = new RadioButton("choice3");
        button3.setToggleGroup(group);
        //button1.setSelected(true);
        gp.add(button3, 3, 3);
        
        
        RadioButton button4 = new RadioButton("choice4");
        button4.setToggleGroup(group);
        gp.add(button4, 4, 3);
    
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}