package ch5;

public class SwimPlayer extends Human2 implements Swimmer{
	//SwimPlayer�O�@�ӤH���A�M��㦳Swim���欰
	//�]���~�Ӧ�Human2.java�A��@Swimmer����
	public SwimPlayer(String name) {
        super(name);
    }
    
    @Override
    public void swim() {
        System.out.printf("��a��� %s ��a%n", name);
    }  
}
