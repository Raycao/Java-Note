package ch1;

public class score { //���ɮץΩ���կx�} 
	public static void main(String args[]){
		int[] scores = {90,100,50,60}; //�x�}�ŧi 
		for(int i = 0; i < scores.length; i++) //�ϥ�for�j��v�@�C�X
			System.out.printf("����:%d %n", scores[i]); 
	
		for(int j:scores){ //�t�@��for�j���ܤ覡�A�Φb�x�}�W
			System.out.printf("����:%d %n", j); 
			
		}
	}
}
