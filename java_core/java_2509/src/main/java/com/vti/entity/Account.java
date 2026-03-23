package com.vti.entity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Account {
    private int accountID;
    private String email;
    private String userName;
    private String firstName;
    private String lastName;
    private String fullName;
    private Group groupId;
    private Department departmentId;
    private Position positionId;
    private String createDate;

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public void setPositionId(Position positionId) {
        this.positionId = positionId;
    }

    public void setDepartmentId(Department departmentId) {
        this.departmentId = departmentId;
    }

    public void setGroupId(Group groupId) {
        this.groupId = groupId;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public int getAccountID() {
        return accountID;
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public Group getGroupId() {
        return groupId;
    }

    public Department getDepartmentId() {
        return departmentId;
    }

    public Position getPositionId() {
        return positionId;
    }

    public String getCreateDate() {
        return createDate;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountID=" + accountID +
                ", email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", groupId=" + groupId +
                ", departmentId=" + departmentId +
                ", positionId=" + positionId +
                ", createDate='" + createDate + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return accountID == account.accountID && Objects.equals(fullName, account.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountID, email, userName, fullName, groupId, departmentId, positionId, createDate);
    }

//    Không có parameters

    public Account() {
    }

    //    Có các parameter là id, Email, Username, FirstName, LastName (với FullName = FirstName + LastName)
    public Account(int accountID, String email, String userName, String firstName, String lastName) {
        this.accountID = accountID;
        this.email = email;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + lastName;
    }

//    Có các parameter là id, Email, Username, FirstName, LastName (với FullName = FirstName + LastName) và Position của User, default createDate = now

    public Account(int accountID, String email, String userName, String firstName, String lastName, Position positionId) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        this.accountID = accountID;
        this.email = email;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.positionId = positionId;
        this.fullName = firstName + lastName;
        this.createDate = simpleDateFormat.format(new Date());
    }

//    Có các parameter là id, Email, Username, FirstName, LastName (với FullName = FirstName + LastName) và Position của User, createDate.

    public Account(int accountID, String email, String userName, String firstName, String lastName, Position positionId, String createDate) {
        this.accountID = accountID;
        this.email = email;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + lastName;
        this.positionId = positionId;
        this.createDate = createDate;
    }
}
