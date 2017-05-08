package ch5;

public abstract class Fish2 implements Swimmer {
	//使用implements關鍵字實作介面
	protected String name;
    public Fish2(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
    /*
     * 實作介面有兩種方式
     * 1. 實作定義的方法
     * 2. 繼續將方法以abstract方式定義*/
    //在此採用第二種方式
    @Override
    public abstract void swim();
}
