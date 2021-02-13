package Main;

import Dao.Utils.CustomerDaoImpl;
import Models.Customer;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        Customer cust = new Customer(1, "Mr code", 50.00 , "Good Standing");
        CustomerDaoImpl CDI = new CustomerDaoImpl();

        System.out.println(CDI.getAllCustomers());



}

}
