package ch1;

public class xy { //���ɮ׫i�w��ܤG���}�C
	public static void main(String args[]){
		int[][] cords = { //�G���}�C���ŧi
				{1,2,3},
				{4,5,6}
		};
		
		for(int i = 0 ; i < cords.length; i++){  //�o��cords���C��
			for(int j = 0 ; j < cords[i].length ; j++){ //�o��C�C���X�Ӥ����A�۷��"���"
				System.out.printf("%2d", cords[i][j]);			
			}
			System.out.println();
		}
		
		for(int[] row : cords) { //�ϥΫK���g�k
		    for(int value : row) {
		        System.out.printf("%2d", value);
		    }
		    System.out.println();
		}
		
		//�G���}�C���D��}�ŧi 
		int arr[][] = new int[2][]; //���B�ͦ���ӯ��ޡA���O�ĤG�ӯ��ިS���ȡA�]����C�����Vnull
		arr[0] = new int[]{1,2,3}; //���Ĥ@�C�إ߰ѦҪ���
		arr[1] = new int[]{1,2}; //���ĤG�C�إ߰ѦҪ���
		 
		/*�]�i�H�p���إ߫D��}�G���}�C
		 * int[][] arr = {
		 * 	{1,2,3},
		 * 	{1,2}
		 * };
		 * */
		
		for(int[] i : arr){
			for (int j : i){
				System.out.printf("%2d", j);
			}
			
			System.out.println();
		}
	}
}
