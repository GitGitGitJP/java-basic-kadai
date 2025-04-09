package kadai_018;

abstract class Kato_Chapter18 {
	
	String familyName = "加藤";//姓
	
	String givenName;//名
	
	String address = "東京都中野区〇×";//住所
	
	void commonIntroduce() {
		System.out.println("名前は"+familyName+givenName+"です");
		System.out.println("住所は"+address+"です");
	}
	
	abstract void eachIntroduce();
	
	void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}

}
