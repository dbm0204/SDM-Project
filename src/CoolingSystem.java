public class CoolingSystem {
    private int temperature;
    private int energyConsumption=100;

    public CoolingSystem() {}

    public CoolingSystem(int temperature, int energyConsumption) {
        this.temperature = temperature;
        this.energyConsumption = energyConsumption;

    }

    public int getEnergyConsumption() {
        return energyConsumption;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("STATUS: Cooling System Temperature set to:"+temperature);
    }

    public void On(){
        System.out.println("STATUS: Cooling System is on");
    }
    public void off(){
        System.out.println("STATUS: Cooling System is off");

    }
}
