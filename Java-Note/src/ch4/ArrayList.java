package ch4;

import java.util.Arrays;

public class ArrayList {
	//��Object[]�ӫŧi�x�}�A�ҥH�i�H��i�ӫ��A���e
    private Object[] list;
    private int next;
   
    public ArrayList(int capacity) {
    	//�z�L�������غc���ӳ]�w�x�}����
        list = new Object[capacity];
    }

    public ArrayList() {
    	//���غc���A��ܭY�S���]�w���סA�w�]�x�}���׷|��16
        this(16);
    }

    public void add(Object o) {
        if(next == list.length) {
        	//�p�G�x�}�Χ��A�h�A���@�ӷs�x�}�å[�j�e�q�^�ǵ�list
            list = Arrays.copyOf(list, list.length * 2);
        }
        list[next++] = o;
    }
    
    public Object get(int index) {
        return list[index];
    }
    
    public int size() {
        return next;
    }
}
