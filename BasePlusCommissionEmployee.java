public class BasePlusCommissionEmployee extends CommisionEmployee{
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, int age, String NIC, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, age, NIC, grossSales, commissionRate);
        try{
            if(baseSalary>0){
                this.baseSalary = baseSalary;
            }
            else {
                throw new Exception("invalid input plz input >0 values");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        try{
            if(baseSalary>0){
                this.baseSalary = baseSalary;
            }
            else {
                throw new Exception("invalid input plz input >0 values");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public double getPaymentAmount() {
        return this.baseSalary+super.getPaymentAmount();
    }
    public String toString() {
        return "Hourly Employee: "+super.getFirstName() +" "+super.getLastName()+" "+"("+super.getAge()+")"+
                "\nNational Identification Number: "+super.getNIC()+
                "\ngross sales: Rs "+super.getGrossSales()+" ;"+ " commision rate : "+super.getCommissionRate()+
                "\nbase salary: Rs "+this.baseSalary+
                "\nearned: Rs " +getPaymentAmount();
    }
}
/*
class main{
    public static void main(String[] args) {
        BasePlusCommissionEmployee h =new BasePlusCommissionEmployee("sanath","perera",28,"95595959v",500000,.02,-15000);
        System.out.println(h.toString());
    }
}

 */