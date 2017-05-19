/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarttestapp;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author csc190
 */
public class UploadLO extends Application {
    
   
    //global variables
    GridPane gp, gp2;
    Label lblTitle, lblCat1, lblCat2, lblAdd,lblTeachertestheading,
           lblTableTitleDateCreate,lblTableTitleTest,lblTableTitleCompletion,
           lbViewPerformancetxt, lbViewCompletiontxt;
    Button btnlogout, btnAdd, btnFin, btnCancel, btnLogout,btnDptLearningOutcome,
            btnUpload,addNewTestButton, btn2; 
    Scene scene, scene2; 
    Stage thestage;
    Test t,t2; 
    TeacherTests tati; 
     HBox hbBtn, hbTeacherlbl; 
     int spot, spotcolumn;
    TextField tfCat1, tfCat2;
    String cate1, cate2, loContent;
     
    @Override
    public void start(Stage primaryStage) {
        
        thestage = primaryStage;
        
        //1. add label Login Form/Occupies 2 columns
        gp = new GridPane();
        gp2= new GridPane();
        
        scene = new Scene(gp, 450, 250);
        scene2 = new Scene(gp2, 900, 900);
        
        lblTitle = new Label("Add Learning Outcome");
        gp.add(lblTitle, 0, 1, 2, 1);
        
        //2. second row, add uname and textbox
        lblCat1 = new Label("Category 1");
        tfCat1 = new TextField();
        gp.add(lblCat1, 0, 2);
        gp.add(tfCat1, 1, 2);
        
        //2. second row, add uname and textbox
        lblCat2 = new Label("Category 2");
        tfCat2 = new TextField();
        gp.add(lblCat2, 1, 3);
        gp.add(tfCat2, 2, 3);
        
        
        lblAdd = new Label("Add another Category 1");
        gp.add(lblAdd, 1, 4);
        
        btnlogout = new Button();
        btnlogout.setText("Log Out");
        gp.add(btnlogout, 0, 0);
        
        btnAdd = new Button();
        btnAdd.setText("+");
        gp.add(btnAdd, 0, 4);
        
        
        //4. add Button
        btnFin = new Button();
        btnFin.setText("Finalize");
        gp.add(btnFin, 1, 5);
        
       btnCancel = new Button();
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
                //String cate1 = tfCat1.getText();
                //String cate2 = tfCat2.getText();
               
                
            }
        });
        
        
        
        
        // add handler
        btnFin.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                cate1 = tfCat1.getText();
                cate2 = tfCat2.getText();
                if(cate1 == null && cate2 == null){
                     Alert al = new Alert(Alert.AlertType.INFORMATION);
                     al.setContentText("Please fill in the categories");
                     al.showAndWait();
                }
                else{
                    Category2 [] arrCat = new Category2[]{
                        new Category2(cate2)
                    };
                    Category1 [] arrCat1 = new Category1[]{
                        new Category1(cate1, arrCat)
                    };
                    LearningOutcomes newLO = new LearningOutcomes("LearningOutcome1",arrCat1);
                    String url = "http://localhost/smart.php";
                    loContent = Utils.toStr(newLO);
                    String qry = "INSERT INTO loutcome (name, lval) VALUES('"+ cate1 +"', '"+ loContent +"')";
                    Utils.execNonQuery(qry);
                    String response;
                    try {
                        response = Utils.httpsPost(url, loContent);
                        System.out.println(response);
                    } catch (Exception ex) {
                        Logger.getLogger(UploadLO.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Alert al = new Alert(Alert.AlertType.INFORMATION);
                        al.setContentText("The user has been added to the database.");
                        al.showAndWait();  
                    }
                thestage.setScene(scene2); 
                
            }
        });
        
        btnCancel.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                 thestage.setScene(scene2);
                
            }
        });
                
        
        /*scene.getStylesheets().add(
                Login.class.getResource("newCascadeStyleSheet.css").toExternalForm()
        );*/
        
        
     

  /*
        //sample test created and checked to make sure the test eggs were made
        t = new Test();
        t.addTestName("test1");
        t.addTestPin("111");
        
        t2 = new Test();
        t2.addTestName("test2");
        t2.addTestPin("222");
                
        System.out.println("Testname: " + t.Testname + ", PinId: " + t2.PinId);
 
    
        //add the newly created test to an ArrayList and check to see if its added to Test array
        ArrayList<Test> ttests = new ArrayList();
        ttests.add(t);
        ttests.add(t2);
        
        System.out.println("Testname: " + ttests.get(1).Testname + ", PinId: " + ttests.get(0).PinId);
      
        //created a teachertest egg which will hold all the test for that specific teacher
        tati = new TeacherTests();
        tati.TeacherTestsaddList(ttests);
        //double checking to make sure all of tati tests are in her array and can be found
        System.out.println("Testname: " + tati.getTestinfo("222")+"!");
      */  
        
        //sp = new ScrollPane();
     
        
       // sp.setContent(gp2);
        //instance = this;
       
        thestage.setTitle("SmartTest");
        
        
        gp2.setGridLinesVisible(true);//too see grid lines
        gp2.setVgap(10);
        gp2.setHgap(10);
        gp2.setPadding(new Insets(10,10,10,10));
        
        
        //created the button then placed it in a hbox layout pane so i can set
        //a different alignment from the gridpane 
        btnLogout = new Button("Log Out");     
        btnLogout.setFont(new Font("Arial", 20));
        hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.CENTER);
        hbBtn.getChildren().add(btnLogout);
        gp2.add(hbBtn, 4, 0);
       
        btnLogout.setOnAction((ActionEvent e) -> {
            //go to homepage scene of SmartTest
            
            
        });
        
        lblTeachertestheading = new Label("TEACHER TESTS");
        lblTeachertestheading.setFont(new Font("Arial", 16));
        //lblTeachertestheading.setStyle("-fx-padding:5");
        hbTeacherlbl = new HBox(10);
        hbTeacherlbl.setAlignment(Pos.CENTER);
        hbTeacherlbl.getChildren().add(lblTeachertestheading);
        gp2.add(lblTeachertestheading,0,1);
        
        btnDptLearningOutcome = new Button("Department Learning Outcome");
         gp2.add(btnDptLearningOutcome,3,1);
         btnDptLearningOutcome.setOnAction((ActionEvent e) -> {
            //need to go to Department Stage
            
            
        });
         
        
       /* addNewTestButton = new Button("New Test");
        gp2.add(addNewTestButton,0,2);
        addNewTestButton.setOnAction((ActionEvent e) -> {
            TeacherNewTest newtest = new TeacherNewTest();
             newtest.initcreatetestscreen();
             newtest.showAndWait();
            
            
        });*/
        

        btnUpload = new Button("Upload Learning Outcome");
        gp2.add(btnUpload,1,2);
        btnUpload.setOnAction((ActionEvent e) -> {
             thestage.setScene(scene);
            
        });
        //TABLE CREATION
        lblTableTitleDateCreate = new Label("Date Created");
        lblTableTitleTest = new Label("Test");
        lblTableTitleCompletion = new Label("Completion");
        
        
        
        gp2.add(lblTableTitleDateCreate,0,3);
        gp2.add(lblTableTitleTest,1,3);
        gp2.add(lblTableTitleCompletion,2,3);
        
        /*spot = 4;
        spotcolumn=0;
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
            btn2 = new Button();
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
 
        lbViewPerformancetxt = new Label("- click on the Test to view performance");
        lbViewPerformancetxt.setFont(new Font("Arial", 12));
        gp2.add(lbViewPerformancetxt,4,8);
        
        lbViewCompletiontxt = new Label("- click on the Completion to get individual stats");
        lbViewCompletiontxt.setFont(new Font("Arial", 12));
        gp2.add(lbViewCompletiontxt,4,9);
        
       
        thestage.setTitle("Teacher");
        thestage.setScene(scene);
        thestage.show();
        
       
    

    //data members
   /*
    public ArrayList<Test> myListofTest;
    protected ScrollPane sp;
    protected GridPane gp;
    public TeacherHomepage instance = null;*/
    }
     /**
         * 
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            launch(args);
        }
         
}