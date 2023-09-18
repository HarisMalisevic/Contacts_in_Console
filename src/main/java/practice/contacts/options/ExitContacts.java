package practice.contacts.options;

import java.io.PrintStream;

public class ExitContacts implements FunctionOfOption {


    @Override
    public void runOption() {
        PrintStream out = System.out;
        out.println("Thank you. Good bye!");
        System.exit(0);
    }

    public void runOption(String customExitMessage) {
        customExitMessage(customExitMessage);
    }

    private void customExitMessage(String customExitMessage) {
        PrintStream out = System.out;
        out.println(customExitMessage);
        System.exit(0);
    }


}
