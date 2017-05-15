package smarttestapp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import 
/**
 *
 * @author csc190
 */
public class StudentHomePg extends Application {
    
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
        stage.setTitle("Student");
        stage.setWidth(700);
        stage.setHeight(600);
 
        final Label labelstut = new Label("STUDENT TESTS");
        labelstut.setFont(new Font("Arial", 14));
        
        final Label labelpin = new Label("Pincode:");//add the nametest variable - concatination
        labelpin.setFont(new Font("Arial", 14));
        
        final TextField addpin = new TextField();
        addpin.setPromptText("Pincode");
        
        table.setEditable(true);
 
        TableColumn testCol = new TableColumn("Test");
        testCol.setMinWidth(130);
        testCol.setCellValueFactory(
                new PropertyValueFactory<Person, String>("test"));
 
        TableColumn gradeCol = new TableColumn("Grade");
        gradeCol.setMinWidth(100);
        gradeCol.setCellValueFactory(
                new PropertyValueFactory<Person, String>("grade"));
 
        
        
        
        //table.setItems(data);
        table.getColumns().addAll(testCol, gradeCol);
        
        final Button startButton = new Button("Start");
        startButton.setOnAction((ActionEvent e) -> {
            StudExTestStage newst = new StudExTestStage();
            
            
        });
     
        final HBox hb2 = new HBox();
        hb2.getChildren().addAll( labelpin, addpin, startButton);
        hb2.setSpacing(3);

        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        //addNewTestButton, uplLOButton,
        vbox.getChildren().addAll(labelstut, hb2, table);
        ((Group) scene.getRoot()).getChildren().addAll(vbox);
        
       
        stage.setScene(scene);
        stage.show();
    }
 
    public static class Person {
 
        private final SimpleStringProperty test;
        private final SimpleStringProperty grade;
        
      
        
 
        private Person(String t, String gr) {
            this.test = new SimpleStringProperty(t);
            this.grade = new SimpleStringProperty(gr);
           
            
            
        }
 
        public String getTest() {
            return test.get();
        }
 
        public void setTest(String t) {
            test.set(t);
        }
 
        public String getGrade() {
            return grade.get();
        }
 
        public void setGrade(String gr) {
            grade.set(gr);
        }
        
    }
} 


