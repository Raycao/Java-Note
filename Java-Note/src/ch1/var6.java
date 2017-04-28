package ch1;

class mynumber3{
	static int n; //使n變為類別變數，可以不用new物件便可以使用
}

public class var6 {
	public static void main(String args[]){
		
		mynumber3.n = 10; //可以不用new物件便可以直接使用，但是加上所屬物件之名稱
		System.out.println("n="+mynumber3.n);
	}
}
