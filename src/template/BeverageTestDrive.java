package template;

import org.junit.Test;

public class BeverageTestDrive {

	@Test
	public void test() throws Exception {
		Coffee coffee = new Coffee();
		Tea tea = new Tea();
		
		// 紅茶を作成
		System.out.println("\n紅茶を作っています...");
		tea.prepareRecipe();
		
		// コーヒーを作成
		System.out.println("\nコーヒーを作っています...");
		coffee.prepareRecipe();
	}
	
}
