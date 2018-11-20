public class EnergyConsumption implements Command {
    private CoolingSystem coolingSystem;
    private FireAlarm fireAlarm;
    private GarageDoor garageDoor;
    private HomeSecurity homeSecurity;
    private Light light;
    private MusicSystem musicSystem;
    private Television television;

    public EnergyConsumption(CoolingSystem coolingSystem,
                             FireAlarm fireAlarm,
                             GarageDoor garageDoor,
                             HomeSecurity homeSecurity,
                             Light light,
                             MusicSystem musicSystem,
                             Television television)
    {
        this.coolingSystem = coolingSystem;
        this.fireAlarm = fireAlarm;
        this.garageDoor = garageDoor;
        this.homeSecurity = homeSecurity;
        this.light = light;
        this.musicSystem = musicSystem;
        this.television = television;
    }

    @Override
    public void execute() {
        int comsumption =   coolingSystem.getEnergyConsumption()+fireAlarm.getEnergyConsumption()+
                            garageDoor.getEnergyConsumption()+homeSecurity.getEnergyConsumption()+
                            light.getEnergyConsumption()+musicSystem.getEnergyConsumption()+
                            television.getEnergyConsumption();
        System.out.println("Total energy consumption used by all applicances:"+comsumption);
    }
}
