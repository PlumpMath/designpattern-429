package composite;

import org.junit.Before;
import org.junit.Test;

import composite.menu.MenuComponent;
import composite.menu.MenuLeaf;
import composite.menu.MenuNode;

public class MenuTest {

	MenuComponent allMenus;
	Waitress waitress;
	
	@Before
	public void before() {
		// メニュー情報を作成
		this.allMenus = new MenuNode("すべてのメニュー", "すべてを統合したメニュー");
		
		MenuComponent pancakeHouseMenu = new MenuNode("パンケーキハウスメニュー", "朝食");
		MenuComponent dinerMenu = new MenuNode("ダイナーメニュー", "昼食");
		MenuComponent cafeMenu = new MenuNode("カフェメニュー", "夕食");
		MenuComponent dessertMenu = new MenuNode("デザートメニュー", "デザート");
		
		pancakeHouseMenu.add(new MenuLeaf("K&Bのパンケーキ朝食", "スクランブルエッグとトーストが付いたパンケーキ", true, 2.99));
		pancakeHouseMenu.add(new MenuLeaf("通常のパンケーキ朝食", "卵焼きとソーセージが付いたパンケーキ", false, 2.99));
		pancakeHouseMenu.add(new MenuLeaf("ブルーベリーパンケーキ", "新鮮なブルーベリーで作ったパンケーキ", true, 3.49));
		pancakeHouseMenu.add(new MenuLeaf("ワッフル", "ブルーベリーか苺の好きな方を乗せたワッフル", true, 3.59));
		
		dinerMenu.add(new MenuLeaf("ベジタリアンBLT", "レタス、トマト、(偽)ベーコンをはさんだ全粒小麦パンサンドイッチ", true, 2.99));
		dinerMenu.add(new MenuLeaf("BLT", "レタス、トマト、ベーコンをはさんだ全粒小麦パンサンドイッチ", false, 2.99));
		dinerMenu.add(new MenuLeaf("本日のスープ", "ポテトサラダを添えた本日のスープ", false, 3.29));
		dinerMenu.add(new MenuLeaf("ホットドッグ", "ザワークラウト、レリッシュ、玉ねぎ、チーズをはさんだホットドック", false, 3.05));
		
		dessertMenu.add(new MenuLeaf("アップルパイ", "バニラアイスクリームをのせたフレーク状生地のアップルパイ", true, 1.59));
		
		dinerMenu.add(dessertMenu);
		
		cafeMenu.add(new MenuLeaf("野菜バーガーとフライドポテト", "全粒小麦パンにレタスとトマトをはさんだ野菜バーガーとフライドポテト", true, 3.99));
		cafeMenu.add(new MenuLeaf("本日のスープ", "サラダが付いた本日のスープ", false, 3.69));
		cafeMenu.add(new MenuLeaf("ブリトー", "インゲン豆、サルサ、グアカモーレ入りの大きなブリトー", true, 4.29));
		
		this.allMenus.add(pancakeHouseMenu);
		this.allMenus.add(dinerMenu);
		this.allMenus.add(cafeMenu);
		
		// ウェイトレスをスタンバイ
		this.waitress = new Waitress(this.allMenus);
	}
	
	/**
	 * {@link Waitress#printAllMenu()}}のためのテスト・メソッド。
	 * 
	 * @throws Exception
	 */
	@Test
	public void printAllMenuTest() throws Exception {
		// テスト実施
		this.waitress.printAllMenu();
	}
	
	/**
	 * {@link Waitress#printVegetarianMenu()}}のためのテスト・メソッド。
	 * 
	 * @throws Exception
	 */
	@Test
	public void printVegetarianMenuTest() throws Exception {
		// テスト実施
		this.waitress.printVegetarianMenu();
	}
	
	/**
	 * {@link Waitress#printMenu(java.util.Iterator)}}のためのテスト・メソッド。
	 * 
	 * @throws Exception
	 */
	@Test
	public void printMenuTest() throws Exception {
		// テスト実施
		this.waitress.printMenu(this.allMenus.getChild(0).createIterator());
	}
	
}
