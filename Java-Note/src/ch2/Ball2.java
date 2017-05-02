package ch2;

class Ball2 {
    static final double PI = 3.141596;
    static void doOther() {
        double o = 2 * PI;
    }
   
    static void doSome() {
    	//在static方法區塊中，便可以呼叫同為static資料成員或方法成員
        doOther();
    }
}
