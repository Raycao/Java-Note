package ch2;

public class Ball {
	double radius;
	
	void doOther(){}
	
	static void dosome(){
		//在static方法會區塊中不能出現this關鍵字
		double r = this.radius;
		
		
		
		/*
		 * 在程式碼中撰寫了某個物件資料成員
		 * 雖然沒有撰寫this，但也隱含了這個物件某成員的意思
		 * */
		double r2 = radius;
		
		//static方法或區塊中，不能呼叫非static方法或區塊
		doOther();
	}
}
