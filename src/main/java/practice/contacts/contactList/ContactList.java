package practice.contacts.contactList;

import practice.contacts.User.AppUser;
import practice.contacts.identifiers.PhoneNumber;

import java.util.ArrayList;
import java.util.List;

public class ContactList {

    private List<Contact> contactList;

    public ContactList() {
        this.contactList = new ArrayList<Contact>();
    }
    public ContactList(AppUser user) {
        this.contactList = new ArrayList<Contact>();
    }

    public void addContact(Contact newContact) {
        this.contactList.add(newContact);
    }

    public void removeContact(Contact newContact) {

        if (this.contactList.remove(newContact)) {
            System.out.println("Contact deleted!");
        } else
            throw new IllegalArgumentException("Contact not found in list!");
    }

}



