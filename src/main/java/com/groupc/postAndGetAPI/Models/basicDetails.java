package com.groupc.postAndGetAPI.Models;

import javax.persistence.*;

@Entity
@Table(name = "basic_details")
public class basicDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;

    @Column(name = "name" , nullable = false)
    private String name;

    @Column(name = "phone_number" , nullable = false)
    private String phonenumber;

    @Column(name = "email" , nullable = false, unique = true)
    private String email;


    

    //Setters And Getters
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "basicDetails [email=" + email + ", name=" + name + ", phonenumber=" + phonenumber + ", userId=" + userId
                + "]";
    }

    
    
 

}
