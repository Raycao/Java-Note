package ch2;

import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class importStatic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        out.print("請輸入姓名：");
        out.printf("%s 你好！%n", scanner.nextLine());
    }
}
