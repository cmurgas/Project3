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

    @FXML
    private Button searchByName;

    @FXML
    private Button order_partsButton;

    @FXML
    private Button searchByNumber;

    @FXML
    private TextArea partsToOrderArea;

    @FXML
    private TextField om_name_order;

    @FXML
    private TextField om_amount_order;

    @FXML
    private Button om_addOrderButton;

    @FXML
    private TextField om_SA_search;

    @FXML
    private TextField om_startDateField;

    @FXML
    private TextField om_endDateField;

    @FXML
    private TextArea om_displayCommission;

    @FXML
    private Button salesCommissionButton;


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
    private TableView<Account> om_table;

    @FXML
    private TableColumn<Account, String> om_firstName;

    @FXML
    private TableColumn<Account, String> om_lastName;

    @FXML
    private TableColumn<Account, String> om_username;

    @FXML
    private TableColumn<Account, String> om_password;

    @FXML
    private TableColumn<Account, String> om_email;

    @FXML
    private TableColumn<Account, String> om_phoneNumber;

    @FXML
    private TextField newOmField;

    @FXML
    private Button newOmButton;

    @FXML
    private TextField deleteOmField;

    @FXML
    private Button deleteOmButton;

    @FXML
    private TableView<Account> sa_table;

    @FXML
    private TableColumn<Account, String> sa_firstName;

    @FXML
    private TableColumn<Account, String> sa_lastName;

    @FXML
    private TableColumn<Account, String> sa_username;

    @FXML
    private TableColumn<Account, String> sa_password;

    @FXML
    private TableColumn<Account, String> sa_email;
      @FXML
    private TableColumn<Account, String> sa_phoneNumber;

    @FXML
    private TextField newSaField;

    @FXML
    private Button newSaButton;

    @FXML
    private TextField deleteSaField;

    @FXML
    private Button deleteSaButton;

    @FXML
    private TableView<Account> wm_table;

    @FXML
    private TableColumn<Account, String> wm_firstName;

    @FXML
    private TableColumn<Account, String> wm_lastName;

    @FXML
    private TableColumn<Account, String> wm_username;

    @FXML
    private TableColumn<Account, String> wm_password;

    @FXML
    private TableColumn<Account, String> wm_email;

    @FXML
    private TableColumn<Account, String> wm_phoneNumber;
    
     @FXML
    private TextField newWmField;

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
        public final ObservableList<Account> wareHouseManagers
            = FXCollections.observableArrayList(
                    new Account("red","eye","bullseye","char","burn@email.com","6549867"),
                    new Account("orange","fruit","dkfd","adlkfjs","orange@email.com","2345667")
            );
    public final ObservableList<Account> salesAssociates
            = FXCollections.observableArrayList(
                    new Account("blue","eye","bullseye","char","burn@email.com","6549867"),
                    new Account("yellow","fruit","dkfd","adlkfjs","orange@email.com","2345667")
            );
    public final ObservableList<Account> officeManagers
            = FXCollections.observableArrayList(
                    new Account("teal","eye","bullseye","char","burn@email.com","6549867"),
                    new Account("green","fruit","dkfd","adlkfjs","orange@email.com","2345667")
            );


    //Login Screen Actions
    @FXML
    void doLogin(ActionEvent event) {
        Account account1 = new SystemAdmin("","","admin","nimda","","");
        accountFleet.addAccount(account1);
        accountFleet.saveAccountChanges();

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
    void doOrderAdd(ActionEvent event) {

    }

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

    @FXML
    void doSearchByName(ActionEvent event) {

    }

    @FXML
    void doSearchByNumber(ActionEvent event) {

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
        String text = newSaField.getText();
        String [] ss = text.split(",");
               Account createSa = new SalesAssociate(ss[0],
                       ss[1],
                       ss[2],
                       ss[3],
                       ss[4],
                       ss[5]);
        salesAssociates.add(createSa);
    }}

    @FXML
    void doCreateWM(ActionEvent event) {
        String text = newWmField.getText();
        String [] ss = text.split(",");
               Account createWm = new WareHouseManager(ss[0],
                       ss[1],
                       ss[2],
                       ss[3],
                       ss[4],
                       ss[5]);
        wareHouseManagers.add(createWm);
    }
    @FXML
    void doDeleteSa(ActionEvent event) {

    }

    @FXML
    void doDeleteWm(ActionEvent event) {

    }

    @FXML
    void doCreateOM(ActionEvent event) {
    wm_firstName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        wm_lastName.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        wm_username.setCellValueFactory(new PropertyValueFactory<>("userName"));
        wm_password.setCellValueFactory(new PropertyValueFactory<>("password"));
        wm_email.setCellValueFactory(new PropertyValueFactory<>("email"));
        wm_phoneNumber.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
        wm_table.setItems(wareHouseManagers);
        
        om_firstName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        om_lastName.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        om_username.setCellValueFactory(new PropertyValueFactory<>("userName"));
        om_password.setCellValueFactory(new PropertyValueFactory<>("password"));
        om_email.setCellValueFactory(new PropertyValueFactory<>("email"));
        om_phoneNumber.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
        om_table.setItems(officeManagers);
        
        sa_firstName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        sa_lastName.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        sa_username.setCellValueFactory(new PropertyValueFactory<>("userName"));
        sa_password.setCellValueFactory(new PropertyValueFactory<>("password"));
        sa_email.setCellValueFactory(new PropertyValueFactory<>("email"));
        sa_phoneNumber.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
        sa_table.setItems(salesAssociates);
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
