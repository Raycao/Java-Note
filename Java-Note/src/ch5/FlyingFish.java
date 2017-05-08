package ch5;

public class FlyingFish extends Fish2 implements Flyer {
	//因為飛魚是一種魚，但又擁有可以飛的行為
	//所以我們繼承Fish2.java然後實作Flyer.java
	
	public FlyingFish(String name) {
        super(name);
    }
    
	//繼承自Fish2.java，當中swim方法要override
    @Override
    public void swim() {
        System.out.println("飛魚游泳");
    }
    //實作至Flyer介面，而fly方法要override
    @Override
    public void fly() {
        System.out.println("飛魚會飛");
    } 

}
