package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {

		HashMap<String,String>  dicmap = new HashMap<String,String>();
		
		void put(){
			dicmap.put("apple", "りんご");
			dicmap.put("peach", "桃");
			dicmap.put("banana", "バナナ");
			dicmap.put("lemon", "レモン");
			dicmap.put("pear", "梨");
			dicmap.put("kiwi", "キウィ");
			dicmap.put("strawberry", "いちご");
			dicmap.put("grape", "ぶどう");
			dicmap.put("muscat", "マスカット");
			dicmap.put("cherry", "さくらんぼ");
		}
		void search(String[] word) {
			for(int i =0;i<word.length;i++) {
				if(dicmap.get(word[i])!= null) {
					System.out.println(word[i]+"の意味は"+dicmap.get(word[i]));
				}
				else{
					System.out.println(word[i]+"は辞書に存在しません");
				}
			}
		}

}
