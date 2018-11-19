public class FireAlarmOnCommand implements Command{
    private FireAlarm fireAlarm;

    public FireAlarmOnCommand(FireAlarm fireAlarm) {
        this.fireAlarm = fireAlarm;
    }

    @Override
    public void execute() {
        fireAlarm.on();
    }
}
