package ch5;

public class Shark extends Fish {
	   public Shark(String name) {
	       super(name);
	   }
	    @Override
	    public void swim() {
	        System.out.printf("�T�� %s ��a%n", name);
	    }
}