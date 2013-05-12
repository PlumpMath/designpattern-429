package command.command;

import command.vendor.Light;
import command.vendor.Stereo;

/**
 * ステレオの電源を付け、CDモードに設定するコマンド。
 * 
 * @author TakumiEra
 *
 */
public class StereoOnWithCDCommand implements Command{

	/**
	 * ステレオ。
	 */
	Stereo stereo;
	
	/**
	 * コンストラクタ。
	 * 
	 * @param aStereo
	 */
	public StereoOnWithCDCommand(Stereo aStereo) {
		this.stereo = aStereo;
	}
	
	@Override
	public void execute() {
		stereo.on();
		stereo.volumUp();
		stereo.setCD();
	}

}
