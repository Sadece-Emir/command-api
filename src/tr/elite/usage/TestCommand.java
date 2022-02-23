package tr.elite.usage;

import tr.elite.api.CommandExecutor;

import java.util.Arrays;

public class TestCommand implements CommandExecutor {
    @Override
    public void onCommand(String command, String[] args) {
        System.out.println("command: " + command + " args: " + Arrays.toString(args));
    }
}
