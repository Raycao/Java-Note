package ch5;

public class Human implements Swimmer {
	//實作Swimmer介面
	private String name;
    public Human(String name) {
        this.name = name;
    } 
    public String getName() {
        return name;
    }
    
    //Override介面的方法
    @Override
    public void swim() {
        System.out.printf("人類 %s 游泳%n", name);
    }
}
