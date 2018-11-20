import java.util.List;

public class Light {
    private int energyConsumption=500;

    public Light() {}

    public void on(){
        System.out.println("Light has been turned on:(Full Lighting Model)");
    }
    public void off(){
        System.out.println("Light has been switched off");
    }

    public int getEnergyConsumption() {
        return energyConsumption;
    }
}
