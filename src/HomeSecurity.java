public class HomeSecurity {
    private int energyConsumption=400;

    public HomeSecurity() {}

    public void LockDoors(){
        System.out.println("STATUS: Locking Doors of the House");
    }
    public void OpenDoors(){
        System.out.println("STATUS: Unlocking Doors of the House");
    }

    public void call(){
        System.out.println("STATUS: Calling Local Law enforcement");
    }

    public int getEnergyConsumption() {
        return energyConsumption;
    }
}
