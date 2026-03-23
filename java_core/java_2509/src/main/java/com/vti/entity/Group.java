package com.vti.entity;

import java.util.Objects;

public class Group {
    private int groupId;
    private String groupName;
    private Account creatorId;
    private Account[] accounts;
    private String createDate;

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Account getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Account creatorId) {
        this.creatorId = creatorId;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return groupId == group.groupId
                && Objects.equals(groupName, group.groupName)
                && Objects.equals(creatorId, group.creatorId)
                && Objects.equals(createDate, group.createDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, groupName, creatorId, createDate);
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupId=" + groupId +
                ", groupName='" + groupName + '\'' +
                ", creatorId=" + creatorId +
                ", createDate='" + createDate + '\'' +
                '}';
    }


//    Không có parameters
    public Group() {
    }

//    Có các parameter là GroupName, Creator, array Account[] accounts, CreateDate

    public Group(String groupName, Account creatorId, Account[] accounts, String createDate) {
        this.groupName = groupName;
        this.creatorId = creatorId;
        this.accounts = accounts;
        this.createDate = createDate;
    }

//    Có các parameter là GroupName, Creator, array String[] usernames , CreateDate
//    Với mỗi username thì sẽ khởi tạo 1 Account (chỉ có thông tin username, các thông tin còn lại = null).

    public Group(String groupName, Account creatorId, String[] stringUserName, String createDate) {
        this.groupName = groupName;
        this.creatorId = creatorId;
        this.createDate = createDate;

        this.accounts = new Account[stringUserName.length];
        for (int i = 0; i < stringUserName.length; i++) {
            this.accounts[i] = new Account(i, null,  stringUserName[i], null, null);
        }
    }
}
