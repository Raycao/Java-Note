package ch1;
import java.math.BigDecimal; 

public class type2 { //此檔案用來表示使用類別型態的變數，使用=與==的不同
	public static void main(String args[]){
		BigDecimal a = new BigDecimal("0.1"); 
		BigDecimal b = new BigDecimal("0.1");
		System.out.println(a == b);        // 顯示false，兩個雖然同值，但表示為不同物件
		System.out.println(a.equals(b));  // 顯示true，表示兩個同值
	}
}
