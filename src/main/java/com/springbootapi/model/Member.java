package com.springbootapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Member")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long Id;

    @Column(name = "LegalName")
    private String LegalName;

    @Column(name = "FirstName")
    private String FirstName;

    @Column(name = "LastName")
    private String LastName;

    @Column(name = "AccountType")
    private String AccountType;

    public Member() {

    }

    public Member(String LegalName, String FirstName, String LastName, String AccountType) {
        this.LegalName = LegalName;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.AccountType = AccountType;
    }

    @Override
    public String toString() {
        return "Member [Id=" + Id + ", LegalName=" + LegalName + ", FirstName=" + FirstName + ", LastName=" + LastName
                + "]";
    }

    public long getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(long Id) {
        this.Id = Id;
    }

    /**
     * @return String return the LegalName
     */
    public String getLegalName() {
        return LegalName;
    }

    /**
     * @param LegalName the LegalName to set
     */
    public void setLegalName(String LegalName) {
        this.LegalName = LegalName;
    }

    /**
     * @return String return the FirstName
     */
    public String getFirstName() {
        return FirstName;
    }

    /**
     * @param FirstName the FirstName to set
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * @return String return the LastName
     */
    public String getLastName() {
        return LastName;
    }

    /**
     * @param LastName the LastName to set
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     * @return String return the AccountType
     */
    public String getAccountType() {
        return AccountType;
    }

    /**
     * @param AccountType the AccountType to set
     */
    public void setAccountType(String AccountType) {
        this.AccountType = AccountType;
    }
}