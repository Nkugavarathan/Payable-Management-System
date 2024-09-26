public class Invoice implements Payable {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        try{
            if(quantity>0){
                this.quantity = quantity;
            }
            else {
                throw new Exception("invalid input plz input grater 0 value ");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            if(pricePerItem>0){
                this.pricePerItem = pricePerItem;
            }
            else {
                throw new Exception("invalid input plz input grater 0 value ");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        try{
            if(quantity>0){
                this.quantity = quantity;
            }
            else {
                throw new Exception("invalid input plz input grater 0 value ");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        try{
            if(pricePerItem>0){
                this.pricePerItem = pricePerItem;
            }
            else {
                throw new Exception("invalid input plz input grater 0 value ");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public double getPaymentAmount() {
        return this.pricePerItem*this.quantity;
    }

    @Override
    public String toString() {
        return "Invoice: "+
                "\npart number: "+this.partNumber+" ("+this.partDescription+") "+
                "\nquantity: "+this.quantity+
                "\nprice per item: Rs"+this.pricePerItem+
                "\npayment due: Rs"+getPaymentAmount();
    }

}
/*
class main{
    public static void main(String[] args) {
        Invoice i=new Invoice("x2003","seat",2,3750);
        System.out.println(i.toString());
    }
}
*/
