package com.practo.user.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "u_user")
public class User extends PanacheEntity {
    @Column(name = "emp_username")
    String empUserName;
    @Column(name = "email_id")
    String emailId;
    @Column(name = "mobile_no")
    Integer mobileNumber;
    @Column(name = "password")
    String password;

    public String getEmpUserName() {
        return empUserName.toLowerCase();
    }

    public void setEmpUserName(String empUserName) {
        this.empUserName = empUserName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Integer getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Integer mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
