package practice.contacts;

import practice.contacts.mainMenu.MenuOption;
import practice.contacts.mainMenu.Menu;


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

        this.mainMenu.addOptionToMenu(new MenuOption("Add Contact"));
        this.mainMenu.addOptionToMenu(new MenuOption("Read Contact List"));
        this.mainMenu.addOptionToMenu(new MenuOption("Remove Contact"));
    }

    public void printMainMenu() {

        PrintStream out = System.out;
        out.println(mainMenu.getMainMessage());

        int optionCounter = 0;
        for (MenuOption menuOption : mainMenu.getMenuOptionList()) {
            optionCounter++;
            out.println(optionCounter + ". " + menuOption.getOptionMessage());
        }
    }

}
