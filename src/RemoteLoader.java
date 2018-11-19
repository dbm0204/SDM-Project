public class RemoteLoader {

	public static void main(String[] args) {

		RemoteControl remoteControl = new RemoteControl();
		Light light = new Light();
		HomeSecurity homeSecuritySystem = new HomeSecurity();
		FireAlarm fireAlarm = new FireAlarm();

		//Implementing Light On Command
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand lightOffCommand = new LightOffCommand(light);


		//Implementing function for HomeSecuritySystem
		HomeSecurityOpenDoorsCommand screenDropDownCommand = new HomeSecurityOpenDoorsCommand(homeSecuritySystem);
		HomeSecurityLockDoorsCommand securityLockDoorsCommand = new HomeSecurityLockDoorsCommand(homeSecuritySystem);
		HomeSecurityCallPoliceCommand homeSecurityCallPoliceCommand = new HomeSecurityCallPoliceCommand(homeSecuritySystem);


		//Implementing function for projector on Command
		FireAlarmOnCommand fireAlarmOnCommand = new FireAlarmOnCommand(fireAlarm);
		FireAlarmOffCommand fireAlarmOffCommand = new FireAlarmOffCommand(fireAlarm);
		FireDeptCallCommand fireDeptCallCommand = new FireDeptCallCommand(fireAlarm);


	}
}
