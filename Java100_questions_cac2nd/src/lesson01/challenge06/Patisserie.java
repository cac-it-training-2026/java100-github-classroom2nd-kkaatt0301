/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

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

		System.out.println();
		System.out.println("シトロン     " + a + "個");
		System.out.println("ショコラ     " + b + "個");
		System.out.println("ピスターシュ " + c + "個\n");
		System.out.println("合計個数    " + sum + "個");
		System.out.println("合計金額  " + sumnumber + "円\n");
		System.out.println("をお買いあげですね。");
		System.out.println("承りました。\n");

		int a_stock = 30 - a;
		int b_stock = 30 - b;
		int c_stock = 30 - c;
		System.out.println("本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250 ・・・ 残り" + a_stock + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + b_stock + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + c_stock + "個");

	}
}
