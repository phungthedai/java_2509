package org.example.day_5_java.Ex6_Qs1;

import java.util.ArrayList;

public abstract class Phone {
    public ArrayList<Contact> contacts;

    public abstract void insertContact(int number, String name);
    public abstract void searchContact(String name);
}
