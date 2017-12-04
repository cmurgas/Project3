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
        import javafx.collections.FXCollections;
        import javafx.collections.ObservableList;
        import javafx.scene.control.cell.PropertyValueFactory;


public class LoginController {
    WareHouse mainWareHouse;
    String currentUser;
        
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

    @FXML
    private TableView<BikePart> bikeparts_tree;

    @FXML
    private TableColumn<BikePart, String> om_bikename;

    @FXML
    private TableColumn<BikePart, Integer> om_bikenumber;

    @FXML
    private TableColumn<BikePart, Double> om_listPrice;

    @FXML
    private TableColumn<BikePart, Double> om_salesPrice;

    @FXML
    private TableColumn<BikePart, Boolean> om_onSale;

    @FXML
    private TableColumn<BikePart, Integer> om_quantity;
        
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
    @FXML // fx:id="sellTextArea"
    private TextArea sellTextArea; // Value injected by FXMLLoader

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

    @FXML // fx:id="salesTable"
    private TreeTableView<?> salesTable; // Value injected by FXMLLoader

    @FXML // fx:id="sellPartNameColumn"
    private TreeTableColumn<?, ?> sellPartNameColumn; // Value injected by FXMLLoader

    @FXML // fx:id="sellPartNumberColumn"
    private TreeTableColumn<?, ?> sellPartNumberColumn; // Value injected by FXMLLoader

    @FXML // fx:id="sellVanAmountColumn"
    private TreeTableColumn<?, ?> sellVanAmountColumn; // Value injected by FXMLLoader

    @FXML // fx:id="sellPartNameField"
    private TextField sellPartNameField; // Value injected by FXMLLoader

    @FXML // fx:id="sellAmountField"
    private TextField sellAmountField; // Value injected by FXMLLoader

    @FXML // fx:id="addPartToSale"
    private Button addPartToSale; // Value injected by FXMLLoader

    @FXML // fx:id="sellButton"
    private Button sellButton; // Value injected by FXMLLoader

    @FXML // fx:id="sa_startDate"
    private DatePicker sa_startDate; // Value injected by FXMLLoader

    @FXML // fx:id="sa_endDate"
    private DatePicker sa_endDate; // Value injected by FXMLLoader

    @FXML // fx:id="sa_salesAssociates"
    private ComboBox<?> sa_salesAssociates; // Value injected by FXMLLoader

    @FXML // fx:id="GenerateButton"
    private Button GenerateButton; // Value injected by FXMLLoader


    //System Admin Screen Fields
    @FXML
    private TextField newOmField;

    @FXML
    private Button newOmButton;

    @FXML
    private TextField deleteOmField;

    @FXML
    private Button deleteOmButton;

    @FXML
    private TextField newSaField;

    @FXML
    private Button newSaButton;

    @FXML
    private TextField deleteSaField;

    @FXML
    private Button deleteSaButton;

    @FXML
    private Button newWmButton;

    @FXML
    private TextField deleteWmField;

    @FXML
    private Button deleteWmButton;


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

    public final ObservableList<BikePart> data
            = FXCollections.observableArrayList(
                    new BikePart("red",123,23.0,12.0,true,5),
                    new BikePart("blue",234,17.0,13.0,false,6)
            )
        ;

    //Login Screen Actions
    @FXML
    void doLogin(ActionEvent event) {
        Account account1 = new SystemAdmin("","","admin","nimda","","");


        String userName = userNameField.getText();
        String password = passwordField.getText();

        Account account = null;
        Stage stage = null;
        Parent root = null;

        //for (Account a : accountFleet.getAccounts()){
            //if ((account1.getUserName().equals(userName) && account1.getPassword().equals(password))){
                //account =  a;
            //}
        //}
        if (account1 instanceof SalesAssociate){
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
        else if (account1 instanceof WareHouseManager){
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
        else if (account1 instanceof  OfficeManager){
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
        else if (account1 instanceof SystemAdmin){
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
    void doAdd(ActionEvent event) {
        String bikePartName = sellPartNameField.getText();
        BikePart bp = mainWareHouse.returnBikePart(bikePartName);
        int sellAmount = Integer.parseInt(sellAmountField.getText());
        //String textContainer = null;
        //textContainer += (bp.getName() + "," + bp.getNumber() + "," + bp.getPrice() + "," + sellAmount + "\n");
        sellTextArea.setText(""/*find a way to add to it as we go*/);
    }

    @FXML
    void doInvoice(ActionEvent event) {

    }

    @FXML
    void doLoadVan(ActionEvent event) {

    }

    @FXML
    void doSell(ActionEvent event) {
        String textArea = sellTextArea.getText();
        //parse all the things
    }


    //System Admin Screen Actions
    @FXML
    void doCreateSA(ActionEvent event) {

    }

    @FXML
    void doCreateWm(ActionEvent event) {

    }

    @FXML
    void doDeleteSa(ActionEvent event) {

    }

    @FXML
    void doDeleteWm(ActionEvent event) {

    }

    @FXML
    void doOmCreate(ActionEvent event) {

    }

    @FXML
    void doOmDelete(ActionEvent event) {

    }


    //WareHouse Manager Screen Actions
    @FXML
    void doExamin(ActionEvent event) {

    }

    @FXML
    void doRead(ActionEvent event) {

    }
}
