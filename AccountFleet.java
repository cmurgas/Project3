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
    ArrayList<Account> accountFleet;
    File file;


    public AccountFleet(){
        file = new File("AccountFleet.txt");
        try{
            if (file.createNewFile()) {
                accountFleet = new ArrayList<>();
                System.out.println("account fleet created.");
            }
        }
        catch (IOException e){
            System.out.println("loading existing fleet...");
            accountFleet = readAccountFleetFile(file);
        }
    }

    public static ArrayList<Account> readAccountFleetFile(File file){
        ArrayList<Account> accounts = new ArrayList<>();
        try{
            Scanner update = new Scanner(file);
            while(update.hasNextLine()) {
                String a = update.nextLine();
                String[] aa = a.split(",");
                Account nac = new Account((aa[0]),
                        (aa[1]),
                        (aa[2]),
                        (aa[3]),
                        (aa[4]),
                        (aa[5]));
                accounts.add(nac);
                System.out.println("accountFleet loaded");
            }
            update.close();
        } catch (Exception e) { e.printStackTrace(); }
        return accounts;
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


    public ArrayList<Account> getAccounts(){
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

    public void removeAccount(Account account) {
        Scanner remove = new Scanner(System.in);
        System.out.println("Enter account user name");
        String removes = remove.next();
        Iterator accounts = accountFleet.iterator();
        while (accounts.hasNext()) {
            if (account.userName.equals(removes)) {
                accountFleet.remove(account);
            }

        }
    }


    public void addAccount(Account account){
        if (accountFleet != null)
            accountFleet.add(account);
        else
            System.out.println("accountFleet not found");
    }
}


