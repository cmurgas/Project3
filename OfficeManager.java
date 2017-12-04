package project3;

/**
 *
 * @author Karen Cassine, Katie Lamb
 */
public class OfficeManager extends Account {

    public OfficeManager(String firstName,
                            String lastName,
                            String userName,
                            String password,
                            String email,
                            String phoneNumber) {
        super(firstName,
                lastName,
                userName,
                password,
                email,
                phoneNumber);
    }

    public String getUserName(){
        return super.getUserName();
    }

    public String getPassword(){
        return super.getPassword();
    }
    
    public void orderParts(BikePart part, int amount){
        part.setQuantity(part.getQuantity()+amount);
    }
    public void displayPart(String bike_name, WareHouse warehouse){
        warehouse.displayBikePart(bike_name);
    }
}


