package tr.elite.api;

public class CommandNotFoundException extends Exception {
    public CommandNotFoundException() {
        super();
    }

    public CommandNotFoundException(String errorMessage) {
        super(errorMessage);
    }

    public CommandNotFoundException(Throwable error) {
        super(error);
    }

    public CommandNotFoundException(String errorMessage, Throwable error) {
        super(errorMessage,error);
    }
}
