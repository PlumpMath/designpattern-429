package command.command;

import command.vendor.CeilingFan;

/**
 * 天井の扇風機をONにするコマンド。
 * 
 * @author TakumiEra
 *
 */
public class CeilingFanOnCommand implements Command{

	/**
	 * 天井の扇風機。
	 */
	CeilingFan ceilingFan;
	
	/**
	 * コンストラクタ。
	 * 
	 * @param aCeilingFan
	 */
	public CeilingFanOnCommand(CeilingFan aCeilingFan) {
		this.ceilingFan = aCeilingFan;
	}
	
	@Override
	public void execute() {
		ceilingFan.on();
	}

}
