package ch7;

import java.util.Scanner;

public class Average {
	//���ϥΪ̥i�H�s���J�Ʀr�A�խY�O0�A�h�N�Ʀr�ۥ[�����ȦL�X
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        int number;
        while(true) {
        	//�C������number�h���o�̷s����
            number = scanner.nextInt();
            if(number == 0) {
            	//�p�G����0�A�h���X�j��
                break;
            }
            //�C�����N��J�ȥ[�W�h�A�t�~�h�ֵ��]�[�W�h
            sum += number;
            count++;
        }
        System.out.printf("���� %.2f%n", sum / count);
    }
}