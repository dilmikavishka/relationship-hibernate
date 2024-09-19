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
/*
        Customer customer = new Customer();
        Address address = new Address();
        address.setAddressID(1);
        address.setNo("100/1");
        address.setRoad("Elpitiya road");
        address.setCity("Panadura");

        Address address2 = new Address();
        address2.setAddressID(2);
        address2.setNo("200/1");
        address2.setRoad("Elpitiya road");
        address2.setCity("Panadura");

        List<Address> addresses = new ArrayList<>();
        addresses.add(address);
        addresses.add(address2);

        customer.setCid(1);
        customer.setName("Kity");
        customer.setAddresses(addresses);

        address.setCustomer(customer);
        address2.setCustomer(customer);

        session.save(customer);
        session.save(address);
        session.save(address2);*/

        Customer customer = session.get(Customer.class, 1);
        System.out.println(customer.getCid());//query ekak wadinne naththe mul query eken okkomawadina nisa meken enne kelinma object eka
        System.out.println(customer.getAddresses());

        transaction.commit();
        session.close();
    }
}