package project3;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;

public class SystemAdministratorScreenController {

    @FXML
    private TreeTableView<?> officemanagers_table;

    @FXML
    private TreeTableColumn<?, ?> om_firstname;

    @FXML
    private TreeTableColumn<?, ?> om_lastname;

    @FXML
    private TreeTableColumn<?, ?> om_username;

    @FXML
    private TreeTableColumn<?, ?> om_password;

    @FXML
    private TreeTableColumn<?, ?> om_email;

    @FXML
    private TreeTableColumn<?, ?> om_phonenumber;

    @FXML
    private Button om_create;

    @FXML
    private Button om_save;

    @FXML
    private Button om_delete;

    @FXML
    private TreeTableView<?> salesassociates_table;

    @FXML
    private TreeTableColumn<?, ?> sa_firstname;

    @FXML
    private TreeTableColumn<?, ?> sa_lastname;

    @FXML
    private TreeTableColumn<?, ?> sa_username;

    @FXML
    private TreeTableColumn<?, ?> sa_password;

    @FXML
    private TreeTableColumn<?, ?> sa_email;

    @FXML
    private TreeTableColumn<?, ?> sa_phonenumber;

    @FXML
    private TreeTableColumn<?, ?> sa_salesvan;

    @FXML
    private Button sa_create;

    @FXML
    private Button sa_save;

    @FXML
    private Button sa_delete;

    @FXML
    private TreeTableView<?> warehousemanages_table;

    @FXML
    private TreeTableColumn<?, ?> wm_firstname;

    @FXML
    private TreeTableColumn<?, ?> wm_lastname;

    @FXML
    private TreeTableColumn<?, ?> wm_username;

    @FXML
    private TreeTableColumn<?, ?> wm_password;

    @FXML
    private TreeTableColumn<?, ?> wm_email;

    @FXML
    private TreeTableColumn<?, ?> wm_phonenumber;

    @FXML
    private Button wm_create;

    @FXML
    private Button wm_save;

    @FXML
    private Button wm_delete;

}


