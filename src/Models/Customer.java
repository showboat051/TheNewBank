package Models;

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

// Constructor for w/o status
    public Customer(int custID, String name, double balance) {
        CustID = custID;
        Name = name;
        Balance = balance;
    }

    // Constructor w/status
    public Customer(int custID, String name, double balance, String accountStatus) {
        CustID = custID;
        Name = name;
        Balance = balance;
        AccountStatus = accountStatus;
    }



}
