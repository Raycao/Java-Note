package ch1;

public class IntegerArray {
	public static void main(String args[]){
	
	Integer[] scores = new Integer[3]; //���M�O��new�ӫإߪ���A���O���¦���A���P�A�ϥ����O���A��new�|�����Vnull
	
	for(Integer i : scores){ //�L�X�x�}�A�|�o�{�Ҭ�null
		System.out.println(i);
	}
	
	//�]���H�U����U�C�i��Ѧҫ��w
	scores[0] = new Integer(99);
    scores[1] = new Integer(87);
    scores[2] = new Integer(66);
    
    /*�Y�w�g���D�}�C���������n��D�i�H�p�U���
     * Integer[] scores = {new Integer(99), new Integer(87), new Integer(66)};
     * �]�i�H�p�����
     * Integer[] scores = {99, 87, 66};
     */
    
    /*�۰ʸ˽c�g�k
     * scores[0] = 99;
	 * scores[1] = 87;
	 * scores[2] = 66;
     */
    
    for(Integer score : scores) { //�A���L�X�N�|�o�{�A�w���ȤF
        System.out.println(score);
    }
	
	}
}
