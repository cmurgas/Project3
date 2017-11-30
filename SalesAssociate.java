package project3;

/**
 *
 * @author Karen Cassine
 */
public class SalesAssociate extends Account{

    public SalesAssociate(String firstName, String LastName, String Password, String email, String UserName, String PhoneNumber) {
        super(firstName, LastName, Password, PhoneNumber, email, UserName);
    }
    
    
    public String getPassoword(){
        return this.password; 
    }
    
    public String getAccountLogin(String userName){
        return this.userName;
    }
}


