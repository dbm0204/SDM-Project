public class RemoteControlTest {
    public static void main(String argsp[]){
        /*
        Instantsiating Light, homeSecuritySystem, projector and remoteControl
         */
        Light light = new Light();
        HomeSecurity homeSecuritySystem = new HomeSecurity();
        FireAlarm fireAlarm = new FireAlarm();

        SimpleRemoteControl remoteControl = new SimpleRemoteControl();

        //Implementing function for Light on Command
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        remoteControl.setCommand(lightOnCommand);
        remoteControl.buttonWasPressed();

        //Implementing function for Light off Command
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        remoteControl.setCommand(lightOffCommand);
        remoteControl.buttonWasPressed();


        //Implementing function for HomeSecuritySystem Dropdown  Command
        HomeSecurityOpenDoorsCommand homeSecurityOpenDoorsCommand = new HomeSecurityOpenDoorsCommand(homeSecuritySystem);
        remoteControl.setCommand(homeSecurityOpenDoorsCommand);
        remoteControl.buttonWasPressed();

        //Implementing function for HomeSecuritySystem raise command
        HomeSecurityLockDoorsCommand homeSecurityLockDoorsCommand = new HomeSecurityLockDoorsCommand(homeSecuritySystem);
        remoteControl.setCommand(homeSecurityLockDoorsCommand);
        remoteControl.buttonWasPressed();


        //Implementing function for Home Security Call command
        HomeSecurityCallPoliceCommand homeSecurityCallPoliceCommand = new HomeSecurityCallPoliceCommand(homeSecuritySystem);
        remoteControl.setCommand(homeSecurityCallPoliceCommand);
        remoteControl.buttonWasPressed();

    }
}
