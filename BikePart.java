package project3;

/**
 * BikePart class creates a BikePart
 */
public class BikePart {
    String name;
    int number;
    double listPrice;
    double salePrice;
    boolean onSale;
    int quantity;
    
    /**
     * public BikePart creates the object
     * @param name is the name of the bike
     * @param number is the number of the bike
     * @param listPrice is the price of the bike
     * @param salePrice is the sales price of the bike
     * @param onSale is a boolean to see whether the bike is on sale or not
     * @param quantity is the amount of bikes there is
     */
    public BikePart(String name, int number, double listPrice, double salePrice, boolean onSale, int quantity){
        this.name = name;
        this.number = number;
        this.listPrice = listPrice;
        this.salePrice = salePrice;
        this.onSale = onSale;
        this.quantity = quantity;
    }

    /**
     * getName returns the name of the BikePart
     * @return name
     */
    public String getName(){
        return name;
    }

    /**
     * getNumber returns the number of the BikePart
     * @return number
     */
    public int getNumber(){
        return number;
    }

    /**
     * getListPrice returns the list price of the BikePart
     * @return listPrice
     */
    public double getListPrice(){
        return listPrice;
    }

    /**
     * getSalePrice returns the sale price of the BikePart
     * @return salePrice
     */
    public double getSalePrice(){
        return salePrice;
    }

    /**
     * getQuantity returns the quantity of the BikePart
     * @return quantity
     */
    public int getQuantity(){
        return quantity;
    }

    /**
     * getSale returns whether the bike is on sale or not
     * @return onSale
     */
    public boolean getSale(){
        return onSale;
    }

    /**
     * getPrice returns the actual price of the object, depending if it is on sale or not
     * @return salePrice or listPrice
     */
    public double getPrice(){
        if (onSale == true){
            return salePrice;
        }
        else{
            return listPrice;}
    }

    /**
     * setListPrice sets the list price for the object
     * @param setList
     */
    void setListPrice(double setList){
        this.listPrice = setList;
    }

    /**
     * setSalePrice sets the sale price of the object
     * @param setSale
     */
    void setSalePrice(double setSale){
        this.salePrice = setSale;
    }

    /**
     * setQuantity sets the quantity of the object
     * @param setQuantity
     */
    void setQuantity(int setQuantity){
        this.quantity = setQuantity;
    }

    /**
     * setSale sets the boolean onSale for the object
     * @param setSale
     */
    void setSale(boolean setSale){
        this.onSale = setSale;
    }
    
}

