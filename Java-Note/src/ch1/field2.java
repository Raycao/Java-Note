package ch1;

class human2{ //human������Ӱ��(field)
	
	int height; //�٬����(field)
	int weight; //�٬����(field)
	human2(int height , int weight){ //�إ߫غc���A�w�]���غc���O�S���޼ƪ��A�o��Ҽg���غc���]�t��Ӥ޼ơA���O�����׻P���q
		this.height = height; //�ϥ�this��ܡA�N�~���Ӫ�height�ǤJ���ƭȫ��w��"�o�Ӫ���"��height
		this.weight = weight; //�P�W
	}
}

public class field2 {
	public static void main(String args[]){
		human2 jack = new human2(12,15); //��@�X�W��jack��human����A�@�ֵ����ѼơA��K�غc���ͦ�
		human2 finn = new human2(20,25); //��@�X�W��finn��human����A�@�ֵ����ѼơA��K�غc���ͦ�
		
		
		System.out.printf("jack's height:%d , jack's weight:%d %n",jack.height,jack.weight);
		System.out.printf("finn's height:%d , finn's weight:%d %n",finn.height,finn.weight);
		
	}
}
