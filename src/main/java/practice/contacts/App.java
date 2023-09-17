package practice.contacts;

import practice.contacts.User.AppUser;
import practice.contacts.identifiers.HumanName;
import practice.contacts.identifiers.PhoneNumber;

public class App {
    public static void main(String[] args) {


        AppUser currentUser;
        MainMenu mainMenu = new MainMenu();

        //System.out.println("Hello select your account: ");

        mainMenu.printMainMenu();

        HumanName name = new HumanName("Haris", "Malisevic");
        PhoneNumber number = new PhoneNumber("+387","61 274 123");

        Contact haris = new Contact(name, number);

        haris.printContactInformation();


    }
}
