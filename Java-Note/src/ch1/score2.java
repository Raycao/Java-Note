package ch1;

import java.util.Arrays; //���J��i�H�ϥΰ}�C���󪺤�k

public class score2 { //���ɮץΨӽm�ߥHnew�ͦ����}�C
	public static void main(String args[]){ 
		int[] scores = new int[10]; //�ϥ�new�إߪ���Aint���}�C��l�Ȥ��e��0
	
		for(int i : scores){  //�L�X�x�}���e�A�o�{���e���Ҭ�0
			System.out.printf("%2d", i);
		}
		
		System.out.println();
		Arrays.fill(scores,60); //�ϥ�fill��k�A�N�x�}���e�H60��
		
		for(int i : scores){ //�L�X�x�}���e�A�o�{�Ҭ�60
			System.out.printf("%3d", i);
		}
	}
}
