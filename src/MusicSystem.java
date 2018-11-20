public class MusicSystem {
    private String Titlename;
    private int energyConsumption=700;

    public MusicSystem(String titlename) {
        Titlename = titlename;
    }

    public String getTitlename() {
        return Titlename;
    }

    public void setTitlename(String titlename) {
        Titlename = titlename;
    }

    public void on(){
        System.out.println("STATUS: MUSIC SYSTEM has been switched on");
    }

    public void off(){
        System.out.println("STATUS: MUSIC SYSTEM has been switched off");
    }

    public int getEnergyConsumption() {
        return energyConsumption;
    }
}
