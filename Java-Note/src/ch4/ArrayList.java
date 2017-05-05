package ch4;

import java.util.Arrays;

public class ArrayList {
	//用Object[]來宣告矩陣，所以可以放進個型態內容
    private Object[] list;
    private int next;
   
    public ArrayList(int capacity) {
    	//透過此重載建構式來設定矩陣長度
        list = new Object[capacity];
    }

    public ArrayList() {
    	//此建構式，表示若沒有設定長度，預設矩陣長度會給16
        this(16);
    }

    public void add(Object o) {
        if(next == list.length) {
        	//如果矩陣用完，則再做一個新矩陣並加大容量回傳給list
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
