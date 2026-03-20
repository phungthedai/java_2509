package org.example.java_core;

import java.util.Objects;

public class Account {
    int accountID;
    String email;
    String userName;
    String fullName;
    Group groupId;
    Department departmentId;
    Position positionId;
    String createDate;

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
}
