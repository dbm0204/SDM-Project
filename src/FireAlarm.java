public class FireAlarm {
    private int energyConsumption=200;
    public FireAlarm() {}

    public void on(){
        System.out.println("FireAlarm is set on");
    }

    public void off(){
        System.out.println("FireAlarm is set off");
    }

    public void callFireDept(){
        System.out.println("STATUS: Calling Fire Department");
    }

    public int getEnergyConsumption() {
        return energyConsumption;
    }
}
