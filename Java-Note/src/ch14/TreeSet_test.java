package ch14;

import java.util.*;

public class TreeSet_test {
	public static void main(String[] args){
		TreeSet treeSet = new TreeSet ();
        // �[�J���
        System.out.println(treeSet.add(1));
        System.out.println(treeSet.add(3));
        System.out.println(treeSet.add(3));
        System.out.println(treeSet.add(2));
        System.out.println(treeSet.add(4));
        // ���o��Ƽƶq
        System.out.println(treeSet.size());
        // �P�_�O�_���Y�@�����
        System.out.println(treeSet.contains(1));
        // �������
        System.out.println(treeSet.remove(4));
        // �C�X�Ҧ����
        Iterator iterator = treeSet.iterator();
        while(iterator.hasNext()){
                System.out.println(iterator.next());
        }
	}
}
