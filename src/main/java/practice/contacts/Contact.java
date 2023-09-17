package practice.contacts;


import practice.contacts.identifiers.HumanName;
import practice.contacts.identifiers.PhoneNumber;

import java.io.PrintStream;

public class Contact {

    HumanName contactName;
    PhoneNumber phoneNumber;

    public Contact(HumanName name, PhoneNumber phoneNumber) {
        this.contactName = name;
        this.phoneNumber = phoneNumber;
    }

    public HumanName getName() {
        return contactName;
    }

    public void setName(HumanName name) {
        contactName = name;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public void printContactInformation() {

        PrintStream out = System.out;

        out.println(contactName.getHumanName() + " " + phoneNumber.getPhoneNumber());


    }
}
