package ch14;

import java.util.*;

public class ArrayList_test {
	public static void main(String[] args){
		ArrayList arrayList = new ArrayList ();
        // �[�J���
        System.out.println(arrayList.add("�Ĥ@�����"));
        System.out.println(arrayList.add("�ĤG�����"));
        System.out.println(arrayList.add("�ĤG�����"));
        System.out.println(arrayList.add("�ĤT�����"));
        // ���o��Ƽƶq
        System.out.println(arrayList.size());
        // �P�_�O�_���Y�@�����
        System.out.println(arrayList.contains("�ĤG�����"));
        // �������
        System.out.println(arrayList.remove("�ĤG�����"));
        System.out.println(arrayList.size());
        // �C�X�Ҧ����
        for (int i = 0; i < arrayList.size(); i++) {
                System.out.println(arrayList.get(i));
        }
	}
}
