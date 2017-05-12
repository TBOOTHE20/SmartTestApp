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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author csc190
 */
public class TeacherExampleTest extends Application {
 
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
 
        final Label label = new Label("TEST");//add the nametest variable - concatination
        label.setFont(new Font("Arial", 14));
 
        
        
        table.setEditable(true);
 
        TableColumn dateCompletedCol = new TableColumn("Student");
        dateCompletedCol.setMinWidth(130);
        dateCompletedCol.setCellValueFactory(
                new PropertyValueFactory<Person, String>("student"));
 
        TableColumn testCol = new TableColumn("Grade");
        testCol.setMinWidth(100);
        testCol.setCellValueFactory(
                new PropertyValueFactory<Person, String>("grade"));
 
        
        
        
        //table.setItems(data);
        table.getColumns().addAll(dateCompletedCol, testCol);
        
        final Button logoutButton = new Button("Log Out");
        logoutButton.setOnAction((ActionEvent e) -> {
            
        });
        
        
       

        
        
        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        //addNewTestButton, uplLOButton,
        vbox.getChildren().addAll(logoutButton, label,  table);
        ((Group) scene.getRoot()).getChildren().addAll(vbox);
        
       
        stage.setScene(scene);
        stage.show();
    }
 
    public static class Person {
 
        private final SimpleStringProperty student;
        private final SimpleStringProperty grade;
        
      
        
 
        private Person(String stud, String gr) {
            this.student = new SimpleStringProperty(stud);
            this.grade = new SimpleStringProperty(gr);
           
            
            
        }
 
        public String getStudent() {
            return student.get();
        }
 
        public void setStudent(String stud) {
            student.set(stud);
        }
 
        public String getGrade() {
            return grade.get();
        }
 
        public void setGrade(String gr) {
            grade.set(gr);
        }
        
    }
} 

