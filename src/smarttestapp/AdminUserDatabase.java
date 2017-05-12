/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarttestapp;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
 
public class AdminUserDatabase extends Application {
 
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
        
        GridPane gp = new GridPane();
        Scene scene = new Scene(new Group());
        stage.setTitle("Admin");
        stage.setWidth(700);
        stage.setHeight(600);
        
        final Label lblTitle = new Label("ADMIN CONSOLE");
        lblTitle.setFont(new Font("Arial", 16));
 
        final Label lblTitle2 = new Label("User Database");
        lblTitle2.setFont(new Font("Arial", 14));

        //final Label label = new Label("User Database");
        //label.setFont(new Font("Arial", 20));
 
        table.setEditable(true);
 
        TableColumn firstNameCol = new TableColumn("First Name");
        firstNameCol.setMinWidth(100);
        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<Person, String>("firstName"));
 
        TableColumn lastNameCol = new TableColumn("Last Name");
        lastNameCol.setMinWidth(100);
        lastNameCol.setCellValueFactory(
                new PropertyValueFactory<Person, String>("lastName"));
 
        TableColumn userNameCol = new TableColumn("User Name");
        userNameCol.setMinWidth(200);
        userNameCol.setCellValueFactory(
                new PropertyValueFactory<Person, String>("userName"));
 
        TableColumn statusCol = new TableColumn("Status");
        statusCol.setMinWidth(200);
        statusCol.setCellValueFactory(
                new PropertyValueFactory<Person, String>("status"));        
        
        //table.setItems(data);
        table.getColumns().addAll(firstNameCol, lastNameCol, userNameCol,statusCol);
        final Button backButton = new Button("Back");
        backButton.setOnAction((ActionEvent e) -> {
            
        });
        
        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(lblTitle, lblTitle2, table, backButton);
 
        ((Group) scene.getRoot()).getChildren().addAll(vbox);

        stage.setScene(scene);
        stage.show();
    }
 
    public static class Person {
 
        private final SimpleStringProperty firstName;
        private final SimpleStringProperty lastName;
        private final SimpleStringProperty userName;
        private final SimpleStringProperty status;
        
 
        private Person(String fName, String lName, String UName, String Stat) {
            this.firstName = new SimpleStringProperty(fName);
            this.lastName = new SimpleStringProperty(lName);
            this.userName = new SimpleStringProperty(UName);
            this.status = new SimpleStringProperty(Stat);
            
        }
 
        public String getFirstName() {
            return firstName.get();
        }
 
        public void setFirstName(String fName) {
            firstName.set(fName);
        }
 
        public String getLastName() {
            return lastName.get();
        }
 
        public void setLastName(String lName) {
            lastName.set(lName);
        }
 
        public String getuserName() {
            return userName.get();
        }
 
        public void setuserName(String UName) {
            userName.set(UName);
        }
        
        public String getstatus() {
            return status.get();
        }
 
        public void setstatus(String Stat) {
            status.set(Stat);
        }
        
    }
    
    
} 

