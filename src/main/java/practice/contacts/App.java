package practice.contacts;

import practice.contacts.User.AppUser;
import practice.contacts.contactList.Contact;
import practice.contacts.contactList.ContactList;
import practice.contacts.identifiers.HumanName;
import practice.contacts.identifiers.PhoneNumber;
import practice.contacts.mainMenu.MainMenu;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        PrintStream out = System.out;
        Scanner input = new Scanner(System.in);

        HumanName name = new HumanName("Haris", "Malisevic");
        PhoneNumber number = new PhoneNumber("+387", "061 274 123");

        AppUser currentUser = new AppUser(name, number);

        ContactList currentContactList = new ContactList(currentUser);

        MainMenu mainMenu = new MainMenu();

        Contact haris = new Contact(name, number);

        int mainUserInput = 0;

        // Main loop
        do {
            mainMenu.printMainMenu();

            mainUserInput = input.nextInt();

            mainMenu.runMenuOption(mainUserInput);


        } while (mainUserInput != 1);

        //System.out.println("Hello select your account: ");


        haris.printContactInformation();


    }
}
