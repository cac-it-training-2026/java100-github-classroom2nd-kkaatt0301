/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題4 注文を受ける
 *
 * 3種類のマカロンを任意の個数購入できるようにします。
 * [問題3]までの表示を行った後で
 * 実行例を参考に処理を追記してください。
 * （ >8 は >を表示した後で入力待ち状態になり、
 *   ユーザーがキーボードから8を入力したイメージです。）
 *
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
 * をお買いあげですね。
 * 承りました。
 */

package lesson01.challenge04;

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

		System.out.println();
		System.out.println("シトロン     " + a + "個");
		System.out.println("ショコラ     " + b + "個");
		System.out.println("ピスターシュ " + c + "個\n");
		System.out.println("をお買いあげですね。");
		System.out.println("承りました。");

	}
}
