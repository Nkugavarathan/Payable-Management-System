public abstract class Employee implements Payable {
    private String firstName;
    private String lastName;
    private int age;
    private String NIC;


    public Employee(String firstName, String lastName, int age, String NIC) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.NIC = NIC;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        try{
            if(age>=18 && age<=60){
                this.age = age;
            }
            else {
                throw new Exception("invalid input plz input age between 18-60 ");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }
}

