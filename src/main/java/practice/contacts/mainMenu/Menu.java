package practice.contacts.mainMenu;

import practice.contacts.options.FunctionOfOption;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Menu {

    private String mainMessage;
    private List<MenuOption> menuOptionList;

    int numberOfOptions = 0;
    public Menu() {
        this.mainMessage = "Hello user!";
        this.menuOptionList = new ArrayList<>();
        this.numberOfOptions = 0;
    }
    public Menu(String mainMessage) {
        this.mainMessage = mainMessage;

        this.menuOptionList = new ArrayList<>();
        this.numberOfOptions = 0;
    }
    public void addOptionToMenu(MenuOption newOption, FunctionOfOption newFunctionOfOption) {
        this.menuOptionList.add(newOption);

        int indexOfLatestOption = numberOfOptions++;
        this.menuOptionList.get(indexOfLatestOption).setFunctionOfOption(newFunctionOfOption);
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
