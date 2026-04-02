package org.example.java_core;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

import org.example.day_7_java.Ex_2.ScannerUtils;

public class Group {
    int groupId;
    String groupName;
    Account creatorId;
    ArrayList<Account>  accounts;
    String createDate;

    ScannerUtils scannerUtils = new ScannerUtils();
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
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

        System.out.println("Nhập tên Group: ");
        this.groupName = scannerUtils.inputString();

        while (true) {
            System.out.println("Bạn có muốn thêm accounts hay không (yes/no): ");
            String key = scanner.nextLine();
            if (key.equalsIgnoreCase("yes")) {
                Account newAccount = new Account();
                newAccount.fullName = scannerUtils.inputString();
//                newAccount.inputAccountAge();
                this.accounts.add(newAccount);
            } else if (key.equalsIgnoreCase("no")) {
                break;
            }
        }

    }

//    Có các parameter là GroupName, Creator, array Account[] accounts, CreateDate

    public Group(String groupName, Account creatorId, ArrayList<Account> accounts, String createDate) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        this.groupName = groupName;
        this.creatorId = creatorId;
        this.accounts = accounts;
        this.createDate = simpleDateFormat.format(createDate);
    }




//    Có các parameter là GroupName, Creator, array String[] usernames , CreateDate
//    Với mỗi username thì sẽ khởi tạo 1 Account (chỉ có thông tin username, các thông tin còn lại = null).

    public Group(String groupName, Account creatorId, String[] stringUserName, String createDate) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        this.groupName = groupName;
        this.creatorId = creatorId;
        this.createDate = simpleDateFormat.format(createDate);;
        ArrayList<Account> listAccount = new ArrayList<>();
        for (int i = 0; i < stringUserName.length; i++) {
            listAccount.add(new Account(i, null,  stringUserName[i], null, null));
        }
        this.accounts = listAccount;
    }
}
