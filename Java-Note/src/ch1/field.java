package ch1;
//field�ɮפ���������O�A�@�ӬO���}�]public�^��field���O�A�ҥH�ɮץD�ɦW�����Ofield�A�t�@�ӬO�D���}��human�A�@�ӭ�l�X���i�H���h�����O�w�q�A���u�঳�@�ӬO���}���O�A�B�ɮץD�ɦW�����P���}���O�W�٬ۦP�C



class human{ //human������Ӱ��(field)
	int height; //�٬����(field)
	int weight; //�٬����(field)
}

public class field {
	public static void main(String args[]){
		human jack = new human(); //��@�X�W��jack��human����
		human finn = new human(); //��@�X�W��finn��human����
		
		jack.height = 12; 
		jack.weight = 15;
		
		finn.height = 20;
		finn.weight = 25;
		
		System.out.printf("jack's height:%d , jack's weight:%d %n",jack.height,jack.weight);
		System.out.printf("finn's height:%d , finn's weight:%d %n",finn.height,finn.weight);
		
	}
}
