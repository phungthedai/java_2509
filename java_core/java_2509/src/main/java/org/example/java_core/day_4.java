package org.example.java_core;

public class day_4 {
    static void main(String[] args) {
        Department department = new Department();
        Department department1 = new Department("dev");

        Position position = new Position();

        Account account = new Account();
        Account account1 = new Account(1, "ac11@q123", "123213", "abc", "xyz");
        Account account2 = new Account(2, "acc2@q123", "acc2", "acc2", "xyz", position);
        Account account3 = new Account(3, "acc3@q123", "acc3", "acc3", "xyz", position, "22-10-2020");


        Group group = new Group();
        Group group1 = new Group("gr1", account1, new Account[] {account1, account2, account3}, "22-11-2022");
        Group group2 = new Group("gr2", account1, new String[] {"acc1", "acc2", "acc3"}, "22-11-2026");
    }
}
