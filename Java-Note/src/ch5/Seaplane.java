package ch5;

public class Seaplane implements Flyer, Swimmer {
	//java�i�H��@�ƼƭӤ����A�o���@Flyer�PSwimmer����
	private String name;
    
    public Seaplane(String name) {
        this.name = name;
    }
    
    @Override
    public void fly() {
        System.out.printf("���W���� %s �b��%n", name);
    }

    @Override
    public void swim() {
        System.out.printf("���W���� %s ������%n", name);
    }
}
