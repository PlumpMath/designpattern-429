package command.command;

import command.vendor.Stereo;

/**
 * ステレオを消すコマンド。
 * 
 * @author TakumiEra
 *
 */
public class StereoOffCommand implements Command{

	/**
	 * ステレオ。
	 */
	Stereo stereo;
	
	/**
	 * コンストラクタ。
	 * 
	 * @param aStereo
	 */
	public StereoOffCommand(Stereo aStereo) {
		this.stereo = aStereo;
	}
	
	@Override
	public void execute() {
		stereo.off();
	}

}
