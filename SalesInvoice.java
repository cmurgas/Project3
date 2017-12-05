Package project3;

import java.util.ArrayList;
import java.util.Date;

public class SalesInvoice {
   ArrayList<Sale> saleHistory;
   ArrayList<Sale> invoice;
   public SalesInvoice(){
       saleHistory = new ArrayList<>();
   }

   public void addSale(Sale sale){
       saleHistory.add(sale);
   }


   public ArrayList<Sale> generateInvoice(Date startDate, Date endDate, SalesAssociate salesAssociate){

       invoice = new ArrayList<>();

       for (Sale sale : saleHistory){

           Date saleDate = sale.getSaleDate();

           if ((saleDate.after(startDate) || saleDate.equals(startDate)) &&
                   (saleDate.before(endDate) || saleDate.equals(endDate)) &&
                   sale.getSoldBy() == salesAssociate){

               invoice.add(sale);
           }
       }
return invoice;
       

       //create a new file with the contents of the invoice
       //the names quantities and prices for each sale
   }
   public double salesCommission(Date startDate, Date endDate, SalesAssociate salesAssociate){
       double result = 0.0; 
       invoice = new ArrayList<>();

       for (Sale sale : saleHistory){

           Date saleDate = sale.getSaleDate();

           if ((saleDate.after(startDate) || saleDate.equals(startDate)) &&
                   (saleDate.before(endDate) || saleDate.equals(endDate)) &&
                   sale.getSoldBy() == salesAssociate){

               invoice.add(sale);
           }
       }
       
       for (Sale in: invoice){
           for(Double x: in.getPrices()){
               result+=x;           }
           
       }
       result = result *.15;
       return result;
    }
}


