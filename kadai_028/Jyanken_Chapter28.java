package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

	double roken;
	int result;
	boolean roop = true;
	String[] jyanken = { "r", "s", "p" };
	HashMap<String, String> battle = new HashMap<String, String>();

	public String getMyChoice() {
		String hand = "";
		System.out.println("じゃんけんの手を入力しましょう");
		
		while (roop) {
			Scanner sc = new Scanner(System.in);
			hand = sc.next();
			
			for (int i = 0; i < 3; i++) {
				if (hand.equals(jyanken[i])) {
					roop = false;
					sc.close();
				}
			
			}
			if (roop == true) {
				System.out.println("正しいじゃんけんの手ではないのでもう一度入力してください");
				
			}
		}

		return hand;

	}

	public String getRandom() {
		roken = Math.random() * 3;
		result = (int) Math.floor(roken);
		return jyanken[result];

	}

	void playGame() {
		battle.put("r", "グー");
		battle.put("s", "チョキ");
		battle.put("p", "パー");

		String player = getMyChoice();
		String oppoment = getRandom();

		System.out.println("自分の手は" + battle.get(player) + "相手の手は" + battle.get(oppoment) + "です");
		if (player.equals("r") && oppoment.equals("s") || player.equals("s") && oppoment.equals("p")
				|| player.equals("p") && oppoment.equals("r")) {
			System.out.println("自分の勝ちです");

		} else if (player.equals(oppoment)) {
			System.out.println("あいこです");

		} else {
			System.out.println("自分の負けです");
		}

	}

}
