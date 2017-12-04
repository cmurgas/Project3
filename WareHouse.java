package project3;

import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

/**
* WareHouse Class constructs a Warehouse as an ArrayList of BikeParts
* @author Katie Lamb
*/
public class WareHouse {
   private String wareHouseName;
   private File file;
   private ArrayList<BikePart> wareHouse;

   /**
    * WareHouse constructor constructs a Warehouse out of an empty ArrayList for
    * BikeParts and gives it a name and creates it a file with a matching name
    * @param wareHouseName String
    */
   public WareHouse(String wareHouseName){
       this.wareHouseName = wareHouseName;
       file = new File(wareHouseName +".txt");
       try{
           if (file.createNewFile()) {
               System.out.println("Warehouse " + wareHouseName + " created.");
               wareHouse = new ArrayList<>();
           }
       }
       catch (IOException e){
           System.out.println("Warehouse " + wareHouseName + " already exists.");

       }
       wareHouse = readFileIn(file);//this might not be right
   }

   /**
    * method containsPart checks to see if a particular bikepart
    * is contained in a warehouse
    * @param bikePart BikePart object to look for in the warehouse
    * @return boolean: the part does or does not exist
    */
   public boolean containsPart(BikePart bikePart){
       boolean exists = false;
       for (BikePart bp : wareHouse){
           if (bp == bikePart)
               exists = true;
       }
       return exists;
   }
  
   /**
    * addBikePart method adds a BikePart to a Warehouse if the part is
    * not in the Warehouse or increases its stock if it is
    * @param bikePart BikePart
    */
   public void addBikePart(BikePart bikePart){
       boolean exists = false;
       if (wareHouse != null) {
           for (BikePart bp : wareHouse) {
               if (bikePart.getName().equals(bp.getName())) {
                   bp.setQuantity(bp.getQuantity() + bikePart.getQuantity());
                   bp.setListPrice(bikePart.getListPrice());
                   bp.setSalePrice(bikePart.getSalePrice());
                   bp.setSale(bikePart.getSale());
                   exists = true;
               }
           }
       }
       if (!exists)
           wareHouse.add(bikePart);
   }

   /**
    * readFileIn method reads a file into the main warehouse
    * @param file of type File to be read in
    * @return workingDirectory ArrayList<BikePart>
    */
   //IS THERE A BETTER WAY TO DO THIS?
   public static ArrayList<BikePart> readFileIn(File file){
       ArrayList<BikePart> workingDirectory = new ArrayList<>();
       try {
           Scanner sc = new Scanner(file);
           while (sc.hasNextLine()) {
               String s = sc.nextLine();
               String [] ss = s.split(",");
               BikePart bp = new BikePart(ss[0],
                       Integer.parseInt(ss[1]),
                       Double.parseDouble(ss[2]),
                       Double.parseDouble(ss[3]),
                       ss[4].equals("true"),
                       Integer.parseInt(ss[5]));
               workingDirectory.add(bp);
           }
           sc.close();
       }
       catch (IOException e) {
           e.printStackTrace();
       }
       return (workingDirectory);
   }

   /**
    * method getPartIndex() takes the name of a bikepart and returns
    * the index which that bike part is at
    * @param partName String the name of the bike part
    * @return int the index at which the warehouse holds the part
    */
   public int getPartIndex(String partName){
       int index = -1;
       for (BikePart bp : wareHouse){
           if (bp.getName().equals(partName))
               index = wareHouse.indexOf(bp);
       }
       return index;
   }

   /**
    * displayBikePart method displays a BikePart by its name
    * @param name String
    */
   public void displayBikePart(String name){
       for (BikePart bp : wareHouse){
           if (bp.getName().equals(name)){
               System.out.println(bp.getName() + ", " +
                       bp.getNumber() + ", " +
                       bp.getPrice());
           }
       }
   }

   /**
    * saveWareHouseChanges method saves the changes made to a warehouse
    * to the warehouse's file
    */
   //THIS WOULD NEED TO BE CALLED IN THE CONTROLLERS AT THE END OF EACH DO-METHOD THAT CHANGED SOMETHING IN THE WAREHOUSE(S)
   public void saveWareHouseChanges(){
       if(wareHouse.size() > 0){
           try {
               FileWriter fileWriter = new FileWriter(file);
               BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
               for(BikePart bp : wareHouse){
                   bufferedWriter.write(bp.getName()+","+
                           bp.getNumber()+","+
                           bp.getListPrice()+","+
                           bp.getSalePrice()+","+
                           bp.getSale()+","+
                           bp.getQuantity());
                   bufferedWriter.newLine();
               }
               bufferedWriter.close();
           }catch(IOException ex){ ex.printStackTrace(); }
       }
   }

   /**
    * sellPart method retrieves a part by number and sells the amount specified
    * @param number int
    * @param amount int
    */
   //NEEDS TO CREATE A SALE OBJECT AND ADD IT TO SALES HISTORY
   public void sellPart(int number, int amount){
       for (BikePart bp : wareHouse){
           if (bp.getNumber() == number){
               bp.setQuantity( bp.getQuantity() - amount );
           }
       }
   }

   /**
    * numberSort method sorts all BikeParts in a Warehouse by their ID Numbers
    */
   public void numberSort(){
       for(int i = wareHouse.size()-1; i>=0; i--){
           boolean swapped = false;
           for(int j = 0 ; j <= i - 1 ; j++ ){
               if ((wareHouse.get(j).getNumber())>(wareHouse.get(j+1).getNumber())){
                   BikePart shelf = wareHouse.get(j);
                   wareHouse.set(j, wareHouse.get(j+1));
                   wareHouse.set(j+1, shelf);
                   swapped = true;
               }
           }
           if (!swapped)
               break;
       }
   }

   /**
    * nameSort method sorts all BikeParts in a Warehouse by their Names
    */
   public void nameSort(){
       for(int i = wareHouse.size()-1; i >= 0; i--){
           boolean swapped = false;
           for(int j = 0; j<= i-1; j++){
               if (wareHouse.get(j).getName().compareTo(wareHouse.get(j + 1).getName()) > 0){
                   BikePart shelf = wareHouse.get(j);
                   wareHouse.set(j, wareHouse.get(j+1));
                   wareHouse.set(j+1, shelf);
                   swapped = true;
               }
           }
           if (!swapped)
               break;
       }
   }

   /**
    * getArrayList method returns a Warehouse's ArrayList
    * @return warehouse of type ArrayList<BikePart>
    */
   public ArrayList<BikePart> getArrayList(){ return wareHouse; }

   /**
    * getWareHouseName method returns the name of a Warehouse
    * @return warehouseName String
    */
   public String getWareHouseName(){ return wareHouseName; }

   /**
    * the method getFile returns the file associated with the warehouse object
    * it is called on
    * @return File file of BikePart information for a Warehouse (or van)
    */
   public File getFile(){ return file; }
   
   public void readInventoryUpdate(File file) {
        try{
            Scanner update = new Scanner(file);
            while(update.hasNextLine()){
                String u = update.nextLine();
                String[] uu = u.split(",");
                BikePart nbp = new BikePart ((uu[0]),
                        Integer.parseInt(uu[1]),
                        Double.parseDouble(uu[2]),
                        Double.parseDouble(uu[3]),
                        uu[4].equals("true"),
                        Integer.parseInt(uu[5]));
                wareHouse.add(nbp);
            }
        } catch (Exception e) { e.printStackTrace(); }
        
    }

}
