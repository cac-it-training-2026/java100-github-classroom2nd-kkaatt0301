/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package lesson01.challenge05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("それぞれ何個ずつ買いますか？（最大30個まで）\n");

		System.out.print("シトロン      >");
		String sitoron = reader.readLine();
		int a = Integer.parseInt(sitoron);

		System.out.print("ショコラ      >");
		String syokora = reader.readLine();
		int b = Integer.parseInt(syokora);

		System.out.print("ピスターシュ  >");
		String pisutasyu = reader.readLine();
		int c = Integer.parseInt(pisutasyu);

		int sum = a + b + c;
		int sumnumber = 250 * a + 280 * b + 320 * c;

		System.out.println("");
		System.out.println("シトロン     " + a + "個");
		System.out.println("ショコラ     " + b + "個");
		System.out.println("ピスターシュ " + c + "個\n");
		System.out.println("合計個数    " + sum + "個");
		System.out.println("合計金額  " + sumnumber + "円\n");
		System.out.println("をお買いあげですね。");
		System.out.println("承りました。");

	}
}
