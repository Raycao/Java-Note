package ch5;

public class Helicopter extends Airplane {
    public Helicopter(String name) {
        super(name);
    }
    
    @Override
    public void fly() {
        System.out.printf("���� %s �b��%n", name);
    }
}