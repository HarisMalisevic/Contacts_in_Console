package practice.contacts.mainMenu;

import practice.contacts.mainMenu.MenuOption;
import practice.contacts.mainMenu.Menu;
import practice.contacts.options.AddContact;
import practice.contacts.options.ExitContacts;
import practice.contacts.options.ReadContacts;
import practice.contacts.options.RemoveContact;


import java.util.ArrayList;
import java.util.List;
import java.io.PrintStream;

public class MainMenu {


    Menu mainMenu;

    public MainMenu() {
        this.mainMenu = new Menu("Choose option: ");
        setDefaultMenuOptions();
    }


    private void setDefaultMenuOptions() {

        this.mainMenu.getMenuOptionList().clear();

        this.mainMenu.addOptionToMenu(new MenuOption("Exit"), new ExitContacts());
        this.mainMenu.addOptionToMenu(new MenuOption("Add Contact"),new AddContact());
        this.mainMenu.addOptionToMenu(new MenuOption("Read Contact List"), new ReadContacts());
        this.mainMenu.addOptionToMenu(new MenuOption("Remove Contact"), new RemoveContact());
    }

    public void printMainMenu() {

        PrintStream out = System.out;
        out.println(mainMenu.getMainMessage());

        int optionCounter = 0;
        for (MenuOption menuOption : mainMenu.getMenuOptionList()) {
            out.println(optionCounter + ". " + menuOption.getOptionMessage());
            optionCounter++;
        }
    }

    public List<MenuOption> getMainMenuOptionList(){
        return this.mainMenu.getMenuOptionList();
    }

    public void runMenuOption(int userInput) {


        if (userInput<0 || userInput>= mainMenu.numberOfOptions) {
            System.out.println("Option does not exist!");
            return;
        }

        this.mainMenu.runOption(userInput);
    }

}
