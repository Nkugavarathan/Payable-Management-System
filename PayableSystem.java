import java.io.Writer;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class PayableSystem {
    static Payable[] payableobj=new Payable[100];
    static int payablecount=0;
    static int choice;
    public static void main(String[] args) {
        printMenu();

    }
    public static void printMenu(){
        do{
            Scanner scan=new Scanner(System.in);
            System.out.println("Welcome to Kumar company");
            System.out.println("---------------------------------------------");
            System.out.println("1.Register New Payable (Employee/Invoice)");
            System.out.println("2.Payable Records");
            System.out.println("3.Print Payable");
            System.out.println("4.Exit");

            System.out.print("Enter your choice : ");

            choice=scan.nextInt();


            switch (choice) {
                case 1:
                    registerNewPayable();
                    break;
                case 2:
                    detailPayable();
                    break;
                case 3:
                    printPayable();
                    break;
                case 4:
                    System.out.println("-------------------------------------------------");
                    System.out.println("Thank you for using Kumar payable System. !!");
                    System.out.println("-------------------------------------------------");
            }
        }while (choice!=4);

    }
    public static void registerNewPayable(){
        System.out.println("Welcome to registration ");
        System.out.println("----------------------------");
        System.out.println("Enter a relevant payable type: ");
        int choice;
        Scanner scan=new Scanner(System.in);
        System.out.println("1.Invoice");
        System.out.println("2.Hourly employee");
        System.out.println("3.Commission employee");
        System.out.println("4.Base-salaried commission employee");

        System.out.print("Enter your choice : ");
        choice=scan.nextInt();

        switch (choice){
            case 1:
                System.out.print("Enter part number : ");
                String partnumber=scan.next();

                System.out.print("Enter part description : ");
                String partdescription=scan.next();

                System.out.print("Enter quantity : ");
                int quantity=scan.nextInt();

                System.out.print("Enter price per item : ");
                double priceperitem=scan.nextDouble();

                payableobj[payablecount++]=new Invoice(partnumber,partdescription,quantity,priceperitem) ;
                System.out.println("Payable is registered successfully!!");

                break;
            case 2:
                System.out.print("Enter first name : ");
                String fnameHE=scan.next();

                System.out.print("Enter last name : ");
                String lnameHE=scan.next();

                System.out.print("Enter age : ");
                int ageHE=scan.nextInt();

                System.out.print("Enter national identification number : ");
                String nicHE=scan.next();

                System.out.print("Enter wage per hour: ");
                double wage=scan.nextDouble();

                System.out.print("Enter number of hours  : ");
                double hours=scan.nextDouble();

                payableobj[payablecount++]=new HourlyEmployee(fnameHE,lnameHE,ageHE,nicHE,wage,hours) ;
                System.out.println("Payable is registered successfully!!");

                break;

            case 3:
                System.out.print("Enter first name : ");
                String fnameCE=scan.next();

                System.out.print("Enter last name : ");
                String lnameCE=scan.next();

                System.out.print("Enter age : ");
                int ageCE=scan.nextInt();

                System.out.print("Enter national identification number : ");
                String nicCE=scan.next();

                System.out.print("Enter gross sale: ");
                double gross=scan.nextDouble();

                System.out.print("Enter commission rate : ");
                double commissionrate=scan.nextDouble();

                payableobj[payablecount++]=new CommisionEmployee(fnameCE,lnameCE,ageCE,nicCE,gross,commissionrate) ;
                System.out.println("Payable is registered successfully!!");

                break;
            case 4:
                System.out.print("Enter first name : ");
                String fnameBCE=scan.next();

                System.out.print("Enter last name : ");
                String lnameBCE=scan.next();

                System.out.print("Enter age : ");
                int ageBCE=scan.nextInt();

                System.out.print("Enter national identification number : ");
                String nicBCE=scan.next();

                System.out.print("Enter gross sale: ");
                double grossBCE=scan.nextDouble();

                System.out.print("Enter commission rate : ");
                double commissionrateBCE=scan.nextDouble();

                System.out.print("Enter base salary : ");
                double basesalary=scan.nextDouble();

                payableobj[payablecount++]=new BasePlusCommissionEmployee(fnameBCE,lnameBCE,ageBCE,nicBCE,grossBCE,commissionrateBCE,basesalary) ;
                System.out.println("Payable is registered successfully!!");

                break;

        }

    }
    public static void detailPayable(){
        for (int i=0;i<payablecount;i++){
            if(payableobj[i]!=null){
                System.out.println(payableobj[i].toString());
                System.out.println(" ");
            }
        }
    }
    public static void printPayable(){
        FileWriter writer = null;
        try {
            writer = new FileWriter("E:\\java\\Payable System\\print.txt");
            for(int i = 0; i < payablecount; i++){
                if(payableobj[i] != null){
                    writer.write(payableobj[i].toString() + "\n\n");
                }
            }
            writer.close();
            System.out.println("Payable records have been printed to print.txt ");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file:");
            e.printStackTrace();

        }

    }

}

