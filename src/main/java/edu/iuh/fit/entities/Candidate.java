package edu.iuh.fit.entities;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.UUID;

@Entity
public class Candidate {

    @Id
    private UUID id;
    private java.sql.Date dob;
    private String email;
    private String full_name;
    private String phone;

    @ManyToOne
    @JoinColumn(name = "address")
    private Address address;

    // getters and setters
    public Candidate() {
    }

    public Candidate(UUID id, Date dob, String email, String full_name, String phone, Address address) {
        this.id = id;
        this.dob = dob;
        this.email = email;
        this.full_name = full_name;
        this.phone = phone;
        this.address = address;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "id=" + id +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                ", full_name='" + full_name + '\'' +
                ", phone='" + phone + '\'' +
                ", address=" + address +
                '}';
    }
}
