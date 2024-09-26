public class HourlyEmployee extends Employee{
    private double wage;
    private  double hours;

    public HourlyEmployee(String firstName, String lastName, int age, String NIC,double wage,double hours) {
        super(firstName, lastName, age, NIC);
        try {
            if (wage > 0) {
                this.wage = wage;
            } else {
                throw new Exception("invalid input plz input grater 0 value ");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            if (hours >= 0 && hours <= 168) {
                this.hours = hours;
            } else {
                throw new Exception("invalid input plz hours value between 0 and 168 ");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        try{
            if(wage>0){
                this.wage = wage;
            }
            else {
                throw new Exception("invalid input plz input grater 0 value ");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        try{
            if(hours>=0 && hours<=168){
                this.hours = hours;
            }
            else {
                throw new Exception("invalid input plz hours value between 0 and 168 ");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    @Override
    public double getPaymentAmount() {
        if(hours>=40){
            return this.hours*this.wage+(this.hours-40)*this.wage*1.5;

        }
        else {
            return this.hours*this.wage;
        }
    }

    @Override
    public String toString() {
        return "Hourly Employee: "+super.getFirstName() +" "+super.getLastName()+" "+"("+super.getAge()+")"+
                "\nNational Identification Number: "+super.getNIC()+
                "\nhourly wage: Rs "+this.wage+" ;"+ " hours worked : "+this.hours+
                "\nearned: Rs " +getPaymentAmount();
    }
}
/*
class main{
    public static void main(String[] args) {
        HourlyEmployee h =new HourlyEmployee("sanath","perera",28,"95595959v",-800,250);
        System.out.println(h.toString());
    }
}

 */