package ch2;

class Some {
    void someMethod(int i) {
        System.out.println("int 版本被呼叫");
    }
    void someMethod(Integer integer) {
        System.out.println("Integer 版本被呼叫");
    }
}

public class OverloadBoxing {
    public static void main(String[] args) {
        Some s = new Some();
        s.someMethod(1); //這樣會被呼叫的方法是int版本的
        //如果要呼叫到Integer方法的版本，則需要明確定義
        //例如: s.someMethod(new Integer(1));
    }
}