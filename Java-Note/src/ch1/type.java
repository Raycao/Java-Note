package ch1;

public class type { //此範例用來表示基本型態的=與==的意義
	public static void main(String args[]){
		int a = 10; //=用來表示指定值給變數
		int b = 10; 
		int c = a;
		System.out.println(a == b); //==用來表示比較基本型態的變數內容是否相同
		System.out.println(a == c);
	}
}

