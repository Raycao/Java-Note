package ch5;

public class FlyingFish extends Fish2 implements Flyer {
	//�]�������O�@�س��A���S�֦��i�H�����欰
	//�ҥH�ڭ��~��Fish2.java�M���@Flyer.java
	
	public FlyingFish(String name) {
        super(name);
    }
    
	//�~�Ӧ�Fish2.java�A��swim��k�noverride
    @Override
    public void swim() {
        System.out.println("������a");
    }
    //��@��Flyer�����A��fly��k�noverride
    @Override
    public void fly() {
        System.out.println("�����|��");
    } 

}
