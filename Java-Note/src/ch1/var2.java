package ch1;

class mynumber2{
	int n;
}

public class var2 {
	public static void main(String args[]){
		mynumber2 M = new mynumber2(); //產生新物件M
		M.n = 10; //透過產生的新物件，使用其變數，這樣是可以的
		System.out.println("n="+M.n);
	}
}