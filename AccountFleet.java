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


    public ArrayList returnAccounts(){
        return accountFleet;
    }

    
    public boolean accountExist(String string){

        Scanner contains = new Scanner(System.in);
        System.out.println("Enter account name.");
        String contain = contains.next();
        for(int x=0; x< accountFleet.size(); x++){
            if (accountFleet.contains(contains)){
                return true;
            }else{
                return false;
            }
        }
        return true;
    }

    public void removeAccount(String string){
        Scanner remove = new Scanner(System.in);
        System.out.println("Enter account to remove");
        String removes = remove.next();

        Iterator it= accountFleet.iterator();

        while (it.hasNext()){

        }
    }


    public void addAccount(Account account){
        accountFleet.add(account);
    }
}


