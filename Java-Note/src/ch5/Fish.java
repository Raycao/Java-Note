package ch5;

public abstract class Fish {
	protected String name;
    public Fish(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
    //�ѩ�swim��k�O��H�����A�ҥH�����~�Ӫ����O�n�n�O�ooverride
    public abstract void swim();
}
