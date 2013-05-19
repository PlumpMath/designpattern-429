package singleton;

/**
 * チョコレートボイラ。
 * 
 * @author TakumiEra
 *
 */
public class ChocolateBoiler {

	/**
	 * ボイラの中身が空かどうかを表す。
	 */
	private boolean empty;
	
	/**
	 * ボイラの中身が沸騰しているかどうかを表す。
	 */
	private boolean boiled;
	
	/**
	 * チョコレートボイラのインスタンス。
	 */
	private volatile static ChocolateBoiler uniqueInstance;
	
	/**
	 * コンストラクタ。
	 */
    private ChocolateBoiler() {
		this.empty = true;
		this.boiled = false;
	}
    
    /**
     * インスタンスを生成する。
     * 
     * @return
     */
    public static ChocolateBoiler getInstance() {
		if(uniqueInstance == null){
			// 初回起動時のみ同期化を行う
			synchronized (ChocolateBoiler.class) {
				if(uniqueInstance == null){
					uniqueInstance = new ChocolateBoiler();
				}
			}
		}
		return uniqueInstance;
	}
    
    /**
     * 牛乳とチョコレートの混合液をボイラに流し込む。
     */
    public void fill() {
		if(isEmpty()){
			this.empty = false;
			this.boiled = false;
			System.out.println("牛乳とチョコレートの混合液でボイラを満たします...");
		}
	}
    
    /**
     * ボイラから、沸騰した牛乳とチョコレートの混合液を取り出す。
     */
    public void drain() {
    	if(!isEmpty() && isBoiled()){
    		System.out.println("沸騰した牛乳とチョコレートの混合液を空にします...");
    		this.empty = true;
    	}
	}
    
    /**
     * ボイラを沸騰させる。
     */
    public void boil() {
    	if(!isEmpty() && !isBoiled()){
    		System.out.println("中身を沸騰させます...");
    		this.boiled = true;
    	}
	}
	
    public boolean isEmpty(){
    	return this.empty;
    }
    
    public boolean isBoiled(){
    	return this.boiled;
    }
    
}
