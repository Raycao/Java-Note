package ch2;

class Other {
    { System.out.println("�����l�϶�"); }
    
    Other() {
        System.out.println("Other() �غc��");
    }
    
    Other(int o) {
        this();
        System.out.println("Other(int o) �غc��");
    }
}

public class ObjectInitialBlock {
    public static void main(String[] args) {
        new Other(1);
    }
}