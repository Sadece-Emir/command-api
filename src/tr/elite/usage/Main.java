package tr.elite.usage;

import tr.elite.api.Command;
import tr.elite.api.CommandNotFoundException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Command.register("test",new TestCommand()); // IMP.
        String prefix = "/";

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        if (text.startsWith(prefix)) {
            //#region IMPORTANT
            try {
                Command.run(text,prefix);
            } catch (CommandNotFoundException e) {
                e.printStackTrace();
            }
            //#endregion
        }
    }
}
