public class CoolingSystem {
    private int temperature;

    public CoolingSystem(int temperature) {
        this.temperature = temperature;
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
