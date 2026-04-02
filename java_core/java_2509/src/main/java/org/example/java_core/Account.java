package org.example.java_core;

import org.example.day_7_java.Ex_2.InvalidAgeInputingException;
import org.example.day_7_java.Ex_2.ScannerUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;


public class Account {
    int accountID;
    String email;
    String userName;
    int age;
    String firstName;
    String lastName;
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

    public int inputAccountAge() {
        ScannerUtils scannerUtils = new ScannerUtils();
        while (true) {
            try {
                int newAge = scannerUtils.inputAge();
                if (newAge < 18) {
                    System.out.println("Your age must be greater than 18");
                } else {
                    return newAge;
                }
            } catch (InvalidAgeInputingException e) {
                System.out.println(e.getMessage());
            }
        }
    }


//    public void inputAge() throws InvalidAgeInputingException {
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            try {
//                System.out.print("Nhập age: ");
//                int value = scanner.nextInt();
//                scanner.nextLine();
//                if (value <= 0) {
//                    throw new InvalidAgeInputingException("The age must be greater than 0");
//                } else {
//                    this.age = value;
//                    break;
//                }
//            } catch (InputMismatchException e) {
//                System.out.println(e.getMessage());
//            }
//        }
//    }

//    public static void inputAge() throws InvalidAgeInputingException {
//        Scanner scanner = new Scanner(System.in);
//        int value = scanner.nextInt();
//        if (value <= 0) {
//            throw new InvalidAgeInputingException("The age must be greater than 0");
//        } else {
//            this.age = value;
//        }
//        while (true) {
//            try {
//                System.out.print("Nhập age: ");
//                int value = scanner.nextInt();
//                scanner.nextLine();
//                if (value > 0) {
//
//                    System.out.println(value);
//                    break;
//                }
//            } catch (InputMismatchException e) {
//                System.out.println(e.getMessage());
//            }
//        }
//    }


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
        this.age = inputAccountAge();
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
