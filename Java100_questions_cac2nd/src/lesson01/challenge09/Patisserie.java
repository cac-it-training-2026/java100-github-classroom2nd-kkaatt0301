/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

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
		System.out.println("をお買いあげですね。");
		System.out.println("承りました。\n");

		int a_stock = (int) (30 - a);
		int b_stock = (int) (30 - b);
		int c_stock = (int) (30 - c);

		System.out.println("本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250 ・・・ 残り" + a_stock + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + b_stock + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + c_stock + "個\n");

		System.out.println("閉店時間となりました。");
		System.out.println("またのお越しをお待ちしております。\n");
		System.out.println("売上割合      ");
		System.out.println("売上合計      \\" + (int) sumnumber + "\n");

		int total = (int) sumnumber;

		int a_parsent = (int) ((250.0 * a) / total * 100);
		int b_parsent = (int) ((280.0 * b) / total * 100);
		int c_parsent = (int) ((320.0 * c) / total * 100);

		System.out.println("内訳");
		System.out.println("シトロン      \\" + (int) (250.0 * a) + "・・・" + a_parsent + "%");
		System.out.println("ショコラ      \\" + (int) (280.0 * b) + "・・・" + b_parsent + "%");
		System.out.println("ピスターシュ  \\" + (int) (320.0 * c) + "・・・" + c_parsent + "%\n");

		System.out.println("明日の三色マカロンの配合率が決まりました!\n");
		System.out.println("シトロンの味     ・・・" + a_parsent + "%");
		System.out.println("ショコラの味     ・・・" + b_parsent + "%");
		System.out.println("ピスターシュの味 ・・・" + c_parsent + "%\n");
		System.out.println("が楽しめます!\n");

		System.out.println("値段は\\" + ((total / (int) sum) / 10 * 10) + "です。");

	}

}
