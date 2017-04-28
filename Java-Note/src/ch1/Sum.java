package ch1;
 
import java.util.Scanner; 

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long sum = 0;
        long number = 0;
        do {
            System.out.print("輸入數字：");
            number = Long.parseLong(scanner.nextLine());//在此將使用者輸入剖析為long型態
            sum += number;
        } while(number != 0); //若輸入為0，則跳出迴圈
        System.out.println("總合：" + sum);
    }
}
