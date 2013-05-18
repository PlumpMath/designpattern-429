package command.command;

/**
 * リモコン操作のコマンドを表すインタフェース。
 * 
 * @author TakumiEra
 *
 */
public interface Command {
	
	/**
	 * 処理を実行する。
	 */
    public void execute();
    
}
