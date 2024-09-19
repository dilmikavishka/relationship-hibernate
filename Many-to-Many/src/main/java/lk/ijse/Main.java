package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.entity.Address;
import lk.ijse.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Customer customer = new Customer();
        customer.setCid(1);
        customer.setName("John Doe");

        Customer customer1 = new Customer();
        customer1.setCid(2);
        customer1.setName("fghuy");

        List<Customer> customerList = new ArrayList<>();
        customerList.add(customer);
        customerList.add(customer1);

        Address address = new Address();
        address.setAddressID(1);
        address.setNo("100/1");
        address.setRoad("guhghgh");
        address.setCity("gjijsejv");

        Address address1 = new Address();
        address1.setAddressID(2);
        address1.setNo("200/1");
        address1.setRoad("guhghgh");
        address1.setCity("gjijsejv");

        List<Address> addresses = new ArrayList<>();
        addresses.add(address);
        addresses.add(address1);

        customer.setAddresses(addresses);
        customer1.setAddresses(addresses);

        address.setCustomers(customerList);
        address1.setCustomers(customerList);

        session.save(customer);
        session.save(customer1);
        session.save(address);
        session.save(address1);

        transaction.commit();
        session.close();
    }
}