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
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author csc190
 */
public class TeacherNewTestAddQ extends Application {
    
    //controls needed for app:
    CheckBox chksport1, chksport2, chksport3;
    VBox vbchecks;
    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setTitle("Student");
        stage.setWidth(700);
        stage.setHeight(600);
        
        final Label labelq = new Label("Question");
        labelq.setFont(new Font("Arial", 14));
        
        final TextField addq = new TextField();
        addq.setPromptText("question");
        
        final Label labela = new Label("Answer");//add the nametest variable - concatination
        labela.setFont(new Font("Arial", 14));
        
        final TextField adda = new TextField();
        adda.setPromptText("answer");
        
        
        //vbox for checkboxes     
       vbchecks = new VBox();
       vbchecks.setSpacing(10);
       vbchecks.setPadding(new Insets(20));
  
       //make 3 checkboxes
       chksport1=new CheckBox("Exampleoflearningoutcome");
       
       
    
       
       //add all things to vboxes
        vbchecks.getChildren().addAll(chksport1);
       
        
         //attach click-method to all 3 checkboxes
         chksport1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                //String uname = tfUser.getText();
                //String pwd = pf.getText();
                
            }
        });
         //GridPane gp = new GridPane();
        //chksport1.setOnAction(e -> handleButtonAction(e));
        //chksport2.setOnAction(e -> handleButtonAction(e));
        //chksport3.setOnAction(e -> handleButtonAction(e));
        //Scene scene = new Scene(gp, 300, 250);
        //create main container and add 2 vboxes to it
        FlowPane root = new FlowPane();
        root.setHgap(20);
        root.getChildren().addAll(vbchecks);
           
        
        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        //addNewTestButton, uplLOButton,
        vbox.getChildren().addAll(labelq,addq, labela, adda,root);
        ((Group) scene.getRoot()).getChildren().addAll(vbox);
        
        
        //Scene scene = new Scene(gp, 300, 250);
        //primaryStage.setTitle("Hello World!");
        //primaryStage.setScene(scene);
        //primaryStage.show();
        
        //1. add label Login Form/Occupies 2 columns
        //GridPane gp = new GridPane();
        
        
        /*Label lblq = new Label("Question");
        TextField tfq = new TextField();
        gp.add(lblq, 0, 1);
        gp.add(tfq, 1, 1);
        
        Label lbla = new Label("Answer");
        TextField tfa = new TextField();
        gp.add(lbla, 0, 2);
        gp.add(tfa, 1, 2);

        
        Label lblch = new Label("How many choices?");
        TextField tfch = new TextField();
        gp.add(lblch, 2, 2);
        gp.add(tfch, 3, 2);
        
        Label lblpv = new Label("Point Value");
        TextField tfpv = new TextField();
        gp.add(lblpv, 0, 3);
        gp.add(tfpv, 1, 3);
        
        Label lbllo = new Label("Learning Outcomes");
        gp.add(lbllo, 0, 4);
        
        
        //4. add Button
        Button btnAdd = new Button();
        btnAdd.setText("Add");
        gp.add(btnAdd, 2, 8);
        
        Button btnCancel = new Button();
        btnCancel.setText("Cancel");
        gp.add(btnCancel, 3, 8);
        
        
        //5. add handler
        btnAdd.setOnAction(new EventHandler<ActionEvent>() {
            
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
        
        */
        
        
        /*scene.getStylesheets().add(
                Login.class.getResource("newCascadeStyleSheet.css").toExternalForm()
        );*/
        
        stage.setTitle("Add Question");
        stage.setScene(scene);
        stage.show();
    }

    
   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}    