package ch2;

public class Ball {
	double radius;
	
	void doOther(){}
	
	static void dosome(){
		//�bstatic��k�|�϶�������X�{this����r
		double r = this.radius;
		
		
		
		/*
		 * �b�{���X�����g�F�Y�Ӫ����Ʀ���
		 * ���M�S�����gthis�A���]���t�F�o�Ӫ���Y�������N��
		 * */
		double r2 = radius;
		
		//static��k�ΰ϶����A����I�s�Dstatic��k�ΰ϶�
		doOther();
	}
}
