package com.vti.entity;

import java.util.Arrays;
import java.util.Objects;

public class GroupAccount {
    private Group groupId;
    private Account[] accountId;
    private String joinDate;

    public Group getGroupId() {
        return groupId;
    }

    public void setGroupId(Group groupId) {
        this.groupId = groupId;
    }

    public Account[] getAccountId() {
        return accountId;
    }

    public void setAccountId(Account[] accountId) {
        this.accountId = accountId;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        GroupAccount that = (GroupAccount) o;
        return Objects.equals(groupId, that.groupId)
                && Objects.deepEquals(accountId, that.accountId)
                && Objects.equals(joinDate, that.joinDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, Arrays.hashCode(accountId), joinDate);
    }



}
