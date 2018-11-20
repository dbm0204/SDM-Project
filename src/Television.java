public class Television {
    private int energyConsumption=800;

    public Television() {}

    public void on(){
        System.out.println("STATUS: TV on");
    }
    public void off(){
        System.out.println("STATUS TV off");
    }

    public int getEnergyConsumption() {
        return energyConsumption;
    }
}
