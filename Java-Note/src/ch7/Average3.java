package ch7;

import java.util.*;

public class Average3 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        int number;
        while (true) {
        	//�Q��while�]�_�ӡA���C�@����J���|�i�J���~�B�z
        	//�Ǧ��קK�@�����~������A�{���������x��
            try {
                number = scanner.nextInt();
                if (number == 0) {
                    break;
                }
                sum += number;
                count++;
            } catch (InputMismatchException ex) {
                System.out.printf("���L�D��ƿ�J�G%s%n", scanner.next());
            }
        }
        System.out.printf("���� %.2f%n", sum / count);
    }
}
