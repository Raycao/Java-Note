package ch5;

public class Submarine implements Swimmer {
	////��@Swimmer����
	private String name;
    public Submarine(String name) {
        this.name = name;
    }    
    public String getName() {
        return name;
    }
    
    //Override��������k
    @Override
    public void swim() {
        System.out.printf("����� %s ���%n", name);
    }
}
