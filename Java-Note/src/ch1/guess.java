package ch1;
import java.util.Scanner; //import告訴編譯器，之後只要打scanner就可以

public class guess { //此檔案用來說明api之使用
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int number = (int) (Math.random()*10);
		int guessnumber;
		
		do{
			System.out.print("請猜數字(0~9):");
			guessnumber = input.nextInt(); //使用nextInt方法查看有沒有下一個字串輸入，並剖析為int型態
		} while(guessnumber != number);
		
		System.out.print("猜中");
	}
}
