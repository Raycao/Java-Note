package ch1;
 
import java.util.Scanner; 

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long sum = 0;
        long number = 0;
        do {
            System.out.print("��J�Ʀr�G");
            number = Long.parseLong(scanner.nextLine());//�b���N�ϥΪ̿�J��R��long���A
            sum += number;
        } while(number != 0); //�Y��J��0�A�h���X�j��
        System.out.println("�`�X�G" + sum);
    }
}
