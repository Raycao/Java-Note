package ch1;
import java.util.Scanner; //import�i�D�sĶ���A����u�n��scanner�N�i�H

public class guess { //���ɮץΨӻ���api���ϥ�
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int number = (int) (Math.random()*10);
		int guessnumber;
		
		do{
			System.out.print("�вq�Ʀr(0~9):");
			guessnumber = input.nextInt(); //�ϥ�nextInt��k�d�ݦ��S���U�@�Ӧr���J�A�í�R��int���A
		} while(guessnumber != number);
		
		System.out.print("�q��");
	}
}
