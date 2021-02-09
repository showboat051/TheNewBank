package Models;

import java.util.Scanner;

public class Customer {

    private int CustID;
    private String Name;
    private double Balance;


    private String AccountStatus;

    @Override
    public String toString() {
        return "Customer{" +
                "CustID=" + CustID +
                ", Name='" + Name + '\'' +
                ", Balance=" + Balance +
                ", AccountStatus='" + AccountStatus + '\'' +
                '}';
    }


    public String getAccountStatus() {
        return AccountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        AccountStatus = accountStatus;
    }




    public int getCustID() {
        return CustID;
    }

    public void setCustID(int custID) {
        CustID = custID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    // plain Constructor
    public Customer() {
        actionQue();
    }

    // Constructor for w/o status
    public Customer(int custID, String name, double balance) {
        CustID = custID;
        Name = name;
        Balance = balance;
        actionQue();
    } // end of Constructor w/o status

    // Constructor w/status
    public Customer(int custID, String name, double balance, String accountStatus) {
        CustID = custID;
        Name = name;
        Balance = balance;
        AccountStatus = accountStatus;

        actionQue();
        Scanner nameQues = new Scanner(System.in);
        System.out.println("Enter your name");

        Name = nameQues.nextLine();
        System.out.println("Welcome back " + Name);
        





        if( balance < 0 ) {
            accountStatus = "negative";
        } else {
            accountStatus = "Good Standing";
        }
    } // end of Customer with 4 arguments

    private void Withdraw() {

    }


    private void actionQue() {
        Scanner actionQues = new Scanner(System.in);
        System.out.println("What would you like to do? ");


        String action =  actionQues.nextLine();
        switch (action) {
            case "view balance":
                break;
            case "Withdraw":
                Withdraw();
                break;
            case "d":
                Deposit();
                break;
    }


} // end actionQue()

    private double Deposit() {
        Scanner userDep = new Scanner(System.in);
        System.out.println("How much would you like to deposit? ");
        double depAmt = userDep.nextDouble();
        System.out.println(depAmt);
        return depAmt;
    } // end of Deposit()

} // END OF CUSTOMER CLASS
