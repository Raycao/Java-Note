package ch7;

import java.util.*;

public class Average2 {
	public static void main(String[] args) {
		//�Q��try-catch�B�z���~����
        try {
        	//JVM�|���հ���try�϶������{���X
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
            System.out.printf("���� %.2f%n", sum / count);
        } catch (InputMismatchException ex) {
        	//�p�Gtry�϶��������~���͡A�h�|���Ϳ��~����
        	//���catch�A���������~���󫬺A�A�p�G���ŦX�A�N����catch�϶������{���X
        	//�A������ܿ��~����InputMismatchException���A
        	//�᭱ex�h���޼ƦW�١A�i�ۥѨ��W
            System.out.println("������J���");
        }
    }
}
