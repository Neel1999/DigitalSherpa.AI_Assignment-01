package com.groupc.postAndGetAPI.Models;

import javax.persistence.*;

@Entity
@Table(name = "kyc_details")
public class kycDetails {

    @Id
    private long userId;

    @Column(name = "account_name", nullable = false)
    private String accountname;

    @Column(name = "account_number", nullable = false)
    private String accountnumber;

    @Column(name = "account_type", nullable = false)
    private String accounttype;

    @Column(name = "IFSC_code", nullable = false)
    private String ifsccode;


    @Column(name = "bank_name", nullable = false)
    private String bankname;

    
    //Setters And Getters
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public String getAccounttype() {
        return accounttype;
    }

    public void setAccounttype(String accounttype) {
        this.accounttype = accounttype;
    }

    public String getIfsccode() {
        return ifsccode;
    }

    public void setIfsccode(String ifsccode) {
        this.ifsccode = ifsccode;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    @Override
    public String toString() {
        return "kycDetails [IFSCcode=" + ifsccode + ", accountname=" + accountname + ", accountnumber=" + accountnumber
                + ", accounttype=" + accounttype + ", bankname=" + bankname + ", userId=" + userId + "]";
    }
    

}