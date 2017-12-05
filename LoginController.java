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

import java.text.SimpleDateFormat;
import java.util.Date;


public class LoginController {
    WareHouse mainWareHouse;
    String currentUser;
    AccountFleet accountFleet = new AccountFleet();
    SalesInvoice salesInvoice = new SalesInvoice();

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

    @FXML // fx:id="om_startDateField"
    private TextField om_startDateField; // Value injected by FXMLLoader

    @FXML // fx:id="om_endDateField"
    private TextField om_endDateField; // Value injected by FXMLLoader

    @FXML // fx:id="om_displayCommission"
    private TextArea om_displayCommission; // Value injected by FXMLLoader

    @FXML // fx:id="salesCommissionButton"
    private Button salesCommissionButton; // Value injected by FXMLLoader


    //Sales Associate Screen Fields
    @FXML
    private MenuButton sa_menuBar;

    @FXML
    private TextArea sa_displayActions;

    @FXML
    private TableColumn<?, ?> sa_load_partName;

    @FXML
    private TableColumn<?, ?> sa_mainWareHouseQuan;

    @FXML
    private TableColumn<?, ?> sa_vanQuan;

    @FXML
    private TextField loadPartNameField;

    @FXML
    private TextField loadAmountField;

    @FXML
    private Button addPartToLoad;

    @FXML
    private TextArea loadTextArea;

    @FXML
    private Button loadVanButton;

    @FXML
    private TextField sellPartNameField;

    @FXML
    private TextField sellAmountField;

    @FXML
    private Button addPartToSale;

    @FXML
    private TextArea sellTextArea;

    @FXML
    private Button sellButton;

    @FXML
    private DatePicker sa_startDate;

    @FXML
    private DatePicker sa_endDate;

    @FXML
    private ComboBox<?> sa_salesAssociates;

    @FXML
    private Button GenerateButton;


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

    public final ObservableList<BikePart> DATA
            = FXCollections.observableArrayList(
            new BikePart("red",123,23.0,12.0,true,5),
            new BikePart("blue",234,17.0,13.0,false,6)
    )
            ;

    //Login Screen Actions
    @FXML
    void doLogin(ActionEvent event) {
        Account account1 = new SystemAdmin("","","admin","nimda","","");
        accountFleet.addAccount(account1);

        String userName = userNameField.getText();
        String password = passwordField.getText();

        Account account = null;
        Stage stage = null;
        Parent root = null;

        for (Account a : accountFleet.getAccounts()){
            if ((account1.getUserName().equals(userName) && account1.getPassword().equals(password))) {
                account = a;
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
        om_bikename.setCellValueFactory(new PropertyValueFactory<>("name"));
        om_bikenumber.setCellValueFactory(new PropertyValueFactory<>("number"));
        om_listPrice.setCellValueFactory(new PropertyValueFactory<>("listPrice"));
        om_salesPrice.setCellValueFactory(new PropertyValueFactory<>("salePrice"));
        om_onSale.setCellValueFactory(new PropertyValueFactory<>("onSale"));
        om_quantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        bikeparts_tree.setItems(DATA);
    }

    @FXML
    void doSalesCommission(ActionEvent event) {
        SalesAssociate salesAssociate = null;
        String sa = om_SA_search.getText();//sa will now be the first and last names of the SA
        String [] ssaa = sa.split(" ");
        for (Account a : accountFleet.getAccounts()){
            if (a.getFirstName().equalsIgnoreCase(ssaa[0]) && a.getLastName().equalsIgnoreCase(ssaa[1])){
                salesAssociate = (SalesAssociate) a;
            }
        }
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String startDateText = om_startDateField.getText();
        String endDateText = om_endDateField.getText();
        Date startDate = null;
        Date endDate = null;
        try {
            startDate = format.parse(startDateText);
            endDate = format.parse(startDateText);
        } catch (Exception e) { e.printStackTrace(); }

        double commission = salesInvoice.salesCommission(startDate, endDate, salesAssociate);
        om_displayCommission.setText(Double.toString(commission));

    }

    //Sales Associate Screen Actions
    @FXML
    void doSellAdd(ActionEvent event) {

    }

    @FXML
    void doLoadAdd(ActionEvent event) {
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
