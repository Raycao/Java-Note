package ch1;

public class OneToHundred { //���1�[��100���U�ؤ覡
	public static void main(String args[]){
		
		/*for(int i = 1; i < 101; i++) {
		    System.out.print(i);
		    if(i != 100) {
		        System.out.print('+');
		    }
		}
		
		*���ؤ覡�]���|�h���o��X�A�]���į���t
		*/
		
		/*for(int i = 1; i < 100; i++) {
			    System.out.printf("%d+", i);
			}
			System.out.println(100);
		 
		 *����k�w�g����\�A���O�]��for�j�鳡�q���L�X�A�]���įण�n
		 */
		
		/*
		String text = "";
		for(int i = 1; i < 100; i++) {
		    text = text + i + '+';
		}
		System.out.println(text + 100);
		
		*�ϥΥH�U��k���걵�r��A�A�@�_�L�X�A�į��W�z��ӳ��n 
		*���O�ϥ�+���r��걵�A�|�@���n�۷s�r��A���W�c�n�۷s���󪺰��D
		*/
		
		//�H�U�覡�ϥ�StrungBuilder�覡�A��append��k�C�|�N�s���n������Ǧ^StringBuilder
		//�ӫD���ϥ�+�@�ˡA���q��÷�s����
		StringBuilder builder = new StringBuilder();
        for (int i = 1; i < 100; i++) {
            builder.append(i).append('+');
        }
        System.out.println(builder.append(100).toString()); //�̫�L�X

	}
}
