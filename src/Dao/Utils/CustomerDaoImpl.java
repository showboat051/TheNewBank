package Dao.Utils;

import Models.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDaoImpl implements CustomerDao {
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet set = null;

    //THis list is the database
//    List<Customer> customers;

//    public CustomerDaoImpl() {
//        customers = new ArrayList<Customer>();
//        Customer cust1 = new Customer(1,"Robert", 0.00 , "Good Standing");
//        Customer cust2 = new Customer(2,"Rob", 0.00, "Good Standing" );
//        customers.add(cust1);
//        customers.add(cust2);
//    }

    @Override
    public List<Customer> getAllCustomers() {
        ArrayList<Customer> Customers = new ArrayList<>();

            String sql = "select * from customers";
            try {
                conn = DBconnections.getConnection();
                stmt = conn.prepareStatement(sql);
                set = stmt.executeQuery();
                while(set.next() ) {
                    Customers.add( new Customer(
                            set.getInt("CustID"),
                            set.getString("Name"),
                            set.getDouble("Balance"),
                            set.getString("AccountStatus")
                    ));
                } // end of while loop
            System.out.println("Successful connection");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        return Customers;
    }

    @Override
    public Customer getCustomerByID(int CustID) {
        return null;
    }

    @Override
    public void updateCustomer(Customer customer) {

    }

    @Override
    public void deleteCustomer(Customer customer) {

    }
}
