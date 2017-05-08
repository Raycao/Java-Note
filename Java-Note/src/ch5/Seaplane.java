package ch5;

public class Seaplane implements Flyer, Swimmer {
	//java可以實作複數個介面，這邊實作Flyer與Swimmer介面
	private String name;
    
    public Seaplane(String name) {
        this.name = name;
    }
    
    @Override
    public void fly() {
        System.out.printf("海上飛機 %s 在飛%n", name);
    }

    @Override
    public void swim() {
        System.out.printf("海上飛機 %s 航行海面%n", name);
    }
}
