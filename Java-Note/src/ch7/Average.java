package ch7;

import java.util.Scanner;

public class Average {
	//讓使用者可以連續輸入數字，倘若是0，則將數字相加平均值印出
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        int number;
        while(true) {
        	//每次都讓number去取得最新的值
            number = scanner.nextInt();
            if(number == 0) {
            	//如果等於0，則跳出迴圈
                break;
            }
            //每次都將輸入值加上去，另外多少筆也加上去
            sum += number;
            count++;
        }
        System.out.printf("平均 %.2f%n", sum / count);
    }
}