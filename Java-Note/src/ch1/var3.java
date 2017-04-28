package ch1;


public class var3 {

	int a;
	
	public static void main(String args[]){
		a = 5; //因為a的宣告並未在生存區塊內，應該要把int a放進main裡面
		System.out.println("a="+a);
	}
}
