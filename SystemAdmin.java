package project3;
public class SystemAdmin extends Account {

    public class SystemAdmin extends Account {

    public SystemAdmin(String firstName,
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
