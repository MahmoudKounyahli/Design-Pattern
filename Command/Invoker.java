package Command;

public class Invoker {
    private Command sayHelloCommand;

    public void setSayHelloCommand(Command command) {
        this.sayHelloCommand = command;
    }

    public void executeSayHelloCommand() {
        this.sayHelloCommand.execute();
    }

}
