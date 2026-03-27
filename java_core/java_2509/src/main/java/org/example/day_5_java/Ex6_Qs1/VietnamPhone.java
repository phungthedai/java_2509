package org.example.day_5_java.Ex6_Qs1;


public class VietnamPhone extends Phone {
    @Override
    public void insertContact(int number, String name) {
        contacts.add(new Contact(number, name));
    }

    @Override
    public void searchContact(String name) {
        boolean key = false;

        for (Contact contact: contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                System.out.println(contact);
                key = true;
            }
        }

        if (!key) {
            System.out.println("Không tìm thấy");
        }
    }
}
