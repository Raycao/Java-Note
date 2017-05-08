package ch5;

public class Seaplane2 extends Airplane implements Swimmer {
	//Seaplane是一種飛機，且具有swim行為
	//因此我們讓Seaplane繼承Airplane然後實作Swimmer介面
	public Seaplane2(String name) {
        super(name);
    }
    
    @Override
    public void fly() {
        System.out.print("海上");
        super.fly();
    }

    @Override
    public void swim() {
        System.out.printf("海上飛機 %s 航行海面%n", name);
    }

}
