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
        System.out.printf("���� %.2f%n", sum / count);
    }

    static Scanner scanner = new Scanner(System.in);
    
    //�s�}�@�Ӥ�k�A�b����k��������J
    //�çP�_�O�_���Ʀr�A�Y���O�h�����ϥΪ�
    //�z�L�o�ؤ�k�A�����i�J���~�B�z
    static int nextInt() {
        String input = scanner.next();
        //�Q��while�j��P�_�O�_���Ʀr�A���O�h�����ϥΪ�
        while(!input.matches("\\d*")) {
            System.out.println("�п�J�Ʀr");
            input = scanner.next();
        }
        //�Y�O�Ʀr�h���R����ƫ��A�æ^��
        return Integer.parseInt(input);
    }
}