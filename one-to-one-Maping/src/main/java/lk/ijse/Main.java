package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.entity.Address;
import lk.ijse.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("Udara");

        Address address = new Address();
        address.setAddressID(1);
        address.setNo("100/1");
        address.setRoad("Flower Road");
        address.setCity("Panadura");
        address.setCustomer(customer);



        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.save(customer);
        session.save(address);
        transaction.commit();
        session.close();

//api fk eka dana vidiha anuwa thama inverse end ekai owners end ekai thirane wenne

    }
}