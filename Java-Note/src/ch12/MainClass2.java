package ch12;

//非匿名類別例子
class classA2{}
class classB extends classA2{
	//在另外的地方宣告class
	public void function1(int x, int y) {
		 
    }
 
    public int function2(int x) {
		return x + 1;
    }
}

public class MainClass2 {
	public static void main(String[] args){
		classA2 a = new classB();
	}
}
