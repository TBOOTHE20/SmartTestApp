/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarttestapp;

import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

import javafx.stage.Stage;


import smarttestapp.model.Test;

/**
 *
 * @author csc190
 */
public class TeacherNewTest extends Stage {
    
    
    public ScrollPane sp;
    public GridPane gp;
    static TeacherNewTest instance = null;
    public TextField tfTestname;
    public TextField tfPinId;
    public Test nt;
    
   
    public TeacherNewTest()
   {
        
        sp = new ScrollPane();
        gp = new GridPane();
        
        sp.setContent(gp);
        instance = this;
        Scene scene = new Scene(sp, 850, 900);
        this.setTitle("New Test");
        this.setScene(scene);
       
    }
    
    
    public void initcreatetestscreen() {
        
        
        
        gp.setGridLinesVisible(true);//too see grid lines
        gp.setVgap(10);
        gp.setHgap(10);
        gp.setPadding(new Insets(10,10,10,10));
        
        
        //created the button then placed it in a hbox layout pane so i can set
        //a different alignment from the gridpane 
        Button btnLogout = new Button("Log Out");     
        btnLogout.setFont(new Font("Arial", 20));
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.CENTER);
        hbBtn.getChildren().add(btnLogout);
        gp.add(hbBtn, 4, 0);
       
        btnLogout.setOnAction((ActionEvent e) -> {
            //go to homepage scene of SmartTest
            
            
        });
        
        Label lbNewtestheading = new Label("NEW TEST");
        lbNewtestheading.setFont(new Font("Arial", 16));
        HBox hbNewTestlbl = new HBox(10);
        hbNewTestlbl.setAlignment(Pos.CENTER);
        hbNewTestlbl.getChildren().add(lbNewtestheading);
        gp.add(lbNewtestheading,0,1);
        
        Label lblTestName = new Label("Test Name: ");
        gp.add(lblTestName,0,2);
        
        tfTestname = new TextField();
        gp.add(tfTestname,1,2);
        
        Label lblPin = new Label("New Pin Id: ");
        gp.add(lblPin,2,2);
        
        tfPinId = new TextField();
        gp.add(tfPinId,3,2);
        
        Test nt = new Test();
        
        
        //for testing text field
        Button PrintButton = new Button("Print");
        gp.add(PrintButton,4,2);
        PrintButton.setOnAction((ActionEvent e) -> {
            
             
             nt.Testname=tfTestname.getText();
             nt.PinId=tfPinId.getText();
             System.out.print(nt.Testname+""+nt.PinId);
            
        });
        
        Button addQuestionButton = new Button("Add Question");
        gp.add(addQuestionButton,0,3);
        addQuestionButton.setOnAction((ActionEvent e) -> {
            //when my add question is clicked I pass the test egg so it can have questions added to it
             AddQuestionStage ef = new AddQuestionStage();
             System.out.print("Hi Im a test and my testname is "+nt.Testname);
             ef.initAddQuestionStage(nt);
             ef.showAndWait();
                         
            
        });
        

        Button btnDelete = new Button("Delete Question");
        gp.add(btnDelete,1,3);
        btnDelete.setOnAction((ActionEvent e) -> {
            
        });
        
        //TABLE CREATION
        Label lblTableTitleSelectQuestion = new Label("Select");
        Label lblTableTitleQuestion = new Label("Question");
        Label lblTableTitleChoices = new Label("Choices");
        Label lblTableTitlePointValue = new Label("Point Value");
        Label lblTableTitleLearningOutcome = new Label("LearningOutcomes(s)");
                
        gp.add(lblTableTitleSelectQuestion,0,4);
        gp.add(lblTableTitleQuestion,1,4);
        gp.add(lblTableTitleChoices,2,4);
        gp.add(lblTableTitlePointValue,3,4);
        gp.add(lblTableTitleLearningOutcome,4,4);
        /*
        int spot = 4;
        int spotcolumn=0;
        for(int i=0; i<nt.size(); i++){
            Test a = ttests.get(i);
            Label lbl = new Label(a.Testname);
            Button btn = new Button();
            btn.setText("Test info for"+a.Testname);
            btn.setOnAction(new EventHandler<ActionEvent>() {            
                @Override //Show test information based on selected test
                public void handle(ActionEvent event) {
                    AddQuestionStage ef = new AddQuestionStage();
                    ef.showAndWait();
                }
            });
            Button btn2 = new Button();
            btn2.setText("Completion info for"+a.PinId);
            btn2.setOnAction(new EventHandler<ActionEvent>() {            
                @Override //Show completion information based on selected test
                public void handle(ActionEvent event) {
                    AddQuestionStage ef = new AddQuestionStage();
                    ef.showAndWait();
                }
            });
            gp.add(lbl, spotcolumn, spot);
            gp.add(btn, spotcolumn+1,spot);
            gp.add(btn2, spotcolumn+2,spot);
            spot++;//increment the row
            
            
        }*/
        
        //BOTTOM OF PAGE
 
        Label lbViewPerformancetxt = new Label("- click on the Test to view performance");
        lbViewPerformancetxt.setFont(new Font("Arial", 12));
        gp.add(lbViewPerformancetxt,4,8);
        
        Label lbViewCompletiontxt = new Label("- click on the Completion to get individual stats");
        lbViewCompletiontxt.setFont(new Font("Arial", 12));
        gp.add(lbViewCompletiontxt,4,9);
        
        
        
        //stage.setScene(scene);
        //stage.show();
        
         
    }
    
    

    
    

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        launch(args);
    }
    
}
