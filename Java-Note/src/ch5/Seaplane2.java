package ch5;

public class Seaplane2 extends Airplane implements Swimmer {
	//Seaplane�O�@�ح����A�B�㦳swim�欰
	//�]���ڭ���Seaplane�~��Airplane�M���@Swimmer����
	public Seaplane2(String name) {
        super(name);
    }
    
    @Override
    public void fly() {
        System.out.print("���W");
        super.fly();
    }

    @Override
    public void swim() {
        System.out.printf("���W���� %s ������%n", name);
    }

}
