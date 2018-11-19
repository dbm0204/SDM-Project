public class FireAlarmOffCommand implements Command {
    private FireAlarm fireAlarm;

    public FireAlarmOffCommand(FireAlarm fireAlarm) {
        this.fireAlarm =fireAlarm;
    }

    @Override
    public void execute() {
        fireAlarm.off();

    }

}
