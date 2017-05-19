/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarttestapp;

import java.awt.Image;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import static smarttestapp.Server.insertUser;
import smarttestapp.model.userInfo;
import smarttestapp.model.users;

//NOTE, NOTE, NOTE: This is the application that takes care of the administrator role. This is a combination of AdminCreate User, Admin Home page, Admin Reset Password...and all other admin roles
/**
 *
 * @author csc190
 */
public class SmartTestApp extends Application {
    
    Button btnLogin, btnCreateAdmin ,btnCancelAdmin, btnConfirmReset ,btnCancelReset,btnScene2_4, btnScene3_1, btnScene3_2, btnScene3_4,btnScene4_1,btnScene4_2,btnScene4_3;
    Label lblTitleLogin, lblUsrLogin,lblPwdLogin, lblTitleAdmin, lblTitle2Admin,lblFirAdmin,lblUser, lblPwdAdmin, lblTitleReset, lblTitle2, lblFirReset, lblPwdReset, lblCPwdReset ;
    TextField tfUserLogin, tfFirAdmin, tfUser, tfFirReset;
    PasswordField pfLogin, pfAdmin,pfReset, cpfReset ;
    String unameLogin, pwdLogin, fName, pwd, role, AdminUsername, resetUName, resetPassword, confirmPassword, databasePassword, sRet, userContent;
    GridPane gpLogin, gpAdmin, gpAdminHome, gpReset, pane4, pane5, gp;
    Scene scene, scene1, scene2, scene3, scene4, see, scene7;
    RadioButton button1, button2;
    ToggleGroup group;
    Stage thestage;
    ArrayList<userInfo> datafromUsers,people;
    ArrayList<userInfos>datafortable;
    
    //This is going to be the username and Password for the admin
    String checkUser = "drEvil@hofstra.edu";
    String checkPassword = "goodyear";
    private final TableView<userInfo> table = new TableView<>();
     
     @Override
    public void start(Stage primaryStage) {
        //This application will be organized in this way:
        //1. We will have code concerning the front login in page
        //2. The scene will change to the admin home page
        //3. This will then change to the any button that the admin chooses to switch to
        //4. This will be moderated using if and else statements
        
        //This is the beginning of number 1 organization
        //......//
        //1. add label Login Form/Occupies 2 columns
        thestage = primaryStage;
        gpLogin = new GridPane();
        lblTitleLogin = new Label("Welcome to SmartTest");
        lblTitleLogin.setFont(new Font("Arial", 16));
        gpLogin.add(lblTitleLogin, 0, 0, 2, 1);
        
        
        
        //2. second row, add uname and textbox
        lblUsrLogin = new Label("User Name");
        tfUserLogin = new TextField();
        gpLogin.add(lblUsrLogin, 0, 1);
        gpLogin.add(tfUserLogin, 1, 1);
        
        //3. third row, add password
        lblPwdLogin = new Label("Password");
        pfLogin = new PasswordField();
        gpLogin.add(lblPwdLogin, 0, 2);
        gpLogin.add(pfLogin, 1, 2);
        
        //4. add Button
        btnLogin = new Button();
        btnLogin.setText("Login");
        gpLogin.add(btnLogin, 1, 3);
        
        
        //5. add handler
        btnLogin.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                unameLogin = tfUserLogin.getText().toString();
                pwdLogin = pfLogin.getText().toString();
                
                
                people = Server.getAllUsers();
                for(userInfo a : people){
                    if(a.username.equals(unameLogin) && a.password.equals(pwdLogin)){
                        System.out.println("databaseuname: " + a.username + ", Uname: " + unameLogin);
                        System.out.println("databasePassword: " + a.password + ", password: " + pwdLogin);
                        System.out.println("role:"+ a.role);
                        if(a.role.equals("Teacher")){
                            scene7 = new Scene(gp, 500, 500);
                           //scene change to Teacher
                           thestage.setScene(scene7);
                           TeacherNewTest newtest = new TeacherNewTest();
                           newtest.initcreatetestscreen();
                           newtest.showAndWait();
                           
                        }
                        else if(a.role.equals("Student")){
                           //scene change to Student
                        }
                        else if(a.role.equals("Admin")){
                            thestage.setScene(scene1);
                        }
                        else{
                            Alert al = new Alert(AlertType.INFORMATION);
                            al.setContentText("You are not registered to the system.");
                            al.showAndWait();
                        }          
                    }
               }          
            }
        });
        //..This is the end of that..//
        
        //This is actually the admin home page
            //1. add label Login Form/Occupies 2 columns
        gpAdminHome = new GridPane();
        Label lblTitleAHome = new Label("ADMIN CONSOLE");
        lblTitleAHome.setFont(new Font("Arial", 16));
        gpAdminHome.add(lblTitleAHome, 1, 0, 2, 1);
        
        
        //3. add Button
        Button btnNU = new Button();
        btnNU.setText("New User");
        gpAdminHome.add(btnNU, 2, 1);
        
        Button btnRP = new Button();
        btnRP.setText("Reset Password");
        gpAdminHome.add(btnRP, 2, 2); 
        
        //4. add handler
        btnNU.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                thestage.setScene(scene2);
                
            }
        });
               
        btnRP.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                thestage.setScene(scene3);
                
            }
        });
        
        
        
        
        //This deals with the second organization that has to deal with the second organization: for the Create new user
        //1. add label Login Form/Occupies 2 columns
        gpAdmin = new GridPane();
        lblTitleAdmin = new Label("ADMIN CONSOLE");
        lblTitleAdmin.setFont(new Font("Arial", 16));
        gpAdmin.add(lblTitleAdmin, 0, 0, 2, 1);
        
        
        lblTitle2Admin = new Label("Create a New User");
        lblTitle2Admin.setFont(new Font("Arial", 14));
        gpAdmin.add(lblTitle2Admin, 0, 1, 2, 2);
        
        //2. second row, add pincode and textbox
        lblFirAdmin = new Label("Full Name");
        tfFirAdmin = new TextField();
        gpAdmin.add(lblFirAdmin, 0, 3);
        gpAdmin.add(tfFirAdmin, 1, 3);
        
        
        
        lblUser = new Label("Username");
        tfUser = new TextField();
        gpAdmin.add(lblUser, 0, 4);
        gpAdmin.add(tfUser, 1, 4);
        
        lblPwdAdmin = new Label("Password");
        pfAdmin = new PasswordField();
        gpAdmin.add(lblPwdAdmin, 2, 4);
        gpAdmin.add(pfAdmin, 3, 4);
        
        
        //3. add Button
        btnCreateAdmin = new Button();
        btnCreateAdmin.setText("Create");
        gpAdmin.add(btnCreateAdmin, 1, 7);
        
        
        btnCancelAdmin = new Button();
        btnCancelAdmin.setText("Cancel");
        gpAdmin.add(btnCancelAdmin, 3, 7);
        
        
        
       
        
        //4. add handler
        btnCreateAdmin.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
               fName =tfFirAdmin.getText().toString();
               AdminUsername =tfUser.getText().toString();
               pwd=pfAdmin.getText().toString();
               if(button1.isSelected() == false && button2.isSelected()== false){
                   role = "Admin";
               }else if(button1.isSelected() == false){
                   role = "Teacher";
               }
               else {
                   role = "Student";
               }
               if(fName == null || AdminUsername== null || pwd == null || role == null){
                   Alert al = new Alert(AlertType.INFORMATION);
                   al.setContentText("Please fill out all the fields in the sheet.");
                   al.showAndWait();
               }
               
               userInfo [] arrUsers = new userInfo[]{
                   new userInfo( fName, AdminUsername, pwd, role)   
               };
               users user1 = new users(arrUsers);
               userInfo user = arrUsers[0];
               String url = "http://localhost/smarttest.php";
               userContent = Utils.toStr(user);
               //Server.insertUser(userContent);
               String qry = "INSERT INTO people (name, val) VALUES( '"+ AdminUsername +"', '" + userContent +"')";
               Utils.execNonQuery(qry);
               String response;
                try {
                  response = Utils.httpsPost(url, userContent);
                  System.out.println(response);
                } catch (Exception ex) {
                   Logger.getLogger(SmartTestApp.class.getName()).log(Level.SEVERE, null, ex);
                }
                Alert al = new Alert(AlertType.INFORMATION);
                   al.setContentText("The user has been added to the database.");
                   al.showAndWait();          
            }
                
        });
        btnCancelAdmin.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                thestage.setScene(scene);
                
            }
        });
        
        group = new ToggleGroup();
        button1 = new RadioButton("Teacher");
        button1.setToggleGroup(group);
        //button1.setSelected(true);
        gpAdmin.add(button1, 2, 5);
        button2 = new RadioButton("Student");
        button2.setToggleGroup(group);
        gpAdmin.add(button2, 2, 6);
        
        
        
        
        
        //This is the one for handling Reset Password
        gpReset = new GridPane();
        lblTitleReset = new Label("ADMIN CONSOLE");
        gpReset.add(lblTitleReset, 0, 0, 2, 1);
        
        lblTitle2 = new Label("Reset Password");
        gpReset.add(lblTitle2, 0, 1, 2, 2);

        
        //2. second row, add pincode and textbox
        lblFirReset = new Label("Username");
        tfFirReset = new TextField();
        gpReset.add(lblFirReset, 0, 3);
        gpReset.add(tfFirReset, 1, 3);
        
        //2. second row, add uname and textbox
        lblPwdReset= new Label("New Password");
        pfReset = new PasswordField();
        gpReset.add(lblPwdReset, 0, 4);
        gpReset.add(pfReset, 1, 4);
        
        //3. third row, add password
        lblCPwdReset = new Label("Confirm New Password");
        cpfReset = new PasswordField();
        gpReset.add(lblCPwdReset, 0, 5);
        gpReset.add(cpfReset, 1, 5);
        
        //4. add Button
        btnConfirmReset = new Button();
        btnConfirmReset.setText("Confirm");
        gpReset.add(btnConfirmReset, 0, 6);
        
        btnCancelReset = new Button();
        btnCancelReset.setText("Cancel");
        gpReset.add(btnCancelReset, 1, 6);
        
        //5. add handler
        btnConfirmReset.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
               resetUName =tfFirReset.getText().toString();
               resetPassword = pfReset.getText().toString();
               confirmPassword = cpfReset.getText().toString();
               datafromUsers = Server.getAllUsers();
               if(resetPassword != confirmPassword){
                   Alert al = new Alert(AlertType.INFORMATION);
                   al.setContentText("Your input passwords do not match.");
                   al.showAndWait();
                }
               else if(resetPassword == databasePassword){
                   Alert al = new Alert(AlertType.INFORMATION);
                   al.setContentText("This password has already been saved to the database.");
                   al.showAndWait();
                }
               else{
                    for(userInfo a : datafromUsers){
                         System.out.println("uname: " + a.username + ", resetUname: " + resetUName);
                         if(a.username.equals(resetUName)){
                             a.password = resetPassword;
                             userInfo [] arrU = new userInfo[]{
                                    new userInfo( a.fname, a.username, a.password, a.role)   
                             };
                             users user1 = new users(arrU);
                             userInfo user = arrU[0];
                             String url = "http://localhost/smarttest.php";
                             String userC = Utils.toStr(user);
                             System.out.println("New pwd is: " + a.password);
                             System.out.print(userC);
                             Server.updateUser(resetUName,userC);

                             String response;
                             try {
                                 response = Utils.httpsPost(url, userC);
                                 System.out.println(response);
                             } catch (Exception ex) {
                                     Logger.getLogger(SmartTestApp.class.getName()).log(Level.SEVERE, null, ex);
                             }
                             Alert al = new Alert(AlertType.INFORMATION);
                             al.setContentText("The password has been reset to the database.");
                             al.showAndWait();
                         }
                    }
               }
              
               }
            
        });    
        btnCancelReset.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                thestage.setScene(scene1);
                
            }
            
        });
        

        primaryStage.setTitle("SmartTest");
        scene = new Scene(gpLogin, 550, 250);
        scene1 = new Scene(gpAdminHome, 550, 250);
        scene2 = new Scene(gpAdmin, 550, 250);
        scene3 = new Scene(gpReset, 550, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

   
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}