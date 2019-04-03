package com.fzu.bean;

public class account {

    private Integer id;


    private String accountNumber;


    private String loginPassword;


    private Integer landingType;


    private Integer userId;


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getAccountNumber() {
        return accountNumber;
    }


    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber == null ? null : accountNumber.trim();
    }


    public String getLoginPassword() {
        return loginPassword;
    }


    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword == null ? null : loginPassword.trim();
    }


    public Integer getLandingType() {
        return landingType;
    }


    public void setLandingType(Integer landingType) {
        this.landingType = landingType;
    }


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public account(Integer id, String accountNumber, String loginPassword, Integer landingType, Integer userId) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.loginPassword = loginPassword;
        this.landingType = landingType;
        this.userId = userId;
    }

    public account() {
    }

    @Override
    public String toString() {
        return "account{" +
                "id=" + id +
                ", accountNumber='" + accountNumber + '\'' +
                ", loginPassword='" + loginPassword + '\'' +
                ", landingType=" + landingType +
                ", userId=" + userId +
                '}';
    }
}