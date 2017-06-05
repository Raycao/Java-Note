package ch12;

class classA{} //空的類別

public class MainClass {
	public static void main(String[] args){
		classA a = new classA()
			{ //實體化匿名類別，有別於以往物件化，實作匿名類別會在後面接上{}，並在其內放上程式碼
			
			//透過實作匿名類別，在空類別classA內多加兩個function
			    public void function1(int x, int y) { 
					System.out.println(x + y);
			    }
		 
			    public int function2(int x) {
					return x + 1;
			    }
			}; //注意在此要加上分號，勿忘記
	}
}
