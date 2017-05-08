package ch5;

public abstract class Fish {
	protected String name;
    public Fish(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
    //由於swim方法是抽象成員，所以之後繼承的類別要要記得override
    public abstract void swim();
}
