package lk.ijse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.util.List;

@Entity
public class Address {
    @Id
    private int addressID;
    private String no;
    private String road;
    private String city;
    @ManyToMany(mappedBy = "addresses") //inverse end
    private List<Customer> customers;

    public Address() {
    }

    public Address(int addressID, String no, String road, String city, List<Customer> customers) {
        this.addressID = addressID;
        this.no = no;
        this.road = road;
        this.city = city;
        this.customers = customers;
    }

    public int getAddressID() {
        return addressID;
    }

    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressID=" + addressID +
                ", no='" + no + '\'' +
                ", road='" + road + '\'' +
                ", city='" + city + '\'' +
                ", customers=" + customers +
                '}';
    }
}
