package project3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Karen Cassine, Katie Lamb
 */
public class AccountFleet {


    ArrayList <Account> accountFleet;
    File file = new File("accounts");


    public AccountFleet(){
        file = new File("accountFleet.txt");
        try{
            if (file.createNewFile()) {
                System.out.println("account fleet created.");
                accountFleet = new ArrayList<>();
            }
        }
        catch (IOException e){
            System.out.println("account fleet already exists.");
        }

    }


    public void saveAccountChanges(){
        if(accountFleet.size() > 0){
            try {
                FileWriter fileWriter = new FileWriter(file);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                for(Account acc : accountFleet){
                    bufferedWriter.write(acc.getFirstName()+","+
                            acc.getLastName()+","+
                            acc.getUserName()+","+
                            acc.getPassword()+","+
                            acc.getEmail()+","+
                            acc.getPhoneNumber());
                    bufferedWriter.newLine();
                }
                bufferedWriter.close();
            }catch(IOException ex){ ex.printStackTrace(); }
        }
    }


    public ArrayList<Account> returnAccounts(){
        return accountFleet;
    }

    
    public boolean accountExists(Account account){
        boolean exists = false;
        for(Account a : accountFleet){
            if (accountFleet.contains(account))
                exists = true;
        }
        return exists;
    }

   public void removeAccount(Account account){
     Scanner remove = new Scanner(System.in);
        System.out.println("Enter account user name");
        String removes = remove.next();
  Iterator accounts= accountFleet.iterator();
  while(accounts.hasNext()){
       if(account.userName.equals(removes)){
            accountFleet.remove(account); 
       }
      
  }


    public void addAccount(Account account){
        if (accountFleet != null)
            accountFleet.add(account);
        else
            System.out.println("accountFleet not found");
    }
}


