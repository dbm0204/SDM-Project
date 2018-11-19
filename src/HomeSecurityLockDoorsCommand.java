public class HomeSecurityLockDoorsCommand implements Command {
    private HomeSecurity homeSecurity;

    public HomeSecurityLockDoorsCommand(HomeSecurity homeSecurity) {
        this.homeSecurity = homeSecurity;
    }

    @Override
    public void execute() {
        homeSecurity.OpenDoors();

    }
}
