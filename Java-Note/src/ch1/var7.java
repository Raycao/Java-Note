package ch1;

public class var7 {
	
	static int a; //使變數a成為類別變數
	
	public static void main(String args[]){
		
		var7.a = 5; //同樣不用new物件，但是要記得加上所屬類別名稱
		System.out.println("a="+var7.a);
	}
}
