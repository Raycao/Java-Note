package ch14;

import java.util.*;

public class TreeMap_test {
	public static void main(String args[]){
		TreeMap treeMap = new TreeMap ();
        // �[�J���
        treeMap.put(1,"�Ĥ@�����");
        treeMap.put(3,"�ĤT�����(�e)");
        treeMap.put(3,"�ĤT�����(��)");
        treeMap.put(2,"�ĤG�����");
        treeMap.put(4,"�ĥ|�����");
        // ���o��Ƽƶq
        System.out.println(treeMap.size());
        // �P�_�O�_���Y�@�����
        System.out.println(treeMap.containsKey(1));
        System.out.println(treeMap.containsValue("�Ĥ@�����"));
        // �������
        System.out.println(treeMap.remove(4));
        // �C�X�Ҧ����
        System.out.println(treeMap.entrySet());

	}
}
