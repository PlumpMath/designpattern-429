package command.command;

import command.vendor.CeilingFan;

/**
 * 天井の扇風機をOFFにするコマンド。
 * 
 * @author TakumiEra
 *
 */
public class CeilingFanOffCommand implements Command{

	/**
	 * 天井の扇風機。
	 */
	CeilingFan ceilingFan;
	
	/**
	 * コンストラクタ。
	 * 
	 * @param aCeilingFan
	 */
	public CeilingFanOffCommand(CeilingFan aCeilingFan) {
		this.ceilingFan = aCeilingFan;
	}
	
	@Override
	public void execute() {
		ceilingFan.off();
	}

}
