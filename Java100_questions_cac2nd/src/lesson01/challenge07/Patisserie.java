/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 */

package lesson01.challenge07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("それぞれ何個ずつ買いますか？（最大30個まで）\n");

		System.out.print("シトロン      >");
		String sitoron = reader.readLine();
		double a = Double.parseDouble(sitoron);

		System.out.print("ショコラ      >");
		String syokora = reader.readLine();
		double b = Double.parseDouble(syokora);

		System.out.print("ピスターシュ  >");
		String pisutasyu = reader.readLine();
		double c = Double.parseDouble(pisutasyu);

		double sum = a + b + c;
		double sumnumber = 250.0 * a + 280.0 * b + 320.0 * c;

		System.out.println();
		System.out.println("シトロン     " + a + "個");
		System.out.println("ショコラ     " + b + "個");
		System.out.println("ピスターシュ " + c + "個\n");
		System.out.println("合計個数    " + sum + "個");
		System.out.println("合計金額   " + (int) sumnumber + "円\n");
		System.out.println("をお買いあげですね。");
		System.out.println("承りました。\n");

		int a_stock = (int) (30 - a);
		int b_stock = (int) (30 - b);
		int c_stock = (int) (30 - c);

		System.out.println("本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250 ・・・ 残り" + a_stock + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + b_stock + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + c_stock + "個");

	}
}
