package project3;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;


public class OfficeManagerScreenController {

    

    @FXML
    private TreeTableView<?> bikeparts_tree;

    @FXML
    private TreeTableColumn<?, ?> bikename;

    @FXML
    private TreeTableColumn<?, ?> bikenumber;

    @FXML
    private TreeTableColumn<?, ?> listPrice;

    @FXML
    private TreeTableColumn<?, ?> salesPrice;

    @FXML
    private TreeTableColumn<?, ?> onSale;

    @FXML
    private TreeTableColumn<?, ?> quantity;

    @FXML
    private TextField search_name;

    @FXML
    private TextField search_number;

    @FXML
    private TextArea display_bike;

    @FXML
    private Button search;

    @FXML
    private Button order_parts;

    @FXML
    private TextField sales_associate;

    @FXML
    private TextField start_date;

    @FXML
    private TextField end_date;

    @FXML
    private TextArea sales_commission;

}
