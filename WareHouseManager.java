package project3;

/**
 *
 * @author Karen Cassine
 */
public class WarehouseManager extends Account{
    
    public WarehouseManager(String firstName, String LastName, String Password, String email, String UserName, String PhoneNumber) {
        super(firstName, LastName, Password, PhoneNumber, email, UserName);
    }

    public void displayPart(String bike_name, WareHouse warehouse){
        warehouse.displayBikePart(bike_name);
    }
       
}
