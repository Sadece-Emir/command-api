package tr.elite.api;

import java.util.HashMap;

public class Command {
    private static final HashMap<String,CommandExecutor> commands = new HashMap<>();

    public static void register(String command, CommandExecutor executor) {
        commands.put(command,executor);
    }

    public static void run(String fullText, String prefix) throws CommandNotFoundException {
        String command = fullText.substring(1).split(" ")[0];
        String[] args = fullText.split(" ").length > 1 ? fullText.substring(prefix.length()).split(command + " ")[1].split(" ") : new String[0];
        if (commands.containsKey(command)) {
            commands.get(command).onCommand(command,args);
        } else {
            throw new CommandNotFoundException("Command not found.");
        }
    }
}
