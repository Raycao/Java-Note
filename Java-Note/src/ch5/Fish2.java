package ch5;

public abstract class Fish2 implements Swimmer {
	//�ϥ�implements����r��@����
	protected String name;
    public Fish2(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
    /*
     * ��@��������ؤ覡
     * 1. ��@�w�q����k
     * 2. �~��N��k�Habstract�覡�w�q*/
    //�b���ĥβĤG�ؤ覡
    @Override
    public abstract void swim();
}
