package project3;

/**
 * @author Karen Cassine
 */
public class Account {
    
    String firstName; 
    String lastName;
    String userName; 
    String password;
    String email;
    String phoneNumber;
    
    
    public Account(String firstName, String lastName, String userName, String password, String email, String phoneNumber){
        
        
      firstName =firstName;
      lastName = lastName;
      userName= userName;
      password=password; 
      email=email;
      phoneNumber=phoneNumber;
        
        
        
          
    }
    
    public Account(String firstName, String lastName, String userName, String password, String email){
        
        
        
       firstName =firstName;
      lastName = lastName;
      userName= userName;
      password=password; 
      email=email;
         
        
    }
    
    
    
//setters
    
    
public void setPassword(String Password){
    this.password = password;
    
}


public void setEmail(String Email){
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





