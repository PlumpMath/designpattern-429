package command.command;

import command.vendor.GarageDoor;

/**
 * ガレージのドアを開けるコマンド。
 * 
 * @author TakumiEra
 *
 */
public class GarageDoorUpCommand implements Command{

	/**
	 * ガレージのドア。
	 */
	GarageDoor garageDoor;
	
	/**
	 * コンストラクタ。
	 * 
	 * @param aGarageDoor
	 */
	public GarageDoorUpCommand(GarageDoor aGarageDoor) {
		this.garageDoor = aGarageDoor;
	}
	
	@Override
	public void execute() {
		garageDoor.up();
	}

}
