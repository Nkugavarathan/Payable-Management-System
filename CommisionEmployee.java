public class CommisionEmployee extends  Employee{
    private double grossSales;
    private double commissionRate;

    public CommisionEmployee(String firstName, String lastName, int age, String NIC, double grossSales, double commissionRate) {
        super(firstName, lastName, age, NIC);
        try{
            if(grossSales>0){
                this.grossSales = grossSales;
            }
            else {
                throw new Exception("invalid input plz input >0 values");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            if(commissionRate >=0 && commissionRate <=1){
                this.commissionRate = commissionRate;
            }
            else {
                throw new Exception("invalid input plz commission rate value between 0 and 1 ");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        try{
            if(grossSales>0){
                this.grossSales = grossSales;
            }
            else {
                throw new Exception("invalid input plz hours value between 0 and 168 ");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        try{
            if(commissionRate >=0 && commissionRate <=1){
                this.commissionRate = commissionRate;
            }
            else {
                throw new Exception("invalid input plz input hours value between 0 and 168 ");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    @Override
    public double getPaymentAmount() {
        return this.commissionRate*this.grossSales;
    }

    @Override
    public String toString() {
        return "Hourly Employee: "+super.getFirstName() +" "+super.getLastName()+" "+"("+super.getAge()+")"+
                "\nNational Identification Number: "+super.getNIC()+
                "\ngross sales: Rs "+this.grossSales+" ;"+ " commision rate : "+this.commissionRate+
                "\nearned: Rs " +getPaymentAmount();
    }
}
/*
class main{
    public static void main(String[] args) {
        CommisionEmployee h =new CommisionEmployee("sanath","perera",28,"95595959v",1000000,.04);
        System.out.println(h.toString());
    }
}

 */