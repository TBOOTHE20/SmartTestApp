/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarttestapp;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import smarttestapp.TeacherNewTest;
import smarttestapp.model.Question;
import smarttestapp.model.Test;

/**
 *
 * @author csc190
 */
public class AddQuestionStage extends Stage {

    public AddQuestionStage() {

        sp = new ScrollPane();
        gp = new GridPane();

        sp.setContent(gp);
        instance = this;
        Scene scene = new Scene(sp, 900, 900);
        this.setTitle("Add Question");
        this.setScene(scene);

    }

    public void initAddQuestionStage(Test q, TeacherNewTest t) {

        // this.questionn = newq;
        sp = new ScrollPane();
        gp = new GridPane();

        sp.setContent(gp);
        instance = this;
        //reference to the parent sceen TeacherNewTest
        instance2 = t;
        Scene scene = new Scene(sp, 900, 900);
        Test nt = new Test();
        nt = q;
        this.setTitle("Add Question for Test named " + nt.Testname);
        this.setScene(scene);

        Label labelq = new Label("Question:");

        questionname = new TextField();
        Button addbtn = new Button();
        addbtn.setText("Save");

        Label labela = new Label("Answer:");//add the nametest variable - concatination
        TextField adda = new TextField();
        adda.setPromptText("Type Answer Here");

        Label labelptv = new Label("Point Value:");//add the nametest variable - concatination
        TextField tfpv = new TextField();
        tfpv.setPromptText("Type Pont Value Here");

        Label labelch = new Label("Write in choices (separating them by a comma) :");//add the nametest variable - concatination
        TextField addch = new TextField();
        addch.setPromptText("choices");

        Label labello = new Label("Learning Outcomes:");//add the nametest variable - concatination

        Question questionn = new Question();//make a new question baby
        

        Button addButton = new Button("Add");
        addButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                /*after creating the question egg above I set the value
                for all attributes of my question egg by grabbing the information
                from the textfield using .getText() so
                questionname.getText() gets the inputted data from user
                and that info is then set to my question egg attributes
                */
                questionn.question = questionname.getText();
                System.out.print("The question is " + questionn.question);
                
                questionn.correctanswer = adda.getText();
                System.out.print("The answer is " + questionn.correctanswer);
                
                questionn.pointvalue = tfpv.getText();
                System.out.print("The pointvalue is " + questionn.pointvalue);
                
                
                
                //since i passed a reference to the teacher new test screen
                //I have access or connection to it so i can call the refresh button on it
                //so it can add the newly created question
                Test bxt=new Test();
                bxt.addQuestions(questionn);
                
                System.out.print("LOOK HERE"+bxt.myListofQuestions.get(0).question);
                instance2.refresh(bxt);
            }
        });
        

        Button cancelButton = new Button("Cancel");
        cancelButton.setOnAction((ActionEvent e) -> {

            this.close();

        });

        vbchecks = new VBox();
        vbchecks.setSpacing(10);
        vbchecks.setPadding(new Insets(20));

        //make 3 checkboxes
        chksport1 = new CheckBox("Exampleoflearningoutcome");

        //add all things to vboxes
        vbchecks.getChildren().addAll(chksport1);

        //attach click-method to all 3 checkboxes
        chksport1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                //String uname = tfUser.getText();
                //String pwd = pf.getText();

            }
        });
        FlowPane root = new FlowPane();
        root.setHgap(20);
        root.getChildren().addAll(vbchecks);

        HBox hb1 = new HBox();
        hb1.getChildren().addAll(addButton, cancelButton);
        hb1.setSpacing(3);

        HBox hb2 = new HBox();
        hb2.getChildren().addAll(labela, adda, labelptv, tfpv, labelch, addch);
        hb2.setSpacing(3);

        VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(labelq, questionname, hb2, labello, root, hb1);
        gp.getChildren().addAll(vbox);

    }
 
        

    //data members
    protected ScrollPane sp;
    protected GridPane gp;
    static AddQuestionStage instance = null;
    public TeacherNewTest instance2 = null;
    protected TextField questionname;
    protected TextField answer;
    protected TextField choices;
    protected TextField pointvalue;
    protected TextField learningOutcomes;
    public Test nt;
    public Question questionn;

    public CheckBox chksport1, chksport2, chksport3;
    public VBox vbchecks;

}
