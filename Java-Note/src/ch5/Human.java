package ch5;

public class Human implements Swimmer {
	//��@Swimmer����
	private String name;
    public Human(String name) {
        this.name = name;
    } 
    public String getName() {
        return name;
    }
    
    //Override��������k
    @Override
    public void swim() {
        System.out.printf("�H�� %s ��a%n", name);
    }
}
