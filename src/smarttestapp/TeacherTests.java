/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarttestapp;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
 
public class TeacherTests extends Application {
 
    private TableView<Person> table = new TableView<Person>();
    /*private final ObservableList<Person> data =
        FXCollections.observableArrayList(
            
        );
   */
    public static void main(String[] args) {
        launch(args);
    }
 
    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setTitle("Teacher");
        stage.setWidth(700);
        stage.setHeight(600);
 
        final Label label = new Label("TEACHER TESTS");
        label.setFont(new Font("Arial", 14));
 
        final Label label2 = new Label("- click on the Test to view performance");
        label2.setFont(new Font("Arial", 12));
        
        final Label label3 = new Label("- click on the Completion to get individual stats");
        label3.setFont(new Font("Arial", 12));
        
        table.setEditable(true);
 
        TableColumn dateCompletedCol = new TableColumn("Date Completed");
        dateCompletedCol.setMinWidth(200);
        dateCompletedCol.setCellValueFactory(
                new PropertyValueFactory<Person, String>("dateCompleted"));
 
        TableColumn testCol = new TableColumn("Test");
        testCol.setMinWidth(100);
        testCol.setCellValueFactory(
                new PropertyValueFactory<Person, String>("test"));
 
        TableColumn completionCol = new TableColumn("Completion");
        completionCol.setMinWidth(200);
        completionCol.setCellValueFactory(
                new PropertyValueFactory<Person, String>("completion"));
        
        
        //table.setItems(data);
        table.getColumns().addAll(dateCompletedCol, testCol, completionCol);
        
        final Button logoutButton = new Button("Log Out");
        logoutButton.setOnAction((ActionEvent e) -> {
            
        });
        
        
        final Button addNewTestButton = new Button("New Test");
        addNewTestButton.setOnAction((ActionEvent e) -> {
            
        });

        final Button uplLOButton = new Button("Upload Learning Outcome");
        uplLOButton.setOnAction((ActionEvent e) -> {
            
        });
        final HBox hb = new HBox();
        hb.getChildren().addAll(addNewTestButton, uplLOButton);
        hb.setSpacing(3);
        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        //addNewTestButton, uplLOButton,
        vbox.getChildren().addAll(logoutButton, label,hb,  table, label2, label3);
        ((Group) scene.getRoot()).getChildren().addAll(vbox);
        
       
        stage.setScene(scene);
        stage.show();
    }
 
    public static class Person {
 
        private final SimpleStringProperty dateCreated;
        private final SimpleStringProperty test;
        private final SimpleStringProperty completion;
      
        
 
        private Person(String dCreated, String testt, String compl) {
            this.dateCreated = new SimpleStringProperty(dCreated);
            this.test = new SimpleStringProperty(testt);
            this.completion = new SimpleStringProperty(compl);
            
            
        }
 
        public String getDateCreated() {
            return dateCreated.get();
        }
 
        public void setDateCreated(String dCreated) {
            dateCreated.set(dCreated);
        }
 
        public String getTest() {
            return test.get();
        }
 
        public void setTest(String testt) {
            test.set(testt);
        }
 
        public String getCompletion() {
            return completion.get();
        }
 
        public void setCompletion(String compl) {
            completion.set(compl);
        }
        
    }
} 

