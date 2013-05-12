package command.command;

import command.vendor.GarageDoor;

/**
 * ガレージのドアを閉めるコマンド。
 * 
 * @author TakumiEra
 *
 */
public class GarageDoorDownCommand implements Command{

	/**
	 * ガレージのドア。
	 */
	GarageDoor garageDoor;
	
	/**
	 * コンストラクタ。
	 * 
	 * @param aGarageDoor
	 */
	public GarageDoorDownCommand(GarageDoor aGarageDoor) {
		this.garageDoor = aGarageDoor;
	}
	
	@Override
	public void execute() {
		garageDoor.down();
	}

}
