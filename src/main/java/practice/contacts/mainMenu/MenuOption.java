package practice.contacts.mainMenu;

import practice.contacts.options.FunctionOfOption;

public class MenuOption {
    private String optionMessage;

    private FunctionOfOption functionOfOption;

    public void setFunctionOfOption(FunctionOfOption newFunctionOfOption){
        this.functionOfOption = newFunctionOfOption;
    }

    public MenuOption(String optionMessage) {
        this.optionMessage = optionMessage;
    }

    public String getOptionMessage() {
        return optionMessage;
    }

    public void setOptionMessage(String optionMessage) {
        this.optionMessage = optionMessage;
    }

    public void runMenuOption(){
        functionOfOption.runOption();
    }
}
