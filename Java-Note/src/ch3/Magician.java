package ch3;

public class Magician extends Role {  
	////繼承自Role.java
    public void fight() {
    	////原本沒有的方法，新增進來
        System.out.println("魔法攻擊");
    }
    
    public void cure() {
    	////原本沒有的方法，新增進來
        System.out.println("魔法治療");
    }
} 