package ch1;

public class stringtest {
	public static void main(String args[]){
		String name = "justin";                    // �إ�String���
		System.out.println(name);                  // ���justin
		System.out.println(name.length());       // ��ܪ��׬�6
		System.out.println(name.charAt(0));      // ��ܲĤ@�Ӧr��j
		System.out.println(name.toUpperCase()); // ���JUSTIN
	
		char[] cs = {'j', 'u', 's', 't', 'i', 'n'}; //�w�֦��r���}�C
		String name2 = new String(cs); //�Q�Φr���}�C�غc�r��
		char[] cs2 = name.toCharArray(); //�N�r��H�r���}�C���覡�Ǧ^
		
		String name3 = "Justin";
		System.out.println("�A���W�r�O�G" + name3); //�ϥ�+�Ӧ걵�r��
		
		/* �N��J�r���ഫ����������򥻫��A
		Byte.parseByte(number) 		�Nnumber��R��byte���
		Short.parseShort(number) 	�Nnumber��short���
		Integer.parseInt(number) 	�Nnumber��int���
		Long.parseLong(number) 		�Nnumber��long���
		Float.parseFloat(number) 	�Nnumber��float�B�I��
		Double.parseDouble(number) 	�Nnumber��R��double�B�I��
		 */
	}
}
