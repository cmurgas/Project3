import java.util.ArrayList;
import java.util.Date;

/**
 * The Sale class creates and edits objects of type Sale to keep track
 * of transactions made by Sales Associates
 */
public class Sale {
    Date saleDate;
    ArrayList<String> partNames;
    ArrayList<Integer> amounts;
    ArrayList<Double> prices;
    SalesAssociate soldBy;

    /**
     * Sale constructor constructs an object of type Sale
     *
     * @param saleDate  Date object that records the sell date of the object(s)
     * @param partNames ArrayList that keeps track of the names of all the parts sold
     * @param amounts   ArrayList that keeps track of the amounts of all parts sold
     * @param prices    ArrayList that keeps track of all the prices of all parts sold
     * @param soldBy    SalesAssociate who makes the sale
     */
    public Sale(Date saleDate,
                ArrayList<String> partNames,
                ArrayList<Integer> amounts,
                ArrayList<Double> prices,
                SalesAssociate soldBy) {
        this.saleDate = saleDate;
        this.partNames = partNames;
        this.amounts = amounts;
        this.prices = prices;
        this.soldBy = soldBy;
    }

    /**
     * getSaleDate method returns the date of a sale
     *
     * @return saleDate Date
     */
    public Date getSaleDate() {
        return saleDate;
    }

    /**
     * getPartNames method returns the names of parts sold
     *
     * @return partNames ArrayList
     */
    public ArrayList<String> getPartNames() {
        return partNames;
    }

    /**
     * getAmounts method returns the amounts of parts sold
     *
     * @return amounts ArrayList
     */
    public ArrayList<Integer> getAmounts() {
        return amounts;
    }

    /**
     * getPrices method returns the prices of all the items in a sale
     *
     * @return prices ArrayList
     */
    public ArrayList<Double> getPrices() {
        return prices;
    }

    /**
     * getSoldBy method returns the sales associate who sold the things
     *
     * @return soldBy SalesAssociate
     */
    public SalesAssociate getSoldBy() {
        return soldBy;
    }
}
