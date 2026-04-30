package lesson05.challenge10;

class Robot {

	// 豪華な料理を作る機能
	public void cookLuxuryMeal() {
		System.out.println("=== SuperRobot 起動 ===");
		System.out.println("材料をスキャン中...");
		System.out.println("最高品質の食材を選択しました。");

		System.out.println("調理開始：");
		System.out.println("・前菜：キャビアとサーモンのカナッペ");
		System.out.println("・スープ：トリュフ香るコンソメスープ");
		System.out.println("・メイン：和牛ステーキ フォアグラ添え");
		System.out.println("・デザート：ベルギーチョコのムース");

		System.out.println("盛り付け最適化中...");
		System.out.println("究極のフルコース完成！");
		System.out.println("=== 調理完了 ===");
	}
}

public class SuperRobot {
	public static void main(String[] args) {

		Robot robot = new Robot();
		robot.cookLuxuryMeal();
	}
}