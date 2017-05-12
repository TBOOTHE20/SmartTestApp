/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarttestapp;

import java.awt.Rectangle;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author csc190
 */
public class TeacherExampleLearningOutcomeStats extends Application {
 
    private TableView<Person> table = new TableView<Person>();
    /*private final ObservableList<Person> data =
        FXCollections.observableArrayList(
            
        );
    */
    
    private TableView<Person> table2 = new TableView<Person>();
    /*private final ObservableList<Person> data =
        FXCollections.observableArrayList(
            
        );
    */
   
    public static void main(String[] args) {
        launch(args);
    }
    
    //Creating scroll pane
    final ScrollPane sp = new ScrollPane();
    
    @Override
    public void start(Stage stage) {
        
        
        
        Scene scene = new Scene(new Group());
        
        stage.setTitle("Teacher");
        stage.setWidth(700);
        stage.setHeight(600);
 
       
        
        
        
        final Label label = new Label("LEARNING OUTCOME STATS");//add the nametest variable - concatination
        label.setFont(new Font("Arial", 14));
 
        
        
        table.setEditable(true);
        table2.setEditable(true);
        
        
        //table1
        TableColumn lOlevel1Col = new TableColumn("Learning Outcome Level 1");
        lOlevel1Col.setMinWidth(250);
        lOlevel1Col.setCellValueFactory(
                new PropertyValueFactory<Person, String>("lolevel1"));
 
        TableColumn perCol = new TableColumn("Percentage");
        perCol.setMinWidth(250);
        perCol.setCellValueFactory(
                new PropertyValueFactory<Person, String>("percentage"));
 
        //table2
        TableColumn lOlevel2Col = new TableColumn("Learning Outcome Level 2");
        lOlevel2Col.setMinWidth(250);
        lOlevel2Col.setCellValueFactory(
                new PropertyValueFactory<Person2, String>("lolevel2"));
 
        
        TableColumn per2Col = new TableColumn("Percentage");
        per2Col.setMinWidth(250);
        per2Col.setCellValueFactory(
                new PropertyValueFactory<Person2, String>("percentage2"));
        
        
        //table.setItems(data);
        //table 1
        table.getColumns().addAll(lOlevel1Col, perCol);
        //table 2
        table2.getColumns().addAll(lOlevel2Col, per2Col);
        
        
        
        
        //sp.setContent(table);
        //sp.setPrefSize(600, 200);
        sp.setHbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        sp.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        //layout.setRight(table);
        
        
        BorderPane.setMargin(sp, new Insets(0,0,10,10));
        
        
        
        final Button logoutButton = new Button("Log Out");
        logoutButton.setOnAction((ActionEvent e) -> {
            
        });
        
        final Button deptloButton = new Button("Department Learning Outcome");
        deptloButton.setOnAction((ActionEvent e) -> {
            
        });
        
        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        //addNewTestButton, uplLOButton,
        vbox.getChildren().addAll(logoutButton, label, deptloButton, table, table2);
        ((Group) scene.getRoot()).getChildren().addAll(vbox);
       
        
        
       
        stage.setScene(scene);
        stage.show();
    }
 
    public static class Person {
 
        private final SimpleStringProperty lolev1;
        private final SimpleStringProperty per;
        
      
        
 
        private Person(String lo, String p) {
            this.lolev1 = new SimpleStringProperty(lo);
            this.per = new SimpleStringProperty(p);
           
            
            
        }
 
        public String getLOLevel1() {
            return lolev1.get();
        }
 
        public void setLOLevel1(String lo) {
            lolev1.set(lo);
        }
 
        public String getPercentage() {
            return per.get();
        }
 
        public void setPercentage(String p) {
            per.set(p);
        }
        
    }
    
    //for second table
    public static class Person2 {
 
        private final SimpleStringProperty lolev2;
        private final SimpleStringProperty per2;
        
      
        
 
        private Person2(String lo2, String p2) {
            this.lolev2 = new SimpleStringProperty(lo2);
            this.per2 = new SimpleStringProperty(p2);
           
            
            
        }
 
        public String getLOLevel2() {
            return lolev2.get();
        }
 
        public void setLOLevel2(String lo2) {
            lolev2.set(lo2);
        }
 
        public String getPercentag2() {
            return per2.get();
        }
 
        public void setPercentage2(String p2) {
            per2.set(p2);
        }
        
    }
    
    
    
} 


