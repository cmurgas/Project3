package project3;

import java.util.Scanner;

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

    public String getUserName(){
        return super.getUserName();
    }
    
    public String getPassword(){
        return super.getPassword();
    }

        /*public void changePassword(){
            Scanner password = new Scanner(System.in);
            System.out.println("What is your old password?");
            String pass = password.next();
            if(pass.equals(password)){
                Scanner newPass = new Scanner(System.in);
                System.out.println("What is your new password?");
                this.password = password;
            } else{
                System.out.println("Incorrect Password");
            }


        }*/
}
