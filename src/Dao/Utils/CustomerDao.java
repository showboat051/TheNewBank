package Dao.Utils;

import Models.Customer;

import java.util.List;

public interface CustomerDao {
    public List<Customer> getAllCustomers();
    public Customer getCustomerByID(int CustID);
    public void updateCustomer(Customer customer);
    public void deleteCustomer(Customer customer);
}

