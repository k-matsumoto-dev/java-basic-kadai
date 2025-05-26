package kadai_018;

public abstract class Kato_Chapter18 {
	// 姓
	public String familyName = "加藤";
	// 名
	public String givenName;
	// 住所
	public String address = "東京都中野区〇×";
	
	// 共通の紹介
	public void commonIntroduce() {
		System.out.println("名前は" + this.familyName + this.givenName + "です");
		System.out.println("住所は" + this.address + "です");
	}
	
	// 個別の紹介
	abstract public void eachIntroduce();
	
	// 紹介を実行
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
		System.out.println("");
	}
}
