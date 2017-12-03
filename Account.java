package project3;

/**
 * @author Karen Cassine, Katie Lamb
 */
public class Account {

    String firstName;
    String lastName;
    String userName;
    String password;
    String email;
    String phoneNumber;


    public Account(String firstName, String lastName, String userName, String password, String email, String phoneNumber){

        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }

//setters


    public void setPassword(String password){
        this.password = password;

    }


    public void setEmail(String email){
        this.email = email;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
//getters

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getPassword(){
        return password;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public String getEmail(){
        return email;
    }

    public String getUserName(){
        return userName;
    }
}
