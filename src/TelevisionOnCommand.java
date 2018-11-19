public class TelevisionOnCommand implements  Command {
    private Television television;

    public TelevisionOnCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.on();

    }
}
