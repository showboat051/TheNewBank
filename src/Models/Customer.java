package Models;

public class Customer {

    private int CustID;
    private String Name;
    private double Balance;

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


    public Customer(int custID, String name, double balance) {
        CustID = custID;
        Name = name;
        Balance = balance;
    }




}
