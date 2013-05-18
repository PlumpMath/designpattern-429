package command.command;

import command.vendor.Light;

/**
 * 照明を消すコマンド。
 * 
 * @author TakumiEra
 *
 */
public class LightOffCommand implements Command{

	/**
	 * 部屋の照明。
	 */
	Light light;
	
	/**
	 * コンストラクタ。
	 * 
	 * @param aLight
	 */
	public LightOffCommand(Light aLight) {
		this.light = aLight;
	}
	
	@Override
	public void execute() {
		light.off();
	}

}
