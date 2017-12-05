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

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class LoginController {
    WareHouse mainWareHouse = new WareHouse("mainWareHouse");
    String currentUser;
    AccountFleet accountFleet = new AccountFleet();
    SalesInvoice salesInvoice = new SalesInvoice();
    ArrayList<String> partNames = new ArrayList<>();
    ArrayList<Integer> partAmounts = new ArrayList<>();
    ArrayList<Double> partPrices = new ArrayList<>();
    String textContainer = null;
    WareHouse salesVan = new WareHouse("salesVan");

    //Login in Screen Fields
    @FXML
    private TextField passwordField;
    @FXML
    private TextField userNameField;
    @FXML
    private Button loginButton;


    //Office Manager Screen Fields
    @FXML
    private TextField om_search_name;

    @FXML
    private TextField om_search_number;
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
     @FXML
    private TextArea om_display_bike;


    //Sales Associate Screen Fields
    @FXML
    private TextField sellDateField;
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
    private Button generatetablesbutton;
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
    @FXML
    private TextField wm_filename;
    @FXML
    private TextArea updated_warehouse;
    @FXML
    private Button read_file;
    @FXML
    private TextField wm_bikename;
    @FXML
    private TextField wm_bikenumber;
    @FXML
    private TextArea dispalybike;
    @FXML
    private Button examineName;
    @FXML
    private Button examineNumber;
   


    //MISC methods
    public final ObservableList<BikePart> DATA
            = FXCollections.observableArrayList(
            new BikePart("red",123,23.0,12.0,true,5),
            new BikePart("blue",234,17.0,13.0,false,6)
    );

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
                currentUser = account.getUserName();
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
/*
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
*/
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
            endDate = format.parse(endDateText);
        } catch (Exception e) { e.printStackTrace(); }

        double commission = salesInvoice.salesCommission(startDate, endDate, salesAssociate);
        om_displayCommission.setText(Double.toString(commission));

    }

      @FXML
    void doSearchByName(ActionEvent event) {
         mainWareHouse.addBikePart(red);
        String name = om_search_name.getText();   
        for(BikePart bp: mainWareHouse.getArrayList()){
            if (bp.getName().equals(name)){
                om_display_bike.appendText(bp.getName() + ", " +
                       bp.getNumber() + ", " +
                       bp.getPrice());
           }
        }
    
 
    }

    @FXML
    void doSearchByNumber(ActionEvent event) {
             
       mainWareHouse.addBikePart(red);
        String number = om_search_number.getText();
        int num = Integer.parseInt(number);
        
          for(BikePart bp: mainWareHouse.getArrayList()){
           if (bp.getNumber() == num){
               om_display_bike.appendText(bp.getNumber() + ", " +
                       bp.getNumber() + ", " +
                       bp.getPrice());
          
           
          }
    }
          
        
        

    }

    //Sales Associate Screen Actions
    @FXML
    void doSellAdd(ActionEvent event) {
        String bikePartName = sellPartNameField.getText();
        BikePart bp = mainWareHouse.returnBikePart(bikePartName);
        int sellAmount = Integer.parseInt(sellAmountField.getText());
        partNames.add(bp.getName());
        partAmounts.add(sellAmount);
        partPrices.add(bp.getPrice());
        textContainer += (bp.getName() + "," + bp.getNumber() + "," + bp.getPrice() + "," + sellAmount + "\n");
        sellTextArea.setText(textContainer);
    }

    @FXML
    void doLoadAdd(ActionEvent event) {

    }

    @FXML
    void doInvoice(ActionEvent event) {

    }

    @FXML
    void doLoadVan(ActionEvent event) {

    }

    @FXML
    void doSell(ActionEvent event) {
        SalesAssociate salesAssociate = null;
        for (Account a : accountFleet.getAccounts()){
            if (a.getUserName().equals(currentUser)){
                salesAssociate = (SalesAssociate) a;
            }
        }
        String sellDateText = sellDateField.getText();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date sellDate = null;
        try {
            sellDate = format.parse(sellDateText);
        } catch (Exception e) { e.printStackTrace(); }
        Sale sale = new Sale(sellDate, partNames, partAmounts, partPrices, salesAssociate);
        salesInvoice.addSale(sale);
        for (int i = 0; i < partNames.size(); i++){
            salesVan.sellPart(partNames.get(i), partAmounts.get(i));
        }
    }


    //System Admin Screen Actions
    @FXML
    void generateTable(ActionEvent event) {
//
//       Account hey = new Account("one","last","ere","123","one@email.com","6545678");
//       accountFleet.addAccount(hey);
//       accountFleet.saveAccountChanges();
//       for(Account a: accountFleet.getAccounts()){
//        if(a instanceof WareHouseManager){
//        wareHouseManagers.add(a);
//    }
//    }
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
    void doCreateSa(ActionEvent event) {
        String text = newSaField.getText();
        String [] ss = text.split(",");
        Account createSa = new SalesAssociate(ss[0],
                ss[1],
                ss[2],
                ss[3],
                ss[4],
                ss[5]);
        salesAssociates.add(createSa);
        accountFleet.addAccount(createSa);
        accountFleet.saveAccountChanges();
    }

    @FXML
    void doCreateWm(ActionEvent event) {
        String text = newWmField.getText();
        String [] ss = text.split(",");
        Account createWm = new WareHouseManager(ss[0],
                ss[1],
                ss[2],
                ss[3],
                ss[4],
                ss[5]);
        wareHouseManagers.add(createWm);
        accountFleet.addAccount(createWm);
        accountFleet.saveAccountChanges();
    }

    @FXML
    void doDeleteSa(ActionEvent event) {

    }

    @FXML
    void doDeleteWm(ActionEvent event) {

    }

    @FXML
    void doOmCreate(ActionEvent event) {

        String text = newOmField.getText();
        String [] ss = text.split(",");
        Account createOm = new OfficeManager(ss[0],
                ss[1],
                ss[2],
                ss[3],
                ss[4],
                ss[5]);
        officeManagers.add(createOm);
        accountFleet.addAccount(createOm);
        accountFleet.saveAccountChanges();
    }

    @FXML
    void doDeleteOm (ActionEvent event) {

    }




    //WareHouse Manager Screen Actions
    @FXML
    void doExamineNumber(ActionEvent event) {
        //mainWareHouse.addBikePart(red);
        String number = wm_bikenumber.getText();
        int num = Integer.parseInt(number);
        for(BikePart bp: mainWareHouse.getArrayList()){
            if (bp.getNumber() == num){
                dispalybike.appendText(bp.getNumber() + ", " +
                        bp.getNumber() + ", " +
                        bp.getPrice());
            }
        }
    }

    @FXML
    void doExamineName(ActionEvent event) {
        //mainWareHouse.addBikePart(red);
        String name = wm_bikename.getText();
        for(BikePart bp: mainWareHouse.getArrayList()){
            if (bp.getName().equals(name)){
                dispalybike.appendText(bp.getName() + ", " +
                        bp.getNumber() + ", " +
                        bp.getPrice());
            }
        }
    }

    @FXML
    void doRead(ActionEvent event) {
        String read = wm_filename.getText();
        File file = new File(wm_filename.getText());
        mainWareHouse.readInventoryUpdate(file);

    }
}
