package ch5;

public class Shark2 extends Fish2{
	public Shark2(String name) {
	       super(name);
	   }
	    @Override
	    public void swim() {
	        System.out.printf("�T�� %s ��a%n", name);
	    }
}
