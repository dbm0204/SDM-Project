public class MusicSystemOnCommand implements Command {
    MusicSystem musicSystem;

    public MusicSystemOnCommand(MusicSystem musicSystem) {
        this.musicSystem = musicSystem;
    }


    @Override
    public void execute() {
        musicSystem.on();
    }
}
