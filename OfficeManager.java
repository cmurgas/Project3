package project3;

/**
 *
 * @author Karen Cassine
 */
public class OfficeManager extends Account{

    public OfficeManager(String firstName, String LastName, String Password, String email, String UserName, String PhoneNumber) {
        super(firstName, LastName, Password, PhoneNumber, email, UserName);
    }
    
   
    
    
  public String getPassoword(){
        return this.password; 
    }
    
    public String getAccountLogin(String userName){
       return this.userName;
    }  
    
    public void orderParts(BikePart part, int amount){
        part.setQuantity(part.getQuantity()+amount);
    }
    public void displayPart(String bike_name, WareHouse warehouse){
        warehouse.displayBikePart(bike_name);
    }
}


