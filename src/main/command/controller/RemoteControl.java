package command.controller;

import java.util.ArrayList;
import java.util.List;

import command.command.Command;
import command.command.NoCommand;

/**
 * リモコン。
 * 
 * @author TakumiEra
 *
 */
public class RemoteControl {

	/**
	 * ボタンの個数。
	 */
	private static int NUMBER_OF_BUTTONS = 7;
	
	/**
	 * ONボタン押下時のコマンド。
	 */
	List<Command> onCommands;
	
	/**
	 * OFFボタン押下時のコマンド。
	 */
	List<Command> offCommands;
	
	/**
	 * コンストラクタ。
	 */
	public RemoteControl() {
		this.onCommands = new ArrayList<Command>();
		this.offCommands = new ArrayList<Command>();
		
		Command noCommand = new NoCommand();
		for(int i = 0;i < NUMBER_OF_BUTTONS;i++){
			this.onCommands.add(noCommand);
			this.offCommands.add(noCommand);
		}
	}
	
	/**
	 * ボタンに操作を割り当てる。
	 * 
	 * @param aSlot
	 * @param aOnCommand
	 * @param aOffCommand
	 */
	public void setcommand(int aSlot,Command aOnCommand,Command aOffCommand) {
		this.onCommands.set(aSlot, aOnCommand);
		this.offCommands.set(aSlot, aOffCommand);
	}
	
	/**
	 * ONボタンを押下する。
	 * 
	 * @param aSlot
	 */
	public void onButtonWasPushed(int aSlot) {
		this.onCommands.get(aSlot).execute();
	}
	
	
	/**
	 * OFFボタンを押下する。
	 * 
	 * @param aSlot
	 */
	public void offButtonWasPushed(int aSlot) {
		this.offCommands.get(aSlot).execute();
	}
	
	@Override
	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("\n----- リモコン -----\n");
		for(int i = 0;i < onCommands.size();i++){
			stringBuffer.append("[スロット" + i + "]" + onCommands.get(i).getClass().getName() + " " + offCommands.get(i).getClass().getName() + "\n");
		}
		return stringBuffer.toString();
	}
	
}
