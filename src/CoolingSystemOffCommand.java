public class CoolingSystemOffCommand implements Command {
    private CoolingSystem coolingSystem;

    public CoolingSystemOffCommand(CoolingSystem coolingSystem) {
        this.coolingSystem = coolingSystem;
    }

    @Override
    public void execute() {
        coolingSystem.off();
    }

}
