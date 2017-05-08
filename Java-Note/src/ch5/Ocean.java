package ch5;

public class Ocean {
    public static void main(String[] args) {
        
    	//利用多型的方式，這邊用到的是介面的多型
    	//以下類別都有實作Swimmer介面
    	doSwim(new Anemonefish2("尼莫"));
        doSwim(new Shark2("蘭尼"));
        doSwim(new Human("賈斯汀"));
        doSwim(new Submarine("黃色一號"));
    }

    static void doSwim(Swimmer swimmer) {
        swimmer.swim();
    }
}
