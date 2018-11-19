public class FireDeptCallCommand implements Command{
    private FireAlarm fireAlarm;

    public FireDeptCallCommand(FireAlarm fireAlarm) {
        this.fireAlarm = fireAlarm;
    }

    @Override
    public void execute() {
        fireAlarm.callFireDept();
    }
}
