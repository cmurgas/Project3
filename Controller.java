package project3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

   @FXML
   private Button quitButton;

   @FXML
   private Button loginButton;

   @FXML
   private TextField userNameField;

   @FXML
   private TextField passwordField;

   @FXML
   void doLogIn(ActionEvent event) {
       String userName = userNameField.getText();
       String password = passwordField.getText();
       Account account;
       for (Account a : AccountFleet.getArrayList()){
           if (a.getUserName().equals(userName) && a.getPassword().equals(password)){
               account = a;
           }
       }
       if (account instanceof  SalesAssociate){
           //open sales associate screen
       }
       else if (account instanceof WareHouseManager){
           // open WHM screen
       }
       else if (account instanceof OfficeManager){
           //open office manager screen
       }
       else if (account instanceof SystemAdmin){
           //open system admin screen
       }

   }

   @FXML
   void doQuit(ActionEvent event) {
       //close the window
   }

}
