package com.groupc.postAndGetAPI.Models;

import javax.persistence.*;


@Entity
@Table(name = "bank_details")
public class bankDetails {

    @Id
    private long userId;

    @Column(name = "father_name" , nullable = false)
    private String fathername;

    @Column(name = "address" , nullable = false)
    private String address;

    @Column(name = "pancard_number" , nullable = false)
    private String pancard;

    @Column(name = "adharcard_number" , nullable = false)
    private String adharcard;




    //Setters And Getters
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getFathername() {
        return fathername;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPancard() {
        return pancard;
    }

    public void setPancard(String pancard) {
        this.pancard = pancard;
    }

    public String getAdharcard() {
        return adharcard;
    }

    public void setAdharcard(String adharcard) {
        this.adharcard = adharcard;
    }

    @Override
    public String toString() {
        return "bankDetails [address=" + address + ", adharcard=" + adharcard + ", fathername=" + fathername
                + ", pancard=" + pancard + ", userId=" + userId + "]";
    }
    


    
    
}