package ch5;

public class Anemonefish2 extends Fish2{
	public Anemonefish2(String name) {
	       super(name);
	   }
	    @Override
	    public void swim() {
	        System.out.printf("�p���� %s ��a%n", name);
	    }
}
