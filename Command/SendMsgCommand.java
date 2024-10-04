package Command;

public class SendMsgCommand implements Command {
    private final String message;
    private final Receiver receiver;

    public SendMsgCommand(Receiver receiver, String message) {
        this.message = message;
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        receiver.showMessage(message);
    }
}
