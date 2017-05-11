package ch7;

import java.util.*;

public class Average2 {
	public static void main(String[] args) {
		//利用try-catch處理錯誤物件
        try {
        	//JVM會嘗試執行try區塊內的程式碼
            Scanner scanner = new Scanner(System.in);
            double sum = 0;
            int count = 0;
            int number;
            while (true) {
                number = scanner.nextInt();
                if (number == 0) {
                    break;
                }
                sum += number;
                count++;
            }
            System.out.printf("平均 %.2f%n", sum / count);
        } catch (InputMismatchException ex) {
        	//如果try區塊內有錯誤產生，則會產生錯誤物件
        	//比較catch括弧內的錯誤物件型態，如果興符合，就執行catch區塊內之程式碼
        	//括弧內表示錯誤物件為InputMismatchException型態
        	//後面ex則為引數名稱，可自由取名
            System.out.println("必須輸入整數");
        }
    }
}
