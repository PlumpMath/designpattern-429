package command;

import org.junit.Test;

import command.command.CeilingFanOffCommand;
import command.command.CeilingFanOnCommand;
import command.command.GarageDoorDownCommand;
import command.command.GarageDoorUpCommand;
import command.command.LightOffCommand;
import command.command.LightOnCommand;
import command.command.StereoOffCommand;
import command.command.StereoOnWithCDCommand;
import command.controller.RemoteControl;
import command.vendor.CeilingFan;
import command.vendor.GarageDoor;
import command.vendor.Light;
import command.vendor.Stereo;

public class RemoteLoader {

	@Test
	public void test() throws Exception {
		RemoteControl remoteControl = new RemoteControl();
		
		Light livingRoomLight = new Light("リビングルーム");
		Light kitchenLight = new Light("キッチン");
		CeilingFan ceilingFan = new CeilingFan("リビングルーム");
		GarageDoor garageDoor = new GarageDoor("ガレージ");
		Stereo stereo = new Stereo("リビングルーム");
		
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		
		CeilingFanOnCommand livingRoomCeilingFanOn = new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand livingRoomCeilingFanOff = new CeilingFanOffCommand(ceilingFan);
		
		GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
		GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);
		
		StereoOnWithCDCommand livingRoomStereoOn = new StereoOnWithCDCommand(stereo);
		StereoOffCommand livingRoomStereoOff = new StereoOffCommand(stereo);
		
		remoteControl.setcommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setcommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setcommand(2, livingRoomCeilingFanOn, livingRoomCeilingFanOff);
		remoteControl.setcommand(3, garageDoorUp, garageDoorDown);
		remoteControl.setcommand(4, livingRoomStereoOn, livingRoomStereoOff);
		
		System.out.println(remoteControl);
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);
		remoteControl.onButtonWasPushed(4);
		remoteControl.offButtonWasPushed(4);
		
	}
	
}
