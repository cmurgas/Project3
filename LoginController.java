/**
 * Sample Skeleton for 'Login.fxml' Controller Class
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class LoginController {
    AccountFleet accountFleet;

    //Login in Screen Fields
    @FXML // fx:id="passwordField"
    private TextField passwordField; // Value injected by FXMLLoader

    @FXML // fx:id="userNameField"
    private TextField userNameField; // Value injected by FXMLLoader

    @FXML // fx:id="loginButton"
    private Button loginButton; // Value injected by FXMLLoader

    //Office Manager Screen Fields

    @FXML // fx:id="bikeparts_tab"
    private AnchorPane bikeparts_tab; // Value injected by FXMLLoader

    @FXML // fx:id="bikeparts_tree"
    private TreeTableView<?> bikeparts_tree; // Value injected by FXMLLoader

    @FXML // fx:id="om_bikename"
    private TreeTableColumn<?, ?> om_bikename; // Value injected by FXMLLoader

    @FXML // fx:id="om_bikenumber"
    private TreeTableColumn<?, ?> om_bikenumber; // Value injected by FXMLLoader

    @FXML // fx:id="om_listPice"
    private TreeTableColumn<?, ?> om_listPice; // Value injected by FXMLLoader

    @FXML // fx:id="om_salesPrice"
    private TreeTableColumn<?, ?> om_salesPrice; // Value injected by FXMLLoader

    @FXML // fx:id="om_onSale"
    private TreeTableColumn<?, ?> om_onSale; // Value injected by FXMLLoader

    @FXML // fx:id="om_quantity"
    private TreeTableColumn<?, ?> om_quantity; // Value injected by FXMLLoader

    @FXML // fx:id="om_search_name"
    private TextField om_search_name; // Value injected by FXMLLoader

    @FXML // fx:id="om_search_number"
    private TextField om_search_number; // Value injected by FXMLLoader

    @FXML // fx:id="om_display_bike"
    private TextArea om_display_bike; // Value injected by FXMLLoader

    @FXML // fx:id="search"
    private Button search; // Value injected by FXMLLoader

    @FXML // fx:id="order_parts"
    private Button order_parts; // Value injected by FXMLLoader

    @FXML // fx:id="om_SA_search"
    private TextField om_SA_search; // Value injected by FXMLLoader

    @FXML // fx:id="om_StartDateSearch"
    private TextField om_StartDateSearch; // Value injected by FXMLLoader

    @FXML // fx:id="om_endDateSearch"
    private TextField om_endDateSearch; // Value injected by FXMLLoader

    @FXML // fx:id="om_displayCommission"
    private TextArea om_displayCommission; // Value injected by FXMLLoader

    @FXML // fx:id="salesCommissionButton"
    private Button salesCommissionButton; // Value injected by FXMLLoader


    //Login Screen Actions
    @FXML
    void doLogin(ActionEvent event) {
        accountFleet = new AccountFleet();
        accountFleet.addAccount(new SystemAdmin("katie","lamb","klamb3","bmal","no","7"));
        accountFleet.saveAccountChanges();


        String userName = userNameField.getText();
        String password = passwordField.getText();

        Account account = null;
        Stage stage = null;
        Parent root = null;

        for (Account a : accountFleet.getAccounts()){
            if ((a.getUserName().equals(userName) && a.getPassword().equals(password))){
                account =  a;
                System.out.println(a.getPassword());
            }
        }
        if (account instanceof SalesAssociate){
            try {
                stage = (Stage) loginButton.getScene().getWindow();
                root = FXMLLoader.load(getClass().getResource("SalesAssociateScreen.fxml"));
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }catch(Exception e) {
                e.printStackTrace();
            }
        }
        else if (account instanceof WareHouseManager){
            try {
                stage = (Stage) loginButton.getScene().getWindow();
                root = FXMLLoader.load(getClass().getResource("WareHouseManagerScreen.fxml"));
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }catch(Exception e) {
                e.printStackTrace();
            }
        }
        else if (account instanceof  OfficeManager){
            try {
                stage = (Stage) loginButton.getScene().getWindow();
                root = FXMLLoader.load(getClass().getResource("OfficeManagerScreen.fxml"));
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if (account instanceof SystemAdmin){
            try {
                stage = (Stage) loginButton.getScene().getWindow();
                root = FXMLLoader.load(getClass().getResource("SystemAdminScreen.fxml"));
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }catch(Exception e){
                //e.printStackTrace();
            }
        }

    }

    //office manager screen actions
    @FXML
    void doOrderOM(ActionEvent event) {

    }

    @FXML
    void doSalesCommission(ActionEvent event) {

    }
}
