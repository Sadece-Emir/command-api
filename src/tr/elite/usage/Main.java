package tr.elite.usage;

import tr.elite.api.Command;
import tr.elite.api.CommandNotFoundException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Command.register("test",new TestCommand()); // IMP.

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        if (text.startsWith("/")) {
            //#region IMPORTANT
            try {
                Command.run(text,"/");
            } catch (CommandNotFoundException e) {
                e.printStackTrace();
            }
            //#endregion
        }
    }
}
