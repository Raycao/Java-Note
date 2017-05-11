package ch7;

import java.util.Scanner;

public class Average4 {

    public static void main(String[] args) {
        double sum = 0;
        int count = 0;
        int number;
        while(true) {
            number = nextInt();
            if(number == 0) {
                break;
            }
            sum += number;
            count++;
        }
        System.out.printf("平均 %.2f%n", sum / count);
    }

    static Scanner scanner = new Scanner(System.in);
    
    //新開一個方法，在此方法內接收輸入
    //並判斷是否為數字，若不是則提醒使用者
    //透過這種方法，壁面進入錯誤處理
    static int nextInt() {
        String input = scanner.next();
        //利用while迴圈判斷是否為數字，不是則提醒使用者
        while(!input.matches("\\d*")) {
            System.out.println("請輸入數字");
            input = scanner.next();
        }
        //若是數字則頗剖析為整數型態並回傳
        return Integer.parseInt(input);
    }
}