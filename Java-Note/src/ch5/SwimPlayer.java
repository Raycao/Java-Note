package ch5;

public class SwimPlayer extends Human2 implements Swimmer{
	//SwimPlayer是一個人類，然後具有Swim的行為
	//因此繼承自Human2.java，實作Swimmer介面
	public SwimPlayer(String name) {
        super(name);
    }
    
    @Override
    public void swim() {
        System.out.printf("游泳選手 %s 游泳%n", name);
    }  
}
