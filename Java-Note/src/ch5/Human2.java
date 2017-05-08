package ch5;

public class Human2 {
	//定義一個普通人類類別，將swim方法拿掉
	//因為並非每個人都會游泳，慧遊的在去時做Swimmer介面
	protected String name;
    
    public Human2(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}
