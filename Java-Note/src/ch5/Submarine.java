package ch5;

public class Submarine implements Swimmer {
	////實作Swimmer介面
	private String name;
    public Submarine(String name) {
        this.name = name;
    }    
    public String getName() {
        return name;
    }
    
    //Override介面的方法
    @Override
    public void swim() {
        System.out.printf("潛水艇 %s 潛行%n", name);
    }
}
