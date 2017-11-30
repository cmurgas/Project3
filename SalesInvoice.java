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


   public void generateInvoice(Date startDate, Date endDate, SalesAssociate salesAssociate){

       invoice = new ArrayList<>();

       for (Sale sale : saleHistory){

           Date saleDate = sale.getSaleDate();

           if ((saleDate.after(startDate) || saleDate.equals(startDate)) &&
                   (saleDate.before(endDate) || saleDate.equals(endDate)) &&
                   sale.getSoldBy() == salesAssociate){

               invoice.add(sale);
           }
       }

       System.out.println("Invoice for Sales Associate " + salesAssociate.getFirstName() + " " + salesAssociate.getLastName());
       System.out.println("From the dates " + startDate + " to " + endDate);
       for (Sale in : invoice){
           System.out.println("Date:\t" + in.getSaleDate());
           //print to text area "Invoice made"
       }

       //create a new file with the contents of the invoice
       //the names quantities and prices for each sale
   }
}


