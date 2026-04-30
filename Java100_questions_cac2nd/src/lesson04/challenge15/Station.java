package lesson04.challenge15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Station {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		// 山手線の全駅名
		String[] Station = {
				"東京", "神田", "秋葉原", "御徒町", "上野", "鴬谷", "日暮里",
				"西日暮里", "田端", "駒込", "巣鴨", "大塚", "池袋", "目白",
				"高田馬場", "新大久保", "新宿", "代々木", "原宿", "渋谷",
				"恵比寿", "目黒", "五反田", "大崎", "高輪ゲートウェイ", "品川",
				"田町", "浜松町", "新橋", "有楽町"
		};

		// 使用済みフラグ配列
		boolean[] used = new boolean[Station.length];

		int remaining = Station.length;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Random random = new Random();

		System.out.println("※※※ 山手線ゲーム ※※※");
		System.out.println();
		System.out.println("      ゲームスタート！");
		System.out.println();

		while (true) {

			String input = br.readLine();

			int Index = -1;
			for (int i = 0; i < Station.length; i++) {
				if (Station[i].equals(input)) {
					Index = i;
					break;
				}
			}

			int computerIndex;
			do {
				computerIndex = random.nextInt(Station.length);
			} while (used[computerIndex]);

			if (Index == -1) {
				System.out.println("あなたの負けです！");
				break;
			}

			if (used[Index]) {
				System.out.println("あなたの負けです！");
				break;
			}

			used[Index] = true;
			remaining--;

			if (remaining == 0) {
				System.out.println("あなたの勝ちです！");
				break;
			}

		}
	}

}
