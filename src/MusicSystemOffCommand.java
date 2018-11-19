public class MusicSystemOffCommand implements Command {
    MusicSystem musicSystem;

    public MusicSystemOffCommand(MusicSystem musicSystem) {
        this.musicSystem = musicSystem;
    }

    @Override
    public void execute() {
        musicSystem.off();

    }
}
