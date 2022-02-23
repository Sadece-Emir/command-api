package tr.elite.api;

public interface CommandExecutor {
    void onCommand(String command, String[] args);
}
