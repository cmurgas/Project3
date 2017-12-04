package project3;

/**
 *
 * @author Karen Cassine, Katie Lamb
 */
public class SalesAssociate extends Account{

    public SalesAssociate(String firstName, String lastName, String userName, String password, String email, String phoneNumber) {
        super(firstName, lastName, userName, password, email, phoneNumber);
    }
    
    public String getUserName(String userName){
        return super.getUserName();
    }

    public String getPassword(){
        return super.getPassword();
    }
}



