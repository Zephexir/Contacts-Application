package christian.duvick;

import java.io.Serializable;
import java.util.ArrayList;

public class ContactList implements Serializable {
    public static ArrayList<Contact> contactList = new ArrayList<>();

    public static void setContactList(ArrayList<Contact> contactList) {
        ContactList.contactList = contactList;
    }

    public static ArrayList<Contact> getContactList() {
        return contactList;
    }

    public static void addContact(Contact contact) {
        contactList.add(contact);
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();

        for (Contact contact: contactList) {
            string.append(contact.toString());
            string.append('\n');
        }

        return string.toString();
    }
}
