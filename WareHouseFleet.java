package project3;

import java.util.ArrayList;
import java.util.Collections;

/**
 * WareHouseFleet class is an ArrayList of warehouses
 */
public class WareHouseFleet {
   ArrayList<WareHouse> fleet = new ArrayList<>();
   ArrayList<BikePart> totals = new ArrayList<>();
   WareHouse warehouse;
    /**
     * WareHouseFleet is a constructor for the object
     */
   public WareHouseFleet(){
       this.fleet = fleet;
   }
    /**
     * getWareHouse returns the warehouse from the ArrayList
     * @param warehousename
     * @return warehouse
     */
   public WareHouse getWareHouse(String wareHouseName){
       for(WareHouse wh: fleet){
           if (wh.getWareHouseName().equals(wareHouseName)){
               warehouse = wh;
           }
       }
       return warehouse;
   }
/**
     * addWareHouse adds a warehouse to the ArrayList
     * @param warehousename
     */
   public void addWareHouse(WareHouse wareHouseName){
       fleet.add(wareHouseName);
   }

    /**
     * generateTotals returns an ArrayList of all BikeParts from all warehouses
     * @return totals
     */
   public ArrayList<BikePart> generateTotals(){
       BikePart search = null;
       for(WareHouse wh: fleet){
           ArrayList<BikePart> bikeparts = wh.getArrayList();
           for(BikePart bp: bikeparts){
               if(totals.contains(bp) == false){
                   totals.add(bp);
               }
               else if(totals.contains(bp)){
                   String searching = bp.getName();
                   for(BikePart lx: totals){
                       if(lx.equals(searching)){
                           int where = totals.indexOf(searching);
                           search = totals.get(where);
                       }
                   }
                   bp.setQuantity(search.getQuantity() + bp.getQuantity());
                   totals.remove(search);
                   totals.add(bp);
               }
           }
       }
       return totals;
   }
    /**
     * numberSort organizes the fleet by numerical order
     */
   public void numberSort(){
       ArrayList<Integer> bikePartNumbers = new ArrayList<>();
       ArrayList<BikePart> bikePartSort = new ArrayList<>();
       for (BikePart bp: totals){
           bikePartNumbers.add(bp.getNumber());
       }
       Collections.sort(bikePartNumbers);
       for (int x=0; x< bikePartNumbers.size(); x++){
           for (BikePart bp: totals){
               if (bikePartNumbers.get(x)==bp.getNumber()){
                   int index = totals.indexOf(bp);
                   BikePart sort = totals.get(index);
                   bikePartSort.add(sort);
               }

           }
       }
       totals = bikePartSort;
   }
/**
     * nameSort organizes the fleet by alphabetical order
     */
   void nameSort(){
       ArrayList<String> bikePartNames = new ArrayList<>();
       ArrayList<BikePart> bikePartSort = new ArrayList<>();
       for (BikePart bp: totals){
           bikePartNames.add(bp.getName());
       }
       Collections.sort(bikePartNames);
       for (int x=0; x< bikePartNames.size(); x++){
           for (BikePart bp: totals){
               if (bikePartNames.get(x).equals(bp.getName())){
                   int index = totals.indexOf(bp);
                   BikePart sort = totals.get(index);
                   bikePartSort.add(sort);
               }

           }
       }
       totals = bikePartSort;
   }

   public void moveParts(ArrayList<String> names, ArrayList<Integer> amounts, String moveFrom, String moveTo){
       WareHouse wareHouse2 = new WareHouse("WareHouse");
       for (WareHouse wh2 : fleet){
           if (wh2.getWareHouseName().equals(moveTo))
               wareHouse2 = wh2;
       }
       for (WareHouse wh1 : fleet){
           if (wh1.getWareHouseName().equals(moveFrom)){
               for (String name : names){
                   int index = wh1.getPartIndex(name);
                   BikePart bp = wh1.getArrayList().get(index);
                   bp.setQuantity(bp.getQuantity() - amounts.get(index));
                   wh1.getArrayList().set(index, bp);

                   if (wareHouse2.containsPart(bp)){
                       wareHouse2.getArrayList().indexOf(bp);
                       bp.setQuantity(bp.getQuantity()+ amounts.get(index));
                       wareHouse2.addBikePart(bp);

                   }
                   else{
                       bp.setQuantity(amounts.indexOf(index));
                       wareHouse2.addBikePart(bp);
                   }
               }
           }
       }
   }

}



