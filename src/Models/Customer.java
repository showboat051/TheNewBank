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

//    // plain Constructor
//    public Customer() {
////        actionQue();
//    }
//
//    // Constructor for w/o status
//    public Customer(int custID, String name, double balance) {
//        CustID = custID;
//        Name = name;
//        Balance = balance;
////        actionQue();
//    } // end of Constructor w/o status

    // Constructor w/status
    public Customer(int custID, String name, double balance, String accountStatus) {
        CustID = custID;
        Name = name;
        Balance = balance;
        AccountStatus = accountStatus;

        if (balance < 0) {
            AccountStatus = "negative";
        } else {
            AccountStatus = "Good Standing";
        }
              /*
        Scanner nameQues = new Scanner(System.in);
        System.out.println("Enter your name");

        Name = nameQues.nextLine();
        System.out.println("Welcome back " + Name);

        Scanner actionQues = new Scanner(System.in);
        System.out.println("What would you like to do? " + Name);


        String action = actionQues.nextLine();
        switch (action) {
            case "view balance":
                System.out.println("Your balance is " + balance);
                break;
            case "Withdraw":
                Scanner userWithdraw = new Scanner(System.in);

                System.out.println("How much would you like to withdraw? ");
                double WithdrawAmt = userWithdraw.nextDouble();
                double withBal = balance - WithdrawAmt;
                System.out.println(Name + " Your new balance after withdrawal is " + withBal );
                break;
            case "d":
                Scanner userDep = new Scanner(System.in);
                System.out.println("How much would you like to deposit? ");
                double depAmt = userDep.nextDouble();
                double depBal = balance + depAmt;
                System.out.println(Name + " Your new balance is " + depBal );
                break;


        } // end of switch cases
*/
    } // end of Customer with 4 arguments

} // END OF CUSTOMER CLASS
