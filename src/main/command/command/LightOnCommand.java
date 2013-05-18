package command.command;

import command.vendor.Light;

/**
 * 照明を付けるコマンド。
 * 
 * @author TakumiEra
 *
 */
public class LightOnCommand implements Command{

	/**
	 * 部屋の照明。
	 */
	Light light;
	
	/**
	 * コンストラクタ。
	 * 
	 * @param aLight
	 */
	public LightOnCommand(Light aLight) {
		this.light = aLight;
	}
	
	@Override
	public void execute() {
		light.on();
	}

}
