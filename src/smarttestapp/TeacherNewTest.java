/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarttestapp;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import javafx.stage.Stage;
import static smarttestapp.AddQuestionStage.instance;


import smarttestapp.model.Test;

/**
 *
 * @author csc190
 */
public class TeacherNewTest extends Stage {
    
    private TableView<Test> table = new TableView<Test>();
    protected ScrollPane sp;
    protected GridPane gp;
    static TeacherNewTest instance = null;
   
    public TeacherNewTest()
   {
        
        sp = new ScrollPane();
        gp = new GridPane();
        
        sp.setContent(gp);
        instance = this;
        Scene scene = new Scene(sp, 750, 900);
        this.setTitle("New Test");
        this.setScene(scene);
       
    }
    
    
    public void initcreatetestscreen() {
        
        Scene scene = new Scene(new Group());
      /*  stage.setTitle("SmartTest");
        stage.setWidth(950);
        stage.setHeight(620);*/
        
        Label lblTitle = new Label("NEW TEST");
       
        Label lblTitle2 = new Label("Test Name:");
        
        
        TextField addTestName = new TextField();
        addTestName.setPromptText("Test Name");
        
        Label lblPinNr = new Label("Pin Number:");
        TextField addPinId = new TextField();
        addPinId.setPromptText("Test Name");
        
         
        table.setEditable(true);
        
        TableColumn checkBoxCol = new TableColumn("Select");
        checkBoxCol.setMinWidth(100);
        checkBoxCol.setCellValueFactory(
                new PropertyValueFactory<Test, String>("checkBox"));

        TableColumn questionCol = new TableColumn("Question");
        questionCol.setMinWidth(100);
        questionCol.setCellValueFactory(
                new PropertyValueFactory<Test, String>("question"));
 
        TableColumn choiceCol = new TableColumn("Choices");
        choiceCol.setMinWidth(100);
        choiceCol.setCellValueFactory(
                new PropertyValueFactory<Test, String>("choice"));
 
        TableColumn answerCol = new TableColumn("Answer");
        answerCol.setMinWidth(200);
        answerCol.setCellValueFactory(
                new PropertyValueFactory<Test, String>("answer"));
 
        TableColumn pointvalueCol = new TableColumn("Point Value");
        pointvalueCol.setMinWidth(200);
        pointvalueCol.setCellValueFactory(
                new PropertyValueFactory<Test, String>("pointvalue"));        
        
        TableColumn leouCol = new TableColumn("Learning Outcome(s)");
        leouCol.setMinWidth(200);
        leouCol.setCellValueFactory(
                new PropertyValueFactory<Test, String>("leou"));
        
        
        final Button logoutButton = new Button("Log Out");
        logoutButton.setOnAction((ActionEvent e) -> {
            
        });
        
        
        //table.setItems(data);
        //when a teacher clicks the add button a new scene pops up so the teacher can make a question
        final Button addQButton = new Button("Add Question");
        addQButton.setOnAction((ActionEvent e) -> {
             AddQuestionStage qs = new AddQuestionStage();
             qs.initaddquestionscreen();
             qs.showAndWait();
            
        });
        
        final Button deleteQButton = new Button("Delete Question");
        deleteQButton.setOnAction((ActionEvent e) -> {
            
        });
        
        
        table.getColumns().addAll(checkBoxCol, questionCol, choiceCol, answerCol,pointvalueCol, leouCol);
        
        final Button finButton = new Button("Finalize");
        finButton.setOnAction((ActionEvent e) -> {
            
        });
        
        final Button cancelButton = new Button("Cancel");
        cancelButton.setOnAction((ActionEvent e) -> {
            
        });
        
        final HBox hb = new HBox();
        hb.getChildren().addAll(lblTitle2, addTestName, lblPinNr, addPinId);
        hb.setSpacing(3);
        
        final HBox hb1 = new HBox();
        hb1.getChildren().addAll(addQButton , deleteQButton);
        hb1.setSpacing(3);
        
        final HBox hb2 = new HBox();
        hb2.getChildren().addAll(finButton , cancelButton);
        hb2.setSpacing(3);
        
        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(logoutButton, lblTitle, hb, hb1, table, hb2);
 
        ((Group) scene.getRoot()).getChildren().addAll(vbox);

       // stage.setScene(scene);
        //stage.show();
    }

    
    

    /**
     * @param args the command line arguments
     */
 /*   public static void main(String[] args) {
        launch(args);
    }*/
    
}
