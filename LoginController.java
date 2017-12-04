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


    //Sales Associate Screen Fields
    @FXML // fx:id="sa_menuBar"
    private MenuButton sa_menuBar; // Value injected by FXMLLoader

    @FXML // fx:id="sa_displayActions"
    private TextArea sa_displayActions; // Value injected by FXMLLoader

    @FXML // fx:id="sa_load_partName"
    private TableColumn<?, ?> sa_load_partName; // Value injected by FXMLLoader

    @FXML // fx:id="sa_mainWareHouseQuan"
    private TableColumn<?, ?> sa_mainWareHouseQuan; // Value injected by FXMLLoader

    @FXML // fx:id="sa_vanQuan"
    private TableColumn<?, ?> sa_vanQuan; // Value injected by FXMLLoader

    @FXML // fx:id="sa_transferNum"
    private TableColumn<?, ?> sa_transferNum; // Value injected by FXMLLoader

    @FXML // fx:id="loadVanButton"
    private Button loadVanButton; // Value injected by FXMLLoader

    @FXML // fx:id="sa_sell_partName"
    private TableColumn<?, ?> sa_sell_partName; // Value injected by FXMLLoader

    @FXML // fx:id="sa_numAvalible"
    private TableColumn<?, ?> sa_numAvalible; // Value injected by FXMLLoader

    @FXML // fx:id="sa_sell"
    private TableColumn<?, ?> sa_sell; // Value injected by FXMLLoader

    @FXML // fx:id="sa_startDate"
    private DatePicker sa_startDate; // Value injected by FXMLLoader

    @FXML // fx:id="sa_endDate"
    private DatePicker sa_endDate; // Value injected by FXMLLoader

    @FXML // fx:id="sa_salesAssociates"
    private ComboBox<?> sa_salesAssociates; // Value injected by FXMLLoader

    @FXML // fx:id="GenerateButton"
    private Button GenerateButton; // Value injected by FXMLLoader


    //System Admin Screen Fields
    @FXML // fx:id="admin_FirstNameOM"
    private TreeTableColumn<?, ?> admin_FirstNameOM; // Value injected by FXMLLoader

    @FXML // fx:id="admin_lastNameOM"
    private TreeTableColumn<?, ?> admin_lastNameOM; // Value injected by FXMLLoader

    @FXML // fx:id="admin_usernameOM"
    private TreeTableColumn<?, ?> admin_usernameOM; // Value injected by FXMLLoader

    @FXML // fx:id="admin_passwordOM"
    private TreeTableColumn<?, ?> admin_passwordOM; // Value injected by FXMLLoader

    @FXML // fx:id="admin_emailOM"
    private TreeTableColumn<?, ?> admin_emailOM; // Value injected by FXMLLoader

    @FXML // fx:id="admin_phoneOM"
    private TreeTableColumn<?, ?> admin_phoneOM; // Value injected by FXMLLoader

    @FXML // fx:id="admin_createOMButton"
    private Button admin_createOMButton; // Value injected by FXMLLoader

    @FXML // fx:id="admin_SaveButton"
    private Button admin_SaveButton; // Value injected by FXMLLoader

    @FXML // fx:id="admin_deleteButton"
    private Button admin_deleteButton; // Value injected by FXMLLoader

    @FXML // fx:id="admin_firstNameSA"
    private TreeTableColumn<?, ?> admin_firstNameSA; // Value injected by FXMLLoader

    @FXML // fx:id="admin_lastNameSA"
    private TreeTableColumn<?, ?> admin_lastNameSA; // Value injected by FXMLLoader

    @FXML // fx:id="admin_userNameSA"
    private TreeTableColumn<?, ?> admin_userNameSA; // Value injected by FXMLLoader

    @FXML // fx:id="admin_passwordSA"
    private TreeTableColumn<?, ?> admin_passwordSA; // Value injected by FXMLLoader

    @FXML // fx:id="admin_emailSA"
    private TreeTableColumn<?, ?> admin_emailSA; // Value injected by FXMLLoader

    @FXML // fx:id="admin_phoneSA"
    private TreeTableColumn<?, ?> admin_phoneSA; // Value injected by FXMLLoader

    @FXML // fx:id="admin_vanSA"
    private TreeTableColumn<?, ?> admin_vanSA; // Value injected by FXMLLoader

    @FXML // fx:id="admin_createSAButton"
    private Button admin_createSAButton; // Value injected by FXMLLoader

    @FXML // fx:id="admin_saveButton"
    private Button admin_saveButton; // Value injected by FXMLLoader

    @FXML // fx:id="deleteASButton"
    private Button deleteASButton; // Value injected by FXMLLoader

    @FXML // fx:id="firstNameWM"
    private TreeTableColumn<?, ?> firstNameWM; // Value injected by FXMLLoader

    @FXML // fx:id="lastNameWM"
    private TreeTableColumn<?, ?> lastNameWM; // Value injected by FXMLLoader

    @FXML // fx:id="usernameWM"
    private TreeTableColumn<?, ?> usernameWM; // Value injected by FXMLLoader

    @FXML // fx:id="passwirdWM"
    private TreeTableColumn<?, ?> passwirdWM; // Value injected by FXMLLoader

    @FXML // fx:id="emailWM"
    private TreeTableColumn<?, ?> emailWM; // Value injected by FXMLLoader

    @FXML // fx:id="phoneWM"
    private TreeTableColumn<?, ?> phoneWM; // Value injected by FXMLLoader

    @FXML // fx:id="admin_createWMButton"
    private Button admin_createWMButton; // Value injected by FXMLLoader

    @FXML // fx:id="admin_deleteWMButton"
    private Button admin_deleteWMButton; // Value injected by FXMLLoader


    //WareHouse Manager Screen Fields
    @FXML // fx:id="wm_filename"
    private TextField wm_filename; // Value injected by FXMLLoader

    @FXML // fx:id="updated_warehouse"
    private TextArea updated_warehouse; // Value injected by FXMLLoader

    @FXML // fx:id="read_file"
    private Button read_file; // Value injected by FXMLLoader

    @FXML // fx:id="wm_bikename"
    private TextField wm_bikename; // Value injected by FXMLLoader

    @FXML // fx:id="wm_bikenumber"
    private TextField wm_bikenumber; // Value injected by FXMLLoader

    @FXML // fx:id="dispalybike"
    private TextArea dispalybike; // Value injected by FXMLLoader

    @FXML // fx:id="examine"
    private Button examine; // Value injected by FXMLLoader


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

    //Sales Associate Screen Actions
    @FXML
    void doInvoice(ActionEvent event) {

    }

    @FXML
    void doLoadVan(ActionEvent event) {

    }


    //System Admin Screen Actions
    @FXML
    void doCreate(ActionEvent event) {

    }

    @FXML
    void doCreateSA(ActionEvent event) {

    }

    @FXML
    void doCreateWM(ActionEvent event) {

    }

    @FXML
    void doDeleteOM(ActionEvent event) {

    }

    @FXML
    void doDeleteSA(ActionEvent event) {

    }

    @FXML
    void doDeleteWM(ActionEvent event) {

    }

    @FXML
    void doSave(ActionEvent event) {

    }


    //WareHouse Manager Screen Actions
    @FXML
    void doExamin(ActionEvent event) {

    }

    @FXML
    void doRead(ActionEvent event) {

    }
}
