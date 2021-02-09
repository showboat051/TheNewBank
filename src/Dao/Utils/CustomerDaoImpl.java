package Dao.Utils;

import Models.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerDaoImpl implements CustomerDao {

    //THis list is the database
    List<Customer> customers;

    public CustomerDaoImpl() {
        customers = new ArrayList<Customer>();
        Customer cust1 = new Customer(1,"Robert", 0.00 );
        Customer cust2 = new Customer(2,"Rob", 0.00 );
        customers.add(cust1);
        customers.add(cust2);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return null;
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
