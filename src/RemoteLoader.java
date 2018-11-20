import java.util.Map;

public class RemoteLoader {

	public static void main(String[] args) {

		RemoteControl remoteControl = new RemoteControl();
		Light light = new Light();
		HomeSecurity homeSecuritySystem = new HomeSecurity();
		FireAlarm fireAlarm = new FireAlarm();
		CoolingSystem coolingSystem= new CoolingSystem();
		GarageDoor garageDoor = new GarageDoor();
		MusicSystem musicSystem = new MusicSystem("Justin Biber");
		Television television = new Television();

		//Implementing Light On Command
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand lightOffCommand = new LightOffCommand(light);

		//Implementing function for HomeSecuritySystem
		HomeSecurityOpenDoorsCommand homeSecurityOpenDoorsCommand = new HomeSecurityOpenDoorsCommand(homeSecuritySystem);
		HomeSecurityLockDoorsCommand homeSecurityLockDoorsCommand = new HomeSecurityLockDoorsCommand(homeSecuritySystem);
		HomeSecurityCallPoliceCommand homeSecurityCallPoliceCommand = new HomeSecurityCallPoliceCommand(homeSecuritySystem);

		//Implementing function for FireAlarm on Command
		FireAlarmOnCommand fireAlarmOnCommand = new FireAlarmOnCommand(fireAlarm);
		FireAlarmOffCommand fireAlarmOffCommand = new FireAlarmOffCommand(fireAlarm);
		FireDeptCallCommand fireDeptCallCommand = new FireDeptCallCommand(fireAlarm);

		//Implementing function for Cooling System
		CoolingSystemOnCommand coolingSystemOnCommand = new CoolingSystemOnCommand(coolingSystem);
		CoolingSystemOffCommand coolingSystemOffCommand = new CoolingSystemOffCommand(coolingSystem);

		//Implementing function for Garage Door System
		GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
		GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);

		//Implementing function for Music System
		MusicSystemOffCommand musicSystemOffCommand = new MusicSystemOffCommand(musicSystem);
		MusicSystemOnCommand musicSystemOnCommand = new MusicSystemOnCommand(musicSystem);

		//Implementing functionality for Television
		TelevisionOnCommand televisionOnCommand = new TelevisionOnCommand(television);
		TelevisionOffCommand televisionOffCommand = new TelevisionOffCommand(television);

        /**
         * Fire drill Macro: Procedures to
         * take in case of a fire.
         */
		Command [] firedrill = {televisionOffCommand, musicSystemOffCommand,garageDoorOpenCommand,
                                coolingSystemOffCommand,fireDeptCallCommand,homeSecurityOpenDoorsCommand,
                                lightOffCommand};
		Command [] burgularyMacro ={homeSecurityCallPoliceCommand,garageDoorCloseCommand,lightOnCommand,musicSystemOffCommand};

		Command [] vacationMode = { televisionOffCommand,musicSystemOffCommand,garageDoorCloseCommand,lightOffCommand,
                                    homeSecurityLockDoorsCommand,coolingSystemOffCommand};

		Command [] backHome = {televisionOnCommand, musicSystemOnCommand, garageDoorOpenCommand, lightOnCommand,
                                homeSecurityOpenDoorsCommand,coolingSystemOnCommand,fireAlarmOnCommand};

		System.out.println();
		System.out.println("STATUS:Executing Fire Drill procedure");
		MacroCommand FiredrillMacro  = new MacroCommand(firedrill);
		FiredrillMacro.execute();

        System.out.println();
		System.out.println("STATUS:Executing Burgular procedure");
		MacroCommand burgularMacro = new MacroCommand(burgularyMacro);
		burgularMacro.execute();

		System.out.println();
		System.out.println("STATUS:Executing Vacation procedure");
		MacroCommand vacationMacro = new MacroCommand(vacationMode);
		vacationMacro.execute();

		System.out.println();
		System.out.println("STATUS:Welcome Back Home");
		MacroCommand backHomeMacro  = new MacroCommand(backHome);
		backHomeMacro.execute();

		System.out.println();
		System.out.println("STATUS:Executing Energy Consumption Check");
        EnergyConsumption energyConsumption = new EnergyConsumption(coolingSystem,fireAlarm,garageDoor,
                                                                    homeSecuritySystem,light,musicSystem,
                                                                    television);
        energyConsumption.execute();

	}
}
