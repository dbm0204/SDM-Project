public class GarageDoor {
    private int energyConsumption=300;

    public GarageDoor() {}

    public void open(){
        System.out.println("STATUS: Openning Garage Door");
    }

    public void close(){
        System.out.println("STATUS: Closign Garage Door");
    }

    public int getEnergyConsumption() {
        return energyConsumption;
    }
}
