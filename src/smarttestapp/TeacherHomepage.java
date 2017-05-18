/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarttestapp;

import static com.sun.deploy.util.SessionState.save;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import smarttestapp.model.Test;
import smarttestapp.model.TeacherTests;
  

public class TeacherHomepage extends Application {
 
    
    @Override
    public void start(Stage stage) {
        
        //sample test created and checked to make sure the test eggs were made
        Test t = new Test();
        t.addTestName("test1");
        t.addTestPin("111");
        
        Test t2 = new Test();
        t2.addTestName("test2");
        t2.addTestPin("222");
                
        System.out.println("Testname: " + t.Testname + ", PinId: " + t2.PinId);
        
        //add the newly created test to an ArrayList and check to see if its added to Test array
        ArrayList<Test> ttests = new ArrayList();
        ttests.add(t);
        ttests.add(t2);
        
        System.out.println("Testname: " + ttests.get(1).Testname + ", PinId: " + ttests.get(0).PinId);
        
        //created a teachertest egg which will hold all the test for that specific teacher
        TeacherTests tati = new TeacherTests();
        tati.TeacherTestsaddList(ttests);
        //double checking to make sure all of tati tests are in her array and can be found
        System.out.println("Testname: " + tati.getTestinfo("222")+"!");
        
        
        sp = new ScrollPane();
        gp = new GridPane();
        
        sp.setContent(gp);
        instance = this;
        Scene scene = new Scene(sp, 1000, 1000);
        stage.setTitle("SmartTest");
        stage.setScene(scene);
        
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
        
        Label lblTeachertestheading = new Label("TEACHER TESTS");
        lblTeachertestheading.setFont(new Font("Arial", 16));
        //lblTeachertestheading.setStyle("-fx-padding:5");
        HBox hbTeacherlbl = new HBox(10);
        hbTeacherlbl.setAlignment(Pos.CENTER);
        hbTeacherlbl.getChildren().add(lblTeachertestheading);
        gp.add(lblTeachertestheading,0,1);
        
         Button btnDptLearningOutcome = new Button("Department Learning Outcome");
         gp.add(btnDptLearningOutcome,3,1);
         btnDptLearningOutcome.setOnAction((ActionEvent e) -> {
            //need to go to Department Stage
            
            
        });
         
        
        Button addNewTestButton = new Button("New Test");
        gp.add(addNewTestButton,0,2);
        addNewTestButton.setOnAction((ActionEvent e) -> {
            TeacherNewTest newtest = new TeacherNewTest();
             newtest.initcreatetestscreen();
             newtest.showAndWait();
            
            
        });
        

        Button btnUpload = new Button("Upload Learning Outcome");
        gp.add(btnUpload,1,2);
        btnUpload.setOnAction((ActionEvent e) -> {
            
        });
        //TABLE CREATION
        Label lblTableTitleDateCreate = new Label("Date Created");
        Label lblTableTitleTest = new Label("Test");
        Label lblTableTitleCompletion = new Label("Completion");
        
        gp.add(lblTableTitleDateCreate,0,3);
        gp.add(lblTableTitleTest,1,3);
        gp.add(lblTableTitleCompletion,2,3);
        
        int spot = 4;
        int spotcolumn=0;
        for(int i=0; i<ttests.size(); i++){
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
            
            
        }
        
        //BOTTOM OF PAGE
 
        Label lbViewPerformancetxt = new Label("- click on the Test to view performance");
        lbViewPerformancetxt.setFont(new Font("Arial", 12));
        gp.add(lbViewPerformancetxt,4,8);
        
        Label lbViewCompletiontxt = new Label("- click on the Completion to get individual stats");
        lbViewCompletiontxt.setFont(new Font("Arial", 12));
        gp.add(lbViewCompletiontxt,4,9);
        
       
        
        stage.setScene(scene);
        stage.show();
        
         
    }

  
   
   
    
 
   
   public static void main(String[] args) {
        launch(args);
    }
    //data members
   
    public ArrayList<Test> myListofTest;
    protected ScrollPane sp;
    protected GridPane gp;
    public TeacherHomepage instance = null;

}