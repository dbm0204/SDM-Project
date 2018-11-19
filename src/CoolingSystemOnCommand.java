public class CoolingSystemOnCommand implements Command {
    private CoolingSystem coolingSystem;

    public CoolingSystemOnCommand(CoolingSystem coolingSystem) {
        this.coolingSystem = coolingSystem;
    }

    @Override
    public void execute() {
        coolingSystem.On();


    }
}
