package project3;
public class SystemAdmin extends Account {

    public SystemAdmin(String firstName, String LastName, String Password, String email, String UserName, String PhoneNumber) {
        super(firstName, LastName, Password, PhoneNumber, email, UserName);
    }
    
    public String getPassoword(){
        return this.Password; 
    }
    
    public String getAccountLogin(String userName){
        return this.UserName;
    }
    
    
    
    
    public void changePassword(){
        Scanner password = new Scanner(System.in); 
        System.out.println("What is your old password?");
        String pass = password.next(); 
        if(pass.equals(Password)){
            Scanner newPass = new Scanner(System.in);
            System.out.println("What is your new password?");
            this.Password = Password; 
        } else{
            System.out.println("Incorrect Password");
        }
        
        
    }
        

    
}
