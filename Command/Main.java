package Command;

public class Main {
    public static void main(String[] args) {
        final var receiver = new Receiver();
        final var sayHelloMsgCommand = new SendMsgCommand(receiver, "Hello!");
        final var invoker = new Invoker();

        invoker.setSayHelloCommand(sayHelloMsgCommand);
        invoker.executeSayHelloCommand();
    }
}
