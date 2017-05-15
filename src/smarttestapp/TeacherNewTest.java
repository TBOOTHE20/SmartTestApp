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
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
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
public class TeacherNewTest extends Application {
 
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
        stage.setTitle("Admin");
        stage.setWidth(950);
        stage.setHeight(620);
        
        final Label lblTitle = new Label("NEW TEST");
        lblTitle.setFont(new Font("Arial", 14));
 
        final Label lblTitle2 = new Label("Test Name:");
        lblTitle2.setFont(new Font("Arial", 12));
        
        final TextField addTestName = new TextField();
        addTestName.setPromptText("Test Name");
        
        final Label lblPinNr = new Label(" Pin Number:");
        lblPinNr.setFont(new Font("Arial", 12));
        
        //creating checkbox
        //A checkbox without a caption
        //CheckBox cb1 = new CheckBox();
        
        
        
        //addFirstName.setMaxWidth(firstNameCol.getPrefWidth());
        //final Label label = new Label("User Database");
        //label.setFont(new Font("Arial", 20));
 
        table.setEditable(true);
        
        TableColumn checkBoxCol = new TableColumn("Select");
        checkBoxCol.setMinWidth(100);
        checkBoxCol.setCellValueFactory(
                new PropertyValueFactory<Person, String>("checkBox"));

        TableColumn questionCol = new TableColumn("Question");
        questionCol.setMinWidth(100);
        questionCol.setCellValueFactory(
                new PropertyValueFactory<Person, String>("question"));
 
        TableColumn choiceCol = new TableColumn("Choices");
        choiceCol.setMinWidth(100);
        choiceCol.setCellValueFactory(
                new PropertyValueFactory<Person, String>("choice"));
 
        TableColumn answerCol = new TableColumn("Answer");
        answerCol.setMinWidth(200);
        answerCol.setCellValueFactory(
                new PropertyValueFactory<Person, String>("answer"));
 
        TableColumn pointvalueCol = new TableColumn("Point Value");
        pointvalueCol.setMinWidth(200);
        pointvalueCol.setCellValueFactory(
                new PropertyValueFactory<Person, String>("pointvalue"));        
        
        TableColumn leouCol = new TableColumn("Learning Outcome(s)");
        leouCol.setMinWidth(200);
        leouCol.setCellValueFactory(
                new PropertyValueFactory<Person, String>("leou"));
        
        
        final Button logoutButton = new Button("Log Out");
        logoutButton.setOnAction((ActionEvent e) -> {
            
        });
        
        
        //table.setItems(data);
        final Button addQButton = new Button("Add Question");
        addQButton.setOnAction((ActionEvent e) -> {
            
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
        hb.getChildren().addAll(lblTitle2, addTestName, lblPinNr);
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

        stage.setScene(scene);
        stage.show();
    }
 
    public static class Person {
        private final SimpleStringProperty checkBox;
        private final SimpleStringProperty question;
        private final SimpleStringProperty choice;
        private final SimpleStringProperty answer;
        private final SimpleStringProperty pointvalue;
        private final SimpleStringProperty leou;
 
        private Person(String cBox,String q, String ch, String answ,String pv, String lo) {
            this.checkBox = new SimpleStringProperty(cBox);
            this.question = new SimpleStringProperty(q);
            this.choice = new SimpleStringProperty(ch);
            this.answer = new SimpleStringProperty(answ);
            this.pointvalue = new SimpleStringProperty(pv);
            this.leou = new SimpleStringProperty(lo);
        }
 
        public String getcheckbox() {
            return checkBox.get();
        }
 
        public void setcheckbox(String cBox) {
            checkBox.set(cBox);
        }
        
        
        public String getQuestion() {
            return question.get();
        }
 
        public void setQuestion(String q) {
            question.set(q);
        }
 
        public String getChoice() {
            return choice.get();
        }
 
        public void setChoice(String ch) {
            choice.set(ch);
        }
 
        public String getAnswer() {
            return answer.get();
        }
 
        public void setAnswer(String answ) {
            answer.set(answ);
        }
        
        public String getPointValue() {
            return pointvalue.get();
        }
 
        public void setPointValue(String pv) {
            pointvalue.set(pv);
        }
        
        public String getLearningOutcome() {
            return leou.get();
        }
 
        public void setLearningOutcome(String lo) {
            leou.set(lo);
        }
        
        
    }
    
    
} 
