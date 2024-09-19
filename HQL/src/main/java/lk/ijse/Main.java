package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

       /* Customer customer = new Customer();
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

       /*Query query = session.createQuery("from Customer"); //select all from ekak
       List<Customer> customerList = query.list();
       for (Customer customer : customerList){
           System.out.println(customer.getCid());
       }*/

       /* Query query = session.createQuery("from Customer where cid = ?1");//id eken ganne unique data ekak
        query.setParameter(1, "1");//parameter eka set karanawa
        Customer customer = (Customer) query.uniqueResult();
        System.out.println(customer.getCid());*/

        Query query = session.createQuery("select cid,name from Customer where name=?1");//load only one column
        Customer customer = (Customer) query.uniqueResult();
        System.out.println(customer.getName());


        transaction.commit();
        session.close();
    }
}

