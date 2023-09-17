package practice.contacts.mainMenu;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Menu {

    private String mainMessage;
    private List<MenuOption> menuOptionList;


    public Menu() {
        this.mainMessage = "Hello user!";
        this.menuOptionList = new ArrayList<>();
    }

    public Menu(String mainMessage) {
        this.mainMessage = mainMessage;

        this.menuOptionList = new ArrayList<>();
    }

    public void addOptionToMenu(MenuOption newOption){
        this.menuOptionList.add(newOption);
    }

    public String getMainMessage() {
        return mainMessage;
    }

    public void setMainMessage(String mainMessage) {
        this.mainMessage = mainMessage;
    }

    public List<MenuOption> getMenuOptionList() {
        return menuOptionList;
    }

    public void setMenuOptionList(List<MenuOption> menuOptionList) {
        this.menuOptionList = menuOptionList;
}
}
